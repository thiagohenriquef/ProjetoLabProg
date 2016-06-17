package br.com.IngressosJa.Dao;

import br.com.IngressosJa.model.Visitante;
import br.com.IngressosJa.persistencia.Conexao;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author thiago
 */
public class VisitanteDao {
    
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
    
    public static boolean persistir(Visitante visitante) throws Exception{
        try{
            String query = "insert into Visitante(cpf,login,nome,senha,endereco,bairro,cidade,Morador_cpf,email,telefone)"+
                    "values('"
                    +visitante.getCpf()+"', '"
                    +visitante.getLogin()+"', '"
                    +visitante.getNome()+"', '"
                    +visitante.getSenha()+"','"
                    +visitante.getEndereco()+"','"
                    +visitante.getBairro()+"','"
                    +visitante.getCidade()+"','"
                    +visitante.getCpfDoMorador()+"','"
                    +visitante.getEmail()+"','"
                    +visitante.getTelefone()+"');";
            
            Conexao conect = new Conexao();
            Statement st = conect.getSt();
            st.execute(query);
            return true;
        }
        catch(SQLException e){
            throw new Exception(e);
        }
    }

    
    public static ArrayList<Visitante> retornaVisitantes() throws Exception {
         try{
            ArrayList<Visitante> nomeVisitante = new ArrayList<Visitante>();
            String query = "Select * from Visitante;";
            ResultSet rs = consultaBD(query);
            
            while(rs.next()){
                String cpfBD = rs.getString("cpf");
                String nomeBD= rs.getString("nome");
                String loginBD = rs.getString("login");
                String cpfVinculadoBD = rs.getString("Morador_cpf");
                
                Visitante vis = new Visitante();
                
                vis.setCpf(cpfBD);
                vis.setNome(nomeBD);
                vis.setLogin(loginBD);
                vis.setCpfDoMorador(cpfVinculadoBD);
                
                nomeVisitante.add(vis);
                }
            rs.close();
            return nomeVisitante;
        }catch(Exception e){
            throw new Exception();
        }
    }
    
    public static boolean removeVisitante(String nome, String cpf) throws Exception{
        try{
            String query = "delete from Visitante where nome='"+nome+"' and cpf='"+cpf+"';";
            
            if(updateBD(query)) return true;
        }catch(Exception e){
            throw new Exception(e);
        }
        return false;
    }
    
}
