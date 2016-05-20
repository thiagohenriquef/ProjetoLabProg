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
public class Visitante extends Pessoa{
    private String cidade;
    private String bairro;
    private String cpfDoMorador;

    
    public String getCidade() {
        return this.cidade;
    }

    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    
    public String getBairro() {
        return this.bairro;
    }

   
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    
    public String getCpfDoMorador() {
        return this.cpfDoMorador;
    }

    
    public void setCpfDoMorador(String cpfDoMorador) {
        this.cpfDoMorador = cpfDoMorador;
    }
}
