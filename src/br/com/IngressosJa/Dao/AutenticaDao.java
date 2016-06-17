package br.com.IngressosJa.Dao;

import br.com.IngressosJa.controller.Autentica;
import br.com.IngressosJa.model.Visitante;
import br.com.IngressosJa.persistencia.Conexao;
import com.mysql.jdbc.Statement;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author thiago
 */
public class AutenticaDao {
    Autentica aut;

    public AutenticaDao(Autentica aut) {
        this.aut = aut;
    }

    public AutenticaDao() {
        
    }
    
    public boolean consultarUsuario(String login, String password) throws Exception{
        try{           
            String query = "select login, cpf, senha, nome, gerente from Morador\n" +
                    "union all \n" +
                    "select login, cpf, senha, nome, '-1' as gerente from Visitante;";
            
            Conexao connect = new Conexao();
            Statement st = connect.getSt();
            ResultSet rs = st.executeQuery(query);
            
            if(checaTabelas(rs, login, password)){
                return true;
            }
            rs.close();
            
        }
        catch(Exception e){
            throw new Exception("Erro no Banco de Dados "+e);
        }
        
        return false;
    }
    
    public boolean checaTabelas(ResultSet rs, String login, String password) throws Exception{
        try{
            while(rs.next()){
                String loginBD = rs.getString("login");
                String cpfBD = rs.getString("cpf");
                String senhaBD = rs.getString("senha");
                String nomeBD = rs.getString("nome");
                String gerenteBD = checaGerente(rs.getString("gerente")); 
                
                if(login.equals(cpfBD) && password.equals(senhaBD)){
                    aut.setMorOrVis(gerenteBD);
                    aut.setNomeUser(nomeBD);
                    //JOptionPane.showMessageDialog(null, "Seja bem-vindo "+nomeBD+"!");
                    return true;
                }
            }
        }
        catch(Exception e){
            throw new Exception(e);
        }
        return false;
    }
       
    public String checaGerente(String x){
        try{
            if(x.equals("1")){
                return "1";
            }else if(x.equals("0")){
                return "0";
            }else if(x.equals("-1")){
                return "-1";
            }
        }catch(Exception e){
            //e.printStackTrace();
            return "-1";
        }
        
        return null;
    }
    
}
