/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.IngressosJa.controller;

import br.com.IngressosJa.Dao.VisitanteDao;
import br.com.IngressosJa.model.Visitante;
import java.util.ArrayList;

/**
 *
 * @author diogo
 */
public class VisitanteController {
    public static boolean persistir(Visitante visitante) throws Exception {
        return VisitanteDao.persistir(visitante);
    }

    public static ArrayList<Visitante> buscaVisitantes() throws Exception {
        try{
            return VisitanteDao.retornaVisitantes();
        }catch(Exception e){
            throw new Exception();
        }
    }

    public static boolean removeVisitante(String nome, String cpf) throws Exception {
        try{
            if(VisitanteDao.removeVisitante(nome, cpf)) return true;
        }catch(Exception e){
            throw new Exception(e);
        }
        
        return false;
    }
    
    
}
