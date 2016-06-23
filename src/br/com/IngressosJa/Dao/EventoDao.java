package br.com.IngressosJa.Dao;

import br.com.IngressosJa.model.Evento;
import br.com.IngressosJa.model.Ingresso;
import br.com.IngressosJa.persistencia.Conexao;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EventoDao {    
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
    
    public static boolean persistirEvento(Evento eve) throws Exception{
     try {  
            String query = "insert into Evento(nomeEvento, localEvento, dataEvento) "
                        +"values('"
                        +eve.getNomeEvento()+"', '"
                        +eve.getLocalEvento()+"','"
                        +eve.getDataEvento()+"');";
            
            if(updateBD(query)) return true;
            
         }catch (SQLException ex){
            throw new Exception("Erro no SQL"+ex);
        }
        
        return false;
    }
    
    public static boolean removeEvento(String evento) throws Exception {
        try{
            String query = "delete from Evento where nomeEvento='"+evento+"';";
            
            if(updateBD(query)){
                return true;
            }
        }
        catch(Exception e){
            throw new Exception();
        }
        return false;
    } 
    
    public static boolean persistirIngresso(Evento eve) throws Exception{
     try {             
            String query = "insert into Ingresso (idEvento, quantidade, precoMor, PrecoVis) "
                    +"values ('"
                    +retornaIdEvento(eve.getNomeEvento())+"', '"
                    +eve.getIngressos().getQuantidadeDeIngresso()+"', '"
                    +eve.getIngressos().getPrecoMor()+"', '"
                    +eve.getIngressos().getPrecoVis()+"');";
            System.err.println(query);
            if (updateBD(query)==true) return true;
         }catch (Exception e) {
            throw new Exception("Erro ao Salvar Dados do Ingresso!");
        }
     return false;
    }
    
    public static int retornaIdEvento(String nome) throws Exception{
        try{
            String query = "Select nomeEvento, idEvento from Evento;";
            ResultSet rs = consultaBD(query);
            while(rs.next()){
                String nomeBD = rs.getString("nomeEvento");
                String id = rs.getString("idEvento");
                
                if(nomeBD.equals(nome)){
                    id = rs.getString("idEvento");
                    //rs.close();
                    return Integer.parseInt(rs.getString("idEvento"));
                }
            }
            
        }
        catch(SQLException e){
            throw new Exception("Erro no BD"+e);
        }    
        return -1;
    }
    
    public static ArrayList<Evento> retornaEvento() throws Exception
    {
        try{
            ArrayList<Evento> nomeEvento = new ArrayList<Evento>();
            String query = "Select * from Evento;";
            ResultSet rs = consultaBD(query);
            
            while(rs.next()){
                String nomeEventoBD = rs.getString("nomeEvento");
                String idEventoBD = rs.getString("idEvento");
                String localEventoBD = rs.getString("localEvento");
                String dataEventoBD = rs.getString("dataEvento");
                
                //ResultSet ing = retornaIngressos(idEventoBD);
                //int quantidadeIngBD = ing.getInt("quantidade");
                //int precoMorBD = ing.getInt("precoMor");
                //int precoVisBD = ing.getInt("precoVis");
  
                //String quantidadeIngBD = retornaQuant(idEventoBD);//ing.getString("quantidade");
                //String precoMorBD = retornaPrecoMor(idEventoBD);//ing.getString("precoMor");
                //String precoVisBD = retornaPrecoVis(idEventoBD);//ing.getString("precoVis");
                //System.out.println(quantidadeIngBD+precoMorBD+precoVisBD);
                
                int quantidadeIngBD = retornaQuant(idEventoBD);
                int precoMorBD = retornaPrecoMor(idEventoBD);
                int precoVisBD = retornaPrecoVis(idEventoBD);
                
                Evento eve = new Evento();
                eve.setIngressos(new Ingresso(precoMorBD, precoVisBD, quantidadeIngBD, 0));
                eve.setNomeEvento(nomeEventoBD);
                eve.setDataEvento(dataEventoBD);
                eve.setLocalEvento(localEventoBD);
                
                nomeEvento.add(eve);
                //ing.close();
            }
            rs.close();
            return nomeEvento;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    
    public static ResultSet retornaIngressos(String id) throws Exception{
        try{
            String query = "Select * from Ingresso where idEvento="+id+";";
            ResultSet rset = consultaBD(query);
            
            while(rset.next()){
                return rset;
                
            }
        }catch(Exception e){
            throw new Exception("Erro na busca dos Ingressos");
        }
        
        return null;
    }

    public static boolean decrementaIngressoDao(String ingressos, String evento) throws SQLException {
        
        String query = "update Ingresso, Evento set Ingresso.quantidade = Ingresso.quantidade-"+ingressos+" "
                + "where Ingresso.idEvento=Evento.idEvento and "
                + "Evento.nomeEvento='"+evento+"';";
       
        if(updateBD(query)) return true;
        else{
            return false;
        }
    }

    private static int retornaQuant(String idEventoBD) throws SQLException {
        int rs = 0;
        String query = "Select quantidade from Ingresso where idEvento="+idEventoBD+";";
        ResultSet result = consultaBD(query);
        
        while(result.next()){
            rs = result.getInt("quantidade");
        }  
        result.close();
        return rs;
    }

    private static  int retornaPrecoMor(String idEventoBD) throws SQLException {
        int rs = 0;
        String query = "Select precoMor from Ingresso where idEvento="+idEventoBD+";";
        ResultSet result = consultaBD(query);
        
        while(result.next()){
            rs = result.getInt("precoMor");
        }  
        result.close();
        return rs;
    }

    private static int retornaPrecoVis(String idEventoBD) throws SQLException {
        int rs = 0;
        String query = "Select precoVis from Ingresso where idEvento="+idEventoBD+";";
        ResultSet result = consultaBD(query);
        
        while(result.next()){
            rs = result.getInt("precoVis");
        }  
        result.close();
        return rs;
    }
}