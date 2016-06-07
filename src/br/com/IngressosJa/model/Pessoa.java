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
public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String login;
    private String senha;
    private String endereco;
    private String email;
    private long telefone;

    
    public String getNome() {
        return this.nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getCpf() {
        return this.cpf;
    }

    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getLogin() {
        return this.login;
    }

    
    public void setLogin(String login) {
        this.login = login;
    }

    
    public String getSenha() {
        return this.senha;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }

   
    public String getEndereco() {
        return this.endereco;
    }

    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
     public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefone() {
        return this.telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
}
