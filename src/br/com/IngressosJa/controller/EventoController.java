package br.com.IngressosJa.controller;

import br.com.IngressosJa.Dao.EventoDao;
import br.com.IngressosJa.model.Evento;
import java.util.ArrayList;

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

}
