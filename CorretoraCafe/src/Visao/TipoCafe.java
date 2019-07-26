/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controladora.CtrlIHC;
import Modelo.Cafe;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TipoCafe extends javax.swing.JDialog {

    private CtrlIHC ctrlIHC;

    public TipoCafe(CtrlIHC ctrlIHC) {

        initComponents();
        this.ctrlIHC = ctrlIHC;
        this.setModal(true);
        setLocationRelativeTo(null);

        preencherTBL();

    }

    public void preencherTBL() {
        try {
            ctrlIHC.listarCafe(TableCafe);
        } catch (SQLException ex) {
            Logger.getLogger(TipoCafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popmenuCafe = new javax.swing.JPopupMenu();
        Alterar = new javax.swing.JMenuItem();
        Excluir = new javax.swing.JMenuItem();
        popmenuCliente = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        btnAddCafe = new javax.swing.JButton();
        txtCafe = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCafe = new javax.swing.JTable();

        popmenuCafe.setComponentPopupMenu(popmenuCafe);

        Alterar.setText("Alterar");
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });
        popmenuCafe.add(Alterar);

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        popmenuCafe.add(Excluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Café:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        btnAddCafe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/Entrada.png"))); // NOI18N
        btnAddCafe.setText("Adicionar");
        btnAddCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCafeActionPerformed(evt);
            }
        });

        txtCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCafeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Nome ");

        TableCafe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Nome"
            }
        ));
        TableCafe.setComponentPopupMenu(popmenuCafe);
        TableCafe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCafeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableCafe);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddCafe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCafe)
                    .addComponent(jLabel10))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCafeActionPerformed
        String nomeCafe = txtCafe.getText();

        ctrlIHC.inserircafe(nomeCafe);
        try {
            ctrlIHC.listarCafe(TableCafe);
        } catch (SQLException ex) {
            Logger.getLogger(TipoCafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddCafeActionPerformed

    private void TableCafeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCafeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TableCafeMouseClicked

    private void txtCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCafeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCafeActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        int confirma = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir? ");
        if (confirma == 0) {

            int linha = TableCafe.getSelectedRow();

            if (linha >= 0) {
                Object obj = (Object) TableCafe.getValueAt(linha, 0);
                try {
                    ctrlIHC.excluirCafe(obj);
                } catch (SQLException ex) {
                    Logger.getLogger(TipoCafe.class.getName()).log(Level.SEVERE, null, ex);
                }
                ((DefaultTableModel) TableCafe.getModel()).removeRow(linha);
                JOptionPane.showMessageDialog(this, "Registro apagado com Sucesso!");
            } else {

            }
        }

    }//GEN-LAST:event_ExcluirActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
       int linha = TableCafe.getSelectedRow();

            if (linha >= 0) {
                Cafe obj = (Cafe) TableCafe.getValueAt(linha, 1);
                ctrlIHC.AlteraCafe(obj);
                

            }
    }//GEN-LAST:event_AlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Alterar;
    private javax.swing.JMenuItem Excluir;
    private javax.swing.JTable TableCafe;
    private javax.swing.JButton btnAddCafe;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu popmenuCafe;
    private javax.swing.JPopupMenu popmenuCliente;
    private javax.swing.JTextField txtCafe;
    // End of variables declaration//GEN-END:variables
}
