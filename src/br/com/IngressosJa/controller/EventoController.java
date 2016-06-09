package br.com.IngressosJa.controller;

import br.com.IngressosJa.Dao.EventoDao;
import br.com.IngressosJa.model.Evento;

/**
 *
 * @author thiago
 */
public class EventoController {
    public static boolean persistirEvento(Evento evento) throws Exception {
        if(EventoDao.persistirEvento(evento)){
            if(EventoDao.persistirIngresso(evento)){
                return true;
            }
        }else{
            throw new Exception();
        }
        
        return false;
        //return EventoDao.persistirEvento(evento);
    }
}
