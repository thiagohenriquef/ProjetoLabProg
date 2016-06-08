package br.com.IngressosJa.Dao;

import br.com.IngressosJa.controller.Autentica;
import br.com.IngressosJa.persistencia.Conexao;
import com.mysql.jdbc.Statement;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author thiago
 */
public class AutenticaDao {
    
    public static boolean consultarUsuario(String login, String password) throws Exception{
        try{
            int a = 0, b=1;
            String query = "select * from Visitante where cpf="+login+" and senha='"+password+"';";
            String query2 = "select * from Morador where cpf="+login+" and senha='"+password+"';";
            Conexao conect = new Conexao();
            Statement st = conect.getSt();
            
            ResultSet visitanteRes = st.executeQuery(query);
            if(checaTabelas(visitanteRes, login, password)){ 
                Autentica.salvaVisitante(visitanteRes);
                return true;}    
            visitanteRes.close();
            
            ResultSet moradorRes = st.executeQuery(query2);
            if(checaTabelas(moradorRes, login, password)) return true;
            moradorRes.close();
                
        }
        catch(Exception e){
            throw new Exception("Erro no Banco de Dados "+e);
        }
        
        return false;
    }
    
    public static boolean checaTabelas(ResultSet rs, String login, String password) throws Exception{
        try{
            while(rs.next()){
                String cpfBD = rs.getString("cpf");
                String senhaBD = rs.getString("senha");
                String nomeBD = rs.getString("nome");
                
                if(login.equals(cpfBD) && password.equals(senhaBD)){
                    //JOptionPane.showMessageDialog(this, nomeBD);
                    return true;
                }
            }
        }
        catch(Exception e){
            throw new Exception(e);
        }
        return false;
    }
}
