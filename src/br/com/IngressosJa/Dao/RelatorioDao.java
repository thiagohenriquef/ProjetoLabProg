package br.com.IngressosJa.Dao;

import br.com.IngressosJa.persistencia.Conexao;
import com.mysql.jdbc.Statement;
import java.io.File;
import java.io.IOException;
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
    public static void relatorioUsuarios() throws SQLException, JRException, IOException {
        File dir = new File(".");
        String query = "select login, cpf, senha, nome, if(gerente = 1, 'Sim', 'Não') as gerente from Morador\n" +
                    "union all \n" +
                    "select login, cpf, senha, nome, 'nulo' as gerente from Visitante;";
         
        try{
            Conexao connect = new Conexao();
            Statement st = connect.getSt();
            ResultSet rs = st.executeQuery(query);
            Map Map = new HashMap();
            String file = dir.getCanonicalPath();
            String arq = "\\iReports\\relUsuarios.jasper";
            System.out.println(file+arq);
            JRResultSetDataSource relResult = new JRResultSetDataSource(connect.getSt().getResultSet());
            JasperPrint jpPrint = JasperFillManager.fillReport(file+arq, new HashMap(), relResult);
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

    public static void relatorioEventos() throws JRException, SQLException, IOException {
        File dir = new File(".");
        String query = "select Evento.nomeEvento, Evento.localEvento, Evento.dataEvento, Ingresso.quantidade, "
                        +"Ingresso.precoMor, Ingresso.PrecoVis "
                        +"from Evento, Ingresso "
                        +"where Evento.idEvento=Ingresso.idEvento;";
        try{
            Conexao connect = new Conexao();
            Statement st = connect.getSt();
            ResultSet rs = st.executeQuery(query);
            Map Map = new HashMap();
            String file = dir.getCanonicalPath();
            String arq = "\\iReports\\relEventos.jasper";
            JRResultSetDataSource relResult = new JRResultSetDataSource(connect.getSt().getResultSet());
            JasperPrint jpPrint = JasperFillManager.fillReport(file+arq, new HashMap(), relResult);
            JasperViewer jv = new JasperViewer(jpPrint, false);
            jv.setVisible(true);
            jv.toFront();
        }catch(SQLException e){
            e.printStackTrace();
            throw new SQLException();
        }
    }
}
