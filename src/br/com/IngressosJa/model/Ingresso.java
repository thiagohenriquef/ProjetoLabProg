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
    
    private int precoMor;
    private int precoVis;
    private int quantidadeDeIngresso;
    private int qntIngressosVen;

    public Ingresso(int precoMor, int precoVis, int quantidadeDeIngresso, int qntIngressosVen) {
        this.precoMor = precoMor;
        this.precoVis = precoVis;
        this.quantidadeDeIngresso = quantidadeDeIngresso;
        this.qntIngressosVen = qntIngressosVen;
    }

    public Ingresso() {
    }
    
    
    
    public int getQntIngressosVen() {
        return this.qntIngressosVen;
    }

    
    public void setQntIngressosVen(int qntIngressosVen) {
        this.qntIngressosVen = qntIngressosVen;
    }
    
    public int getQuantidadeDeIngresso() {
        return this.quantidadeDeIngresso;
    }

    
    public void setQuantidadeDeIngresso(int quantidadeDeIngresso) {
        this.quantidadeDeIngresso = quantidadeDeIngresso;
    }

    public int getPrecoMor() {
        return this.precoMor;
    }

   
    public void setPrecoMor(int precoMor) {
        this.precoMor = precoMor;
    }

   
    public int getPrecoVis() {
        return this.precoVis;
    }

    
    public void setPrecoVis(int precoVis) {
        this.precoVis = precoVis;
    }
}
