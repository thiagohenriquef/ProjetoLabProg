package br.com.IngressosJa.Dao;

import br.com.IngressosJa.persistencia.Conexao;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author thiago
 */
public class RelatorioDao {
    
    public static void relatorioUsuarios() throws SQLException, JRException {
        String query = "select login, cpf, senha, nome, gerente from Morador\n" +
                    "union all \n" +
                    "select login, cpf, senha, nome, 'null' as gerente from Visitante;";
         
        try{
            Conexao connect = new Conexao();
            Statement st = connect.getSt();
            ResultSet rs = st.executeQuery(query);
            Map Map = new HashMap();
            String file = System.getProperty("user.dir") + "file.jasper";
            JRResultSetDataSource relResult = new JRResultSetDataSource(connect.getSt().getResultSet());
            JasperPrint jpPrint = JasperFillManager.fillReport("iReports/relUsuarios.jasper", new HashMap(), relResult);
            JasperViewer jv = new JasperViewer(jpPrint, false);
            jv.setVisible(true);
            jv.toFront();
        }catch(SQLException e){
            throw new SQLException();
        }
    }
    
    public static ResultSet buscaBD(String query) throws SQLException{
        Conexao connect = new Conexao();
        Statement st = connect.getSt();
        ResultSet rs = st.executeQuery(query);
        return rs;
    }

    public static void relatorioEventos() throws JRException, SQLException {
        String query = "select Evento.nomeEvento, Evento.localEvento, Evento.dataEvento, Ingresso.quantidade, "
                        +"Ingresso.precoMor, Ingresso.PrecoVis "
                        +"from Evento, Ingresso "
                        +"where Evento.idEvento=Ingresso.idEvento;";
        try{
            Conexao connect = new Conexao();
            Statement st = connect.getSt();
            ResultSet rs = st.executeQuery(query);
            Map Map = new HashMap();
            String file = System.getProperty("user.dir") + "file.jasper";
            JRResultSetDataSource relResult = new JRResultSetDataSource(connect.getSt().getResultSet());
            JasperPrint jpPrint = JasperFillManager.fillReport("iReports/relEventos.jasper", new HashMap(), relResult);
            JasperViewer jv = new JasperViewer(jpPrint, false);
            jv.setVisible(true);
            jv.toFront();
        }catch(SQLException e){
            e.printStackTrace();
            throw new SQLException();
        }
    }
}
