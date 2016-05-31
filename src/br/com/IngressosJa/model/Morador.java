/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.IngressosJa.model;

/**
 *
 * @author diogo
 */
public class Morador extends Pessoa {
    /*
        ATIBUTO BOOLEANO QUE DEFINIRÁ SE MORADOR É OU NAO GERENTE, CASO SEJA, ATRIBUIR TRUE
        Somente saberá se é morador ou nao, se caso na tela do cliente acertar o codigo, 1234.
    */
    private boolean gerente;

    public Morador() {
    }
    
    
    public boolean isGerente() {
        return this.gerente;
    }

   public void setGerente(boolean gerente) {
        this.gerente = gerente;
    }
}
