/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controladora.CtrlIHC;
import Modelo.Cliente;
import com.mysql.jdbc.SQLError;
import java.sql.SQLException;
import java.sql.SQLTransactionRollbackException;
import java.sql.SQLWarning;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import org.hibernate.HibernateException;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;

public class PesquisarCliente extends javax.swing.JDialog {

    private CtrlIHC ctrlIHC;
    private String janProx;

    public PesquisarCliente(CtrlIHC ctrlIHC, String prox) {
        janProx = prox;
        initComponents();
        this.ctrlIHC = ctrlIHC;
        this.setModal(true);
        setLocationRelativeTo(null);
        preenchertbmcli(0,"");

        if (prox.equals("novaAval")) {
            btnExcluirCliente.setVisible(false);
            btnSelecionarCliente.setVisible(true);
        }
        if (prox.equals("cadastrarCli")) {
            btnExcluirCliente.setVisible(false);
            btnSelecionarCliente.setVisible(true);
        }
        if (prox.equals("excluir")) {
            btnExcluirCliente.setVisible(true);
            btnSelecionarCliente.setVisible(false);
        }

    }

    public void preenchertbmcli(int indice, String str) {
        try {
            ctrlIHC.getCtrlDominio().listarCliente(tblCliente, indice, str);
        } catch (SQLException ex) {
            Logger.getLogger(PesquisarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popmenuCliente = new javax.swing.JPopupMenu();
        alterar = new javax.swing.JMenuItem();
        excluir = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        PesqCli = new javax.swing.JButton();
        ComboFiltro = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JFormattedTextField();
        btnSelecionarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();

        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });
        popmenuCliente.add(alterar);

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        popmenuCliente.add(excluir);

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.setComponentPopupMenu(popmenuCliente);
        jScrollPane1.setViewportView(tblCliente);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Cliente"));

        PesqCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/buscar.png"))); // NOI18N
        PesqCli.setText("Buscar");
        PesqCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesqCliActionPerformed(evt);
            }
        });

        ComboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Nome", "CPF" }));
        ComboFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboFiltroActionPerformed(evt);
            }
        });

        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(ComboFiltro, 0, 92, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(PesqCli)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PesqCli)
                            .addComponent(ComboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtFiltro)))
                .addContainerGap())
        );

        btnSelecionarCliente.setText("Selecionar");
        btnSelecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarClienteActionPerformed(evt);
            }
        });

        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(btnSelecionarCliente)
                .addGap(107, 107, 107)
                .addComponent(btnExcluirCliente)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionarCliente)
                    .addComponent(btnExcluirCliente))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PesqCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesqCliActionPerformed
        if (ComboFiltro.getSelectedIndex() == 0) {
            preenchertbmcli(0, "");
        } else if (ComboFiltro.getSelectedIndex() == 1) {
            preenchertbmcli(1, txtFiltro.getText());
        } else if (ComboFiltro.getSelectedIndex() == 2) {
            preenchertbmcli(2, txtFiltro.getText());
        }

    }//GEN-LAST:event_PesqCliActionPerformed

    private void ComboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboFiltroActionPerformed
       
        try {
            MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
            MaskFormatter nulo = new MaskFormatter();
            
            if (ComboFiltro.getSelectedIndex()==2){
                txtFiltro.setFormatterFactory(new DefaultFormatterFactory(mascaraCPF));
                txtFiltro.setEnabled(true);
            }
            if (ComboFiltro.getSelectedIndex()==1){
                
               txtFiltro.setFormatterFactory(null);
               txtFiltro.setText(null);
                txtFiltro.setEnabled(true);
            }
            if (ComboFiltro.getSelectedIndex()==0){
                
               txtFiltro.setFormatterFactory(null);
               txtFiltro.setText(null);
               txtFiltro.setEnabled(false);
            }
            
            
        } catch (ParseException ex) {
            Logger.getLogger(PesquisarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ComboFiltroActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        int confirma = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir? ");
        if (confirma == 0) {

            int linha = tblCliente.getSelectedRow();

            if (linha >= 0) {
                Object obj = (Object) tblCliente.getValueAt(linha, 0);
                try {
                    ctrlIHC.getCtrlDominio().excluirCliente(obj);
                    ((DefaultTableModel) tblCliente.getModel()).removeRow(linha);
                    JOptionPane.showMessageDialog(this, "Registro apagado com Sucesso!");
                } catch (SQLException ex) {
                    Logger.getLogger(PesquisarCliente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (HibernateException ex) {
                    JOptionPane.showMessageDialog(this, "Voce não pode Apagar esse Cliente");
                    Logger.getLogger(PesquisarCliente.class.getName()).log(Level.SEVERE, null, ex);

                }

            }
        }

    }//GEN-LAST:event_excluirActionPerformed

    private void btnSelecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarClienteActionPerformed

        Cliente cliSelecionado;
        int linha = tblCliente.getSelectedRow();
        System.out.println("linha: " + linha);
        if (linha >= 0) {
            cliSelecionado = (Cliente) tblCliente.getValueAt(linha, 0);
            ctrlIHC.setCliSelecioando(cliSelecionado);
            setVisible(false);
            if (janProx == "cadastrarCli") {
                ctrlIHC.janelaCadastrarCliente();
            } else if (janProx == "vender") {
                ctrlIHC.janelaVender();
            } else if (janProx == "novaAval") {
                try {
                    ctrlIHC.janelaNovaAvalicao();
                    ctrlIHC.atualizarAval();
                } catch (SQLException ex) {
                    Logger.getLogger(PesquisarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecione um cliente" + linha);
        }


    }//GEN-LAST:event_btnSelecionarClienteActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alterarActionPerformed

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboFiltro;
    private javax.swing.JButton PesqCli;
    private javax.swing.JMenuItem alterar;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnSelecionarCliente;
    private javax.swing.JMenuItem excluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu popmenuCliente;
    private javax.swing.JTable tblCliente;
    private javax.swing.JFormattedTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
