package br.com.IngressosJa.controller;

import br.com.IngressosJa.Dao.RelatorioDao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author thiago
 */
public class RelatorioController {
    
    public static void usuarios() throws JRException{
        try {
            RelatorioDao.relatorioUsuarios();
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RelatorioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void eventos() throws JRException, Exception{
        try{
            RelatorioDao.relatorioEventos();
        }catch(SQLException e){
            throw new Exception();
        }
            
    }
}
