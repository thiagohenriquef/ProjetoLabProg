package br.com.IngressosJa.controller;

import br.com.IngressosJa.Dao.AutenticaDao;
import br.com.IngressosJa.model.Morador;
import br.com.IngressosJa.model.Pessoa;
import br.com.IngressosJa.model.Visitante;
import br.com.IngressosJa.view.TelaInicial;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author thiago
 */
public class Autentica {
    TelaInicial tel;
    AutenticaDao autD = new AutenticaDao(this);
    private Visitante vis;
    private Morador mor;
    
    public Autentica() {
    }
    
    public Autentica(TelaInicial tel) {
        this.tel = tel;
    }
    
    public boolean autentica(String login, String password) throws Exception{
        return autD.consultarUsuario(login, password);
    }

    public Visitante getVis() {
        return vis;
    }

    public void setVis(Visitante vis) {
        this.vis = vis;
    }
    

    public Morador getMor() {
        return mor;
    }

    public void setMor(Morador mor) {
        this.mor = mor;
    }
    
    
    public void instanciaUsuario(String cpf, String nome, String gerente) {
        if(gerente.equals("-1")){
            //Visitante vis = new Visitante(nome, cpf);
            //System.err.println("voltou na autentica");
            getVis().setNome(nome);
            getVis().setCpf(cpf);
        }else{
            //Morador mor = new Morador(nome, cpf, Byte.valueOf(gerente));
            getMor().setNome(nome);
            getMor().setCpf(cpf);
            getMor().setGerente(Byte.valueOf(gerente));
        }
    }    
}
