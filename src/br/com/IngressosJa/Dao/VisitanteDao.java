package br.com.IngressosJa.Dao;

import br.com.IngressosJa.model.Visitante;
import br.com.IngressosJa.persistencia.Conexao;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author thiago
 */
public class VisitanteDao {
    
    public static boolean persistir(Visitante visitante) throws Exception{
        try{
            String query = "insert into Visitante(cpf,login,nome,senha,endereco,bairro,cidade,Morador_cpf,email,telefone)"+
                    "values('"
                    +visitante.getCpf()+"', '"
                    +visitante.getLogin()+"', '"
                    +visitante.getNome()+"', '"
                    +visitante.getSenha()+"','"
                    +visitante.getEndereco()+"','"
                    +visitante.getBairro()+"','"
                    +visitante.getCidade()+"','"
                    +visitante.getCpfDoMorador()+"','"
                    +visitante.getEmail()+"','"
                    +visitante.getTelefone()+"');";
            
            Conexao conect = new Conexao();
            Statement st = conect.getSt();
            st.execute(query);
            return true;
        }
        catch(SQLException e){
            throw new Exception(e);
        }
    }
    
}
