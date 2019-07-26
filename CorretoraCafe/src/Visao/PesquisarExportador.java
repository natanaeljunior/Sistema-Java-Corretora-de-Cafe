/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controladora.CtrlIHC;
import Modelo.Cliente;
import Modelo.Exportador;
import com.mysql.jdbc.SQLError;
import dao.ConexaoHibernate;
import java.sql.SQLException;
import java.sql.SQLTransactionRollbackException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import org.hibernate.HibernateError;
import org.hibernate.HibernateException;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;

public class PesquisarExportador extends javax.swing.JDialog {

    private CtrlIHC ctrlIHC;
    private String janProx;

    public PesquisarExportador(CtrlIHC ctrlIHC, String prox) {
        janProx = prox;
        initComponents();
        this.ctrlIHC = ctrlIHC;
        this.setModal(true);
        setLocationRelativeTo(null);
        preenchertbmcli(0,"");

        if (prox.equals("venda")) {
            btnExcluirExpo.setVisible(false);
            btnSelecionarExpo.setVisible(true);
        }
        if (prox.equals("excluir")) {
            btnExcluirExpo.setVisible(true);
            btnSelecionarExpo.setVisible(false);
        }
         if (prox.equals("alterarCli")) {
            btnExcluirExpo.setVisible(false);
            btnSelecionarExpo.setVisible(true);
          
        }

    }

    public void preenchertbmcli(int indice, String str) {
        try {
            ctrlIHC.getCtrlDominio().listarExportador(tblExpo,indice, str);
        } catch (SQLException ex) {
            Logger.getLogger(PesquisarExportador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popmenuCliente = new javax.swing.JPopupMenu();
        alterar = new javax.swing.JMenuItem();
        excluir = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExpo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        ComboFiltro = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JFormattedTextField();
        btnSelecionarExpo = new javax.swing.JButton();
        btnExcluirExpo = new javax.swing.JButton();

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

        tblExpo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "CNPJ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblExpo.setComponentPopupMenu(popmenuCliente);
        jScrollPane1.setViewportView(tblExpo);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Exportador"));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/buscar.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ComboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Razao Social", "CNPJ" }));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(ComboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltro))
                .addContainerGap())
        );

        btnSelecionarExpo.setText("Selecionar");
        btnSelecionarExpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarExpoActionPerformed(evt);
            }
        });

        btnExcluirExpo.setText("Excluir");
        btnExcluirExpo.addActionListener(new java.awt.event.ActionListener() {
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
                .addComponent(btnSelecionarExpo)
                .addGap(107, 107, 107)
                .addComponent(btnExcluirExpo)
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
                    .addComponent(btnSelecionarExpo)
                    .addComponent(btnExcluirExpo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if (ComboFiltro.getSelectedIndex() == 0) {
            preenchertbmcli(0, "");
        } else if (ComboFiltro.getSelectedIndex() == 1) {
            preenchertbmcli(1, txtFiltro.getText());
        } else if (ComboFiltro.getSelectedIndex() == 2) {
            preenchertbmcli(2, txtFiltro.getText());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboFiltroActionPerformed

        try {
            MaskFormatter mascaraCNPJ = new MaskFormatter("###.###.###/####-##");
            MaskFormatter nulo = new MaskFormatter();

            if (ComboFiltro.getSelectedIndex() == 2) {
                txtFiltro.setFormatterFactory(new DefaultFormatterFactory(mascaraCNPJ));
                txtFiltro.setEnabled(true);
            }
            if (ComboFiltro.getSelectedIndex() == 1) {

                txtFiltro.setFormatterFactory(null);
                txtFiltro.setText(null);
                txtFiltro.setEnabled(true);
            }
            if (ComboFiltro.getSelectedIndex() == 0) {

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

            int linha = tblExpo.getSelectedRow();

            if (linha >= 0) {
                Object obj = (Object) tblExpo.getValueAt(linha, 0);
                try {
                    ctrlIHC.getCtrlDominio().excluirCliente(obj);
                    ((DefaultTableModel) tblExpo.getModel()).removeRow(linha);
                    JOptionPane.showMessageDialog(this, "Registro apagado com Sucesso!");
                } catch (HibernateException ex) {
                    JOptionPane.showMessageDialog(this, "Voce não pode Apagar esse Fornecedor");
                    Logger.getLogger(PesquisarExportador.class.getName()).log(Level.SEVERE, null, ex);
                    setVisible(false);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Voce não pode Apagar esse Fornecedor");
                    Logger.getLogger(PesquisarExportador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


    }//GEN-LAST:event_excluirActionPerformed

    private void btnSelecionarExpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarExpoActionPerformed

        Exportador expoSelecionado;
        int linha = tblExpo.getSelectedRow();
        System.out.println("linha: " + linha);
        if (linha >= 0) {
            expoSelecionado = (Exportador) tblExpo.getValueAt(linha, 0);
            ctrlIHC.setExpoSelecionado(expoSelecionado);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Exportador");
        }


    }//GEN-LAST:event_btnSelecionarExpoActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alterarActionPerformed

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboFiltro;
    private javax.swing.JMenuItem alterar;
    private javax.swing.JButton btnExcluirExpo;
    private javax.swing.JButton btnSelecionarExpo;
    private javax.swing.JMenuItem excluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu popmenuCliente;
    private javax.swing.JTable tblExpo;
    private javax.swing.JFormattedTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
