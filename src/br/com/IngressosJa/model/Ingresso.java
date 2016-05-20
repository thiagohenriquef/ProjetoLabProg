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
public class Ingresso {
    private int preco1mor;
    private int preco2mor;
    private int preco3mor;
    private int preco1vis;
    private int preco2vis;
    private int preco3vis;
    private int quantidadeDeIngresso;

    
    public int getPreco1mor() {
        return this.preco1mor;
    }

    
    public void setPreco1mor(int preco1mor) {
        this.preco1mor = preco1mor;
    }

    
    public int getPreco2mor() {
        return this.preco2mor;
    }

    
    public void setPreco2mor(int preco2mor) {
        this.preco2mor = preco2mor;
    }

    
    public int getPreco3mor() {
        return this.preco3mor;
    }

    
    public void setPreco3mor(int preco3mor) {
        this.preco3mor = preco3mor;
    }

    
    public int getPreco1vis() {
        return this.preco1vis;
    }

   
    public void setPreco1vis(int preco1vis) {
        this.preco1vis = preco1vis;
    }

   
    public int getPreco2vis() {
        return this.preco2vis;
    }

    
    public void setPreco2vis(int preco2vis) {
        this.preco2vis = preco2vis;
    }

   
    public int getPreco3vis() {
        return this.preco3vis;
    }

    public void setPreco3vis(int preco3vis) {
        this.preco3vis = preco3vis;
    }

   
    public int getQuantidadeDeIngresso() {
        return this.quantidadeDeIngresso;
    }

    
    public void setQuantidadeDeIngresso(int quantidadeDeIngresso) {
        this.quantidadeDeIngresso = quantidadeDeIngresso;
    }
}
