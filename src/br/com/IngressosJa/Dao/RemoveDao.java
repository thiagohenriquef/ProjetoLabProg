package br.com.IngressosJa.Dao;

import br.com.IngressosJa.persistencia.Conexao;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;

/**
 *
 * @author thiago
 */
public class RemoveDao {

    public static boolean removeUsuario(String login) {
        
        return false;
    }

    public static boolean removeEvento(String evento) throws Exception {
        try{
            String query = "delete from Evento where nomeEvento='"+evento+"';";
            
            if(EventoDao.updateBD(query)){
                return true;
            }
        }
        catch(Exception e){
            throw new Exception();
        }
        return false;
    }    
}
