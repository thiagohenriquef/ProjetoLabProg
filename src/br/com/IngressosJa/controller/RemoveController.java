package br.com.IngressosJa.controller;

import br.com.IngressosJa.Dao.RemoveDao;


/**
 *
 * @author thiago
 */
public class RemoveController {

    public static boolean removeUsuario(String login) throws Exception {
        try{
            return RemoveDao.removeUsuario(login);
        }catch(Exception e){
            throw new Exception();
        }
    }

    public static boolean removeEvento(String evento) throws Exception {
        try{
            if(RemoveDao.removeEvento(evento)) return true;
        }catch(Exception e){
            throw new Exception();
        }
        return false;
    }
    
}
