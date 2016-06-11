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
    private static String morOrVis;
    private static String nomeUser;
    
    public Autentica() {
    }
    
    public Autentica(TelaInicial tel) {
        this.tel = tel;
    }
    
    public boolean autentica(String login, String password) throws Exception{
        return autD.consultarUsuario(login, password);
    }

    public String getMorOrVis() {
        return morOrVis;
    }

    public void setMorOrVis(String morOrVis) {
        this.morOrVis = morOrVis;
    }
    
    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String aNomeUser) {
        nomeUser = aNomeUser;
    }
    
}
