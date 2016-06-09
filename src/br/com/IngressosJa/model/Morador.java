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
    private int codigo;
    /*
        ATIBUTO BOOLEANO QUE DEFINIRÁ SE MORADOR É OU NAO GERENTE, CASO SEJA, ATRIBUIR TRUE
        Somente saberá se é morador ou nao, se caso na tela do cliente acertar o codigo, 1234.
    */
    private byte gerente;
       

    public Morador() {
        this.setCodigo(codigo);
    }
    
    public Morador(String nome, String cpf, byte gerente) {
        super.setNome(nome);
        super.setCpf(cpf);
        this.gerente = gerente;
    }

    public byte getGerente() {
        return gerente;
    }

    public void setGerente(byte gerente) {
        this.gerente = gerente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = 1234;
    }
}
