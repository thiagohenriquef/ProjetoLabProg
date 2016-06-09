/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.IngressosJa.Dao;

import br.com.IngressosJa.model.Morador;
import br.com.IngressosJa.persistencia.Conexao;
import com.mysql.jdbc.Statement;

/**
 *
 * @author diogo
 */
public class MoradorDao {
    
    public static boolean persistir(Morador morador) throws Exception{
       
       try{
            String query = "insert into Morador(cpf,email,login,nome,senha,telefone,gerente)"+
                    "values('"
                    +morador.getCpf()+"', '"
                    +morador.getEmail()+"', '"
                    +morador.getLogin()+"', '"
                    +morador.getNome()+"', '"
                    +morador.getSenha()+"','"
                    +morador.getTelefone()+"','"
                    +morador.getGerente()+"');";
            
            Conexao conect = new Conexao();
            Statement st = conect.getSt();
            st.execute(query);
            return true;
            
        }catch(Exception e){
            System.err.println("Ocorreu algum problema");
            e.printStackTrace();
            throw new Exception("Erro ao salvar os Dados!");
        }    
    }
}
