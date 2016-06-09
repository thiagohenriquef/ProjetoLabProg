package br.com.IngressosJa.Dao;

import br.com.IngressosJa.model.Evento;
import br.com.IngressosJa.persistencia.Conexao;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EventoDao {
    public static boolean persistirEvento(Evento eve) throws Exception{
     try {   
            String query = "insert into Evento(nomeEvento, localEvento, dataEvento)"
                        +"values('"
                        +eve.getNomeEvento()+"', '"
                        +eve.getLocalEvento()+"','"
                        +eve.getDataEvento()+"');";
            System.out.println(query);
            Conexao conect = new Conexao();
            Statement st = conect.getSt();
            st.execute(query);
            
            return true;
            
         }/*catch (Exception e) {
            throw new Exception("Erro ao Salvar Dados do Evento!");
        }*/catch (SQLException ex){
            throw new Exception("Erro no SQL"+ex);
        }
        
        //return false;
    }
    
    public static boolean persistirIngresso(Evento eve) throws Exception{
     try {   
            Conexao conect = new Conexao();
            Statement st = conect.getSt();
            st.execute("insert into Ingresso (idEvento, quantidade, precoMor, PrecoVis) "
                    +"values ('"
                    +retornaIdEvento(eve.getNomeEvento())+"', '"
                    +eve.getIngressos().getQuantidadeDeIngresso()+"', '"
                    +eve.getIngressos().getPrecoMor()+"', '"
                    +eve.getIngressos().getPrecoVis()+"');");
            
            return true;
         }catch (Exception e) {
            throw new Exception("Erro ao Salvar Dados do Ingresso!");
        }
    }
    
    public static int retornaIdEvento(String nome) throws Exception{
        try{           
            String query = "Select * from Evento";
            
            Conexao connect = new Conexao();
            Statement st = connect.getSt();
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                String nomeBD = rs.getString("nomeEvento");
                String id = rs.getString("idEvento");
                
                if(nomeBD.equals(nome)){
                    return Integer.parseInt(id);
                }
            }
            
        }
        catch(SQLException e){
            throw new Exception("Erro no BD"+e);
        }
        
        return -1;
    }
}