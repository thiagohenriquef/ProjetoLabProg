/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.IngressosJa.controller;

import br.com.IngressosJa.Dao.VisitanteDao;
import br.com.IngressosJa.model.Visitante;

/**
 *
 * @author diogo
 */
public class VisitanteController {
    public static boolean persistir(Visitante visitante) throws Exception {
        return VisitanteDao.persistir(visitante);
    }
    
    
}
