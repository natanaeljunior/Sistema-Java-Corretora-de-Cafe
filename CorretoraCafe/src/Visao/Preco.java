/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controladora.CtrlIHC;
import Modelo.Cafe;
import java.awt.Component;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;


public class Preco extends javax.swing.JDialog {

    private CtrlIHC ctrlIHC;
    private Date datahoraEnvio = new java.sql.Date(System.currentTimeMillis());

    public Preco(CtrlIHC ctrlIHC) {
        initComponents();
        this.ctrlIHC = ctrlIHC;
        this.setModal(true);
        setLocationRelativeTo(null);
        preencherCPreco();
    }

    public void preencherCPreco() {
        ctrlIHC.getCtrlDominio().buscarPrecoCafe(comboCafe, Cafe.class,txtValorAtual);
   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboCafe = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtValorAtual = new javax.swing.JTextField();
        btnAtualizaPreco = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNovoValor = new javax.swing.JTextField();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        comboCafe.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                comboCafeComponentShown(evt);
            }
        });
        comboCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCafeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tipo de Café: ");

        txtValorAtual.setEditable(false);
        txtValorAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorAtualActionPerformed(evt);
            }
        });

        btnAtualizaPreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAtualizaPreco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/update.png"))); // NOI18N
        btnAtualizaPreco.setText("Atualizar Preço");
        btnAtualizaPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizaPrecoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Novo Valor / Saca: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Valor Atual / Saca: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValorAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnAtualizaPreco))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboCafe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNovoValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNovoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizaPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizaPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaPrecoActionPerformed
        try {
            Cafe tipoCafe = (Cafe) comboCafe.getSelectedItem();
            String precoAtual = txtValorAtual.getText();
            String precoNovo = txtNovoValor.getText();
            precoAtual = precoAtual.replaceAll(",",".");
            precoNovo = precoNovo.replaceAll(",",".");
            tipoCafe.setPreco(Float.parseFloat(precoNovo));
            
            ctrlIHC.getCtrlDominio().atualizarPrecoCafe(tipoCafe);
            System.out.println(tipoCafe.getCod());
            Component cmpnt = null;
            
            JOptionPane.showMessageDialog(cmpnt, "Preco Alterado com Sucesso! ");
             setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Preco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAtualizaPrecoActionPerformed

    private void comboCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCafeActionPerformed
      
        Cafe c = (Cafe) comboCafe.getSelectedItem();
        txtValorAtual.setText(Float.toString(c.getPreco()));
    }//GEN-LAST:event_comboCafeActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void txtValorAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorAtualActionPerformed

    private void comboCafeComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_comboCafeComponentShown
         ctrlIHC.getCtrlDominio().buscarPrecoCafe(comboCafe, Cafe.class,txtValorAtual);
      
    }//GEN-LAST:event_comboCafeComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizaPreco;
    private javax.swing.JComboBox<String> comboCafe;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtNovoValor;
    private javax.swing.JTextField txtValorAtual;
    // End of variables declaration//GEN-END:variables
}
