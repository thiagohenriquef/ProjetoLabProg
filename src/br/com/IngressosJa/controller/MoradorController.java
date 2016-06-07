/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.IngressosJa.controller;

import br.com.IngressosJa.Dao.MoradorDao;
import br.com.IngressosJa.model.Morador;

/**
 *
 * @author diogo
 */
public class MoradorController {

    public static boolean persistir(Morador morador) throws Exception {
        return MoradorDao.persistir(morador);
    }
    
    public static byte gerente(String value, Morador morador){
        if(Integer.parseInt(value)== morador.getCodigo()){
            return 1;
        }
        else{
            return 0;
        }
    }
}
