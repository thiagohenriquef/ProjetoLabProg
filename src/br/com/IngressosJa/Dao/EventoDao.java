package br.com.IngressosJa.Dao;

import br.com.IngressosJa.model.Evento;
import br.com.IngressosJa.persistencia.Conexao;
import com.mysql.jdbc.Statement;

public class EventoDao {
    public static boolean persistir(Evento eve) throws Exception{
     try {   
            Conexao conect = new Conexao();
            Statement st = conect.getSt();
            st.execute("insert into evento(nomeEvento, localEvento, dataEvento,)"+ 
            "values('"+eve.getNomeEvento()+"', '"
                      +eve.getLocalEvento()+"','"
                      +eve.getDataEvento()+"');");
            
         }catch (Exception e) {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar Dados!");
        }
        return false;
    }

}