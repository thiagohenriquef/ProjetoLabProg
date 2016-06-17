package br.com.IngressosJa.controller;

import br.com.IngressosJa.Dao.EventoDao;
import br.com.IngressosJa.model.Evento;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thiago
 */
public class EventoController {

    Autentica aut = new Autentica();
    
    public static boolean persistirEvento(Evento evento) throws Exception {
        if(EventoDao.persistirEvento(evento)){
            if(EventoDao.persistirIngresso(evento)){
                return true;
            }
        }else{
            throw new Exception();
        }
        
        return false;
    }
    
    public static ArrayList<Evento> buscaEventos() throws Exception{
        try{
            return EventoDao.retornaEventos();
        }catch(Exception e){
            throw new Exception();
        }
    }
    
    public static boolean decrementaIngressos(String ingressos, String evento) throws Exception{
        if(EventoDao.decrementaIngressoDao(ingressos, evento)) return true;
        else{
            throw new Exception();
        }
    }
    
    
    public static boolean removeEvento(String evento) throws Exception {
        try {
            if(EventoDao.removeEvento(evento)) return true;
            
        } catch (Exception ex) {
            throw new Exception(ex);
        }
        
        return false;
    }

}
