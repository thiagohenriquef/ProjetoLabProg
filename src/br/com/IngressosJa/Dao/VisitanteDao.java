/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.IngressosJa.Dao;

import br.com.IngressosJa.model.Visitante;
import br.com.IngressosJa.persistencia.Conexao;
import com.mysql.jdbc.Statement;

/**
 *
 * @author diogo
 */
public class VisitanteDao {
    public static boolean persistir(Visitante visitante) throws Exception{
       
       try{
            String query = "insert into visitante(cpf,email,login,nome,senha,endereco,bairro,cidade,Morador_cpf,telefone)"+
                    "values('"
                    +visitante.getCpf()+"', '"
                    +visitante.getEmail()+"', '"
                    +visitante.getLogin()+"', '"
                    +visitante.getNome()+"', '"
                    +visitante.getSenha()+"','"
                    +visitante.getEndereco()+"','"
                    +visitante.getBairro()+"','"
                    +visitante.getCidade()+"','"
                    +visitante.getCpfDoMorador()+"','"
                    +visitante.getTelefone()+"');";
            
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
