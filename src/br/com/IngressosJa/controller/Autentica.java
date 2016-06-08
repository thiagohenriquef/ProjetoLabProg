package br.com.IngressosJa.controller;

import br.com.IngressosJa.Dao.AutenticaDao;
import br.com.IngressosJa.model.Morador;
import br.com.IngressosJa.model.Visitante;
import br.com.IngressosJa.view.TelaInicial;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author thiago
 */
public class Autentica {
    static Visitante visitante = new Visitante();
    static Morador morador;
    
    
    public static boolean autentica(String login, String password) throws Exception{
        return AutenticaDao.consultarUsuario(login, password);
    }
    
    public static void salvaVisitante(ResultSet rs) throws SQLException{
       morador.setNome(rs.getString("nome"));
       
    }

    
}
