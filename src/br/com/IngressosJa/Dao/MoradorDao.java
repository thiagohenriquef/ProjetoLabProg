/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.IngressosJa.Dao;

import br.com.IngressosJa.model.Morador;
import br.com.IngressosJa.persistencia.Conexao;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author diogo
 */
public class MoradorDao {
    
    public static ResultSet consultaBD(String query) throws SQLException{
        Conexao connect = new Conexao();
        Statement st = connect.getSt();
        ResultSet rs = st.executeQuery(query);
        return rs;
    }
    
    public static boolean insereBD(String query) throws SQLException{
        try{
            Conexao connect = new Conexao();
            Statement st = connect.getSt();
            st.executeQuery(query);
            return true;
        }catch(SQLException e){
            throw new SQLException(e);
        }
    }
    
    public static boolean updateBD(String query) throws SQLException{
        try{
            Conexao connect = new Conexao();
            Statement st = connect.getSt();
            st.executeUpdate(query);
            return true;
        }catch(SQLException e){
            throw new SQLException(e);
        }
    }
    
    public static boolean persistir(Morador morador) throws Exception{
       
       try{
            String query = "insert into Morador(cpf,email,login,nome,senha,telefone,gerente)"+
                    "values('"
                    +morador.getCpf()+"', '"
                    +morador.getEmail()+"', '"
                    +morador.getLogin()+"', '"
                    +morador.getNome()+"', '"
                    +morador.getSenha()+"','"
                    +morador.getTelefone()+"','"
                    +morador.getGerente()+"');";
            
            if(updateBD(query)) return true;
            
        }catch(Exception e){
            System.err.println("Ocorreu algum problema");
            e.printStackTrace();
            throw new Exception("Erro ao salvar os Dados!");
        }
       return false;
    }

    public static ArrayList<Morador> retornaMoradores() throws Exception {
         try{
            ArrayList<Morador> nomeMorador = new ArrayList<Morador>();
            String query = "Select * from Morador;";
            ResultSet rs = consultaBD(query);
            
            while(rs.next()){
                String cpfBD = rs.getString("cpf");
                String emailBD = rs.getString("email");
                String nomeBD = rs.getString("nome");
                String loginBD = rs.getString("login");
                int telefoneBD = rs.getInt("telefone");
                byte gerenteBD = rs.getByte("gerente");
                
                Morador mor = new Morador();
                mor.setCpf(cpfBD);
                mor.setEmail(emailBD);
                mor.setNome(nomeBD);
                mor.setLogin(loginBD);
                mor.setTelefone(telefoneBD);
                mor.setGerente(gerenteBD);
                
                nomeMorador.add(mor);
                }
            rs.close();
            return nomeMorador;
        }catch(Exception e){
            throw new Exception();
        }
    }
    
    public static boolean removeMorador(String nome, String cpf) throws Exception{
        try{
            String query = "delete from Morador where nome='"+nome+"' and cpf='"+cpf+"';";
            
            if(updateBD(query)) return true;
        }catch(Exception e){
            throw new Exception(e);
        }
        return false;
    }
    
}
