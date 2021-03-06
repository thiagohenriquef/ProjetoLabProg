/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.IngressosJa.view;

import br.com.IngressosJa.controller.VisitanteController;
import br.com.IngressosJa.model.Visitante;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diogo
 */
public class TelaCadastroVisitante extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroVisitante
     */
    public TelaCadastroVisitante() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCadastroCpfMorV = new javax.swing.JTextField();
        jCadastroLoginV = new javax.swing.JTextField();
        jCadastroCidadeV = new javax.swing.JTextField();
        jCadastroBairroV = new javax.swing.JTextField();
        jCadastroEnderecoV = new javax.swing.JTextField();
        jCadastroCpfV = new javax.swing.JTextField();
        jCadastroNomeV = new javax.swing.JTextField();
        jCadastroSairVisButton = new javax.swing.JButton();
        jCadastroVisitanteButton = new javax.swing.JButton();
        jCadastroSenhaV = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jCadastroEmailV = new javax.swing.JTextField();
        jCadastroTeleV = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Visitantes");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Endereço:");

        jLabel5.setText("Login:");

        jLabel6.setText("Senha:");

        jLabel7.setText("CPF do Morador:");

        jLabel8.setText("Bairro:");

        jLabel9.setText("Cidade:");

        jCadastroBairroV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroBairroVActionPerformed(evt);
            }
        });

        jCadastroSairVisButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancel Red Button.png"))); // NOI18N
        jCadastroSairVisButton.setText("Sair");
        jCadastroSairVisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroSairVisButtonActionPerformed(evt);
            }
        });

        jCadastroVisitanteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Clear Green Button.png"))); // NOI18N
        jCadastroVisitanteButton.setText("Cadastrar");
        jCadastroVisitanteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroVisitanteButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("E-mail: ");

        jLabel11.setText("Telefone:");

        jCadastroEmailV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroEmailVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(60, 60, 60)
                        .addComponent(jCadastroTeleV))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCadastroEmailV, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jCadastroCpfV, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(jCadastroEnderecoV, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCadastroBairroV, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCadastroCidadeV, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCadastroLoginV, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCadastroCpfMorV, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCadastroNomeV)
                                .addComponent(jCadastroSenhaV)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCadastroVisitanteButton)
                        .addGap(18, 18, 18)
                        .addComponent(jCadastroSairVisButton)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(303, 303, 303))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jCadastroNomeV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jCadastroCpfV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCadastroEnderecoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jCadastroBairroV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jCadastroCidadeV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jCadastroLoginV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCadastroSenhaV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jCadastroCpfMorV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jCadastroEmailV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jCadastroTeleV, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCadastroVisitanteButton)
                    .addComponent(jCadastroSairVisButton))
                .addGap(27, 27, 27))
        );

        jMenuArquivo.setText("Arquivo");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemSair);

        jMenuBar1.add(jMenuArquivo);

        jMenuAjuda.setText("Ajuda");

        jMenuItemSobre.setText("Sobre");
        jMenuAjuda.add(jMenuItemSobre);

        jMenuBar1.add(jMenuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCadastroBairroVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroBairroVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCadastroBairroVActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jCadastroSairVisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroSairVisButtonActionPerformed
        dispose();
    }//GEN-LAST:event_jCadastroSairVisButtonActionPerformed

    private void jCadastroVisitanteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroVisitanteButtonActionPerformed
       try {
            Visitante visitante = new Visitante();
            visitante.setNome(jCadastroNomeV.getText());
            visitante.setCpf(jCadastroCpfV.getText());
            visitante.setEndereco(jCadastroEnderecoV.getText());
            visitante.setBairro(jCadastroBairroV.getText());
            visitante.setCidade(jCadastroCidadeV.getText());
            visitante.setEmail(jCadastroEmailV.getText());
            visitante.setTelefone(Integer.parseInt(jCadastroTeleV.getText()));
            visitante.setLogin(jCadastroLoginV.getText());
            visitante.setSenha(String.valueOf(jCadastroSenhaV.getPassword()));
            visitante.setCpfDoMorador(jCadastroCpfMorV.getText());
            
            if(VisitanteController.persistir(visitante)==true){
                JOptionPane.showMessageDialog(this, "Visitante cadastrado com sucesso");
                dispose();
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocorreu um erro!!\nPor favor, verifique o CPF do morador que foi informado");
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_jCadastroVisitanteButtonActionPerformed

    private void jCadastroEmailVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroEmailVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCadastroEmailVActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroVisitante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jCadastroBairroV;
    private javax.swing.JTextField jCadastroCidadeV;
    private javax.swing.JTextField jCadastroCpfMorV;
    private javax.swing.JTextField jCadastroCpfV;
    private javax.swing.JTextField jCadastroEmailV;
    private javax.swing.JTextField jCadastroEnderecoV;
    private javax.swing.JTextField jCadastroLoginV;
    private javax.swing.JTextField jCadastroNomeV;
    private javax.swing.JButton jCadastroSairVisButton;
    private javax.swing.JPasswordField jCadastroSenhaV;
    private javax.swing.JTextField jCadastroTeleV;
    private javax.swing.JButton jCadastroVisitanteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
