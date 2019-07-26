/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controladora.CtrlIHC;
import Modelo.Avaliacao;
import Modelo.Cafe;
import Modelo.Exportador;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 2016122760350
 */
public class Vender extends javax.swing.JDialog {

    private CtrlIHC ctrlIHC;
    private Exportador expo;
    private Avaliacao aval;

    public Vender(CtrlIHC ctrlIHC) {

        initComponents();
        this.setModal(true);
        this.ctrlIHC = ctrlIHC;
        setLocationRelativeTo(null);
    }
    
     private double calculaValor(Cafe c) {
 
        float kg = (float) spnKg.getValue();
        int sc = (int) spnSaca.getValue();
        double p = c.getPreco();
        double valor = (sc + (kg / 60)) * p;
        
        DecimalFormat df = new DecimalFormat("#.##");
        LabelValorVenda.setText("R$ " + df.format(valor));
     return valor;}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpAvaliacao = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        BuscarCli = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        spnSaca = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        spnKg = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ComboCafe = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        radiosAval = new javax.swing.JRadioButton();
        RadioAval = new javax.swing.JRadioButton();
        PanelAvaliacao = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ComboLaudo = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ComboExpo = new javax.swing.JComboBox<>();
        labelPreco = new javax.swing.JLabel();
        LabelValo = new javax.swing.JLabel();
        LabelValorVenda = new javax.swing.JLabel();
        BtnVender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vender:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        BuscarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/buscar.png"))); // NOI18N
        BuscarCli.setText("Buscar");
        BuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCliActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantidade:");

        spnSaca.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel6.setText("SACAS");

        spnKg.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));

        jLabel7.setText("KG");

        jLabel10.setText("Exportador:");

        jLabel11.setText("Tipo Café:");

        ComboCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCafeActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Avaliação"));

        grpAvaliacao.add(radiosAval);
        radiosAval.setText("Sem avaliação");
        radiosAval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiosAvalActionPerformed(evt);
            }
        });

        grpAvaliacao.add(RadioAval);
        RadioAval.setSelected(true);
        RadioAval.setText("Avaliado");
        RadioAval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioAvalActionPerformed(evt);
            }
        });

        jLabel1.setText("Laudo:");

        ComboLaudo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        ComboLaudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboLaudoActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/avaliacao.png"))); // NOI18N
        jButton7.setText("Buscar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAvaliacaoLayout = new javax.swing.GroupLayout(PanelAvaliacao);
        PanelAvaliacao.setLayout(PanelAvaliacaoLayout);
        PanelAvaliacaoLayout.setHorizontalGroup(
            PanelAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAvaliacaoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboLaudo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
        PanelAvaliacaoLayout.setVerticalGroup(
            PanelAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAvaliacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ComboLaudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radiosAval)
                .addGap(18, 18, 18)
                .addComponent(RadioAval)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PanelAvaliacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiosAval)
                    .addComponent(RadioAval))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        jLabel5.setText("Valor P/ Saca");

        ComboExpo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        ComboExpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboExpoActionPerformed(evt);
            }
        });

        labelPreco.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnSaca, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnKg, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboExpo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(BuscarCli))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarCli)
                    .addComponent(jLabel10)
                    .addComponent(ComboExpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(spnKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnSaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelPreco))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        LabelValo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelValo.setText("Valor da Venda:");

        LabelValorVenda.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        LabelValorVenda.setForeground(new java.awt.Color(51, 51, 255));
        LabelValorVenda.setText("0,00");

        BtnVender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/Saida.png"))); // NOI18N
        BtnVender.setText("Vender");
        BtnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelValo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(BtnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelValo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelValorVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnVender, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCliActionPerformed

        ctrlIHC.janelaPesquisarExportador("venda");

        ComboExpo.removeAllItems();
        expo = ctrlIHC.getExpoSelecionado();
        ComboExpo.addItem(expo.getRazaoSocial());
        ComboExpo.setEnabled(false);
        ctrlIHC.setExpoSelecionado(null);

    }//GEN-LAST:event_BuscarCliActionPerformed

    private void BtnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVenderActionPerformed

        try {
            Exportador exportador = expo;
            int saca = (int) spnSaca.getValue();
            float kg = (float) spnKg.getValue();
            Cafe tipoCafe = (Cafe) ComboCafe.getSelectedItem();
            Avaliacao avaliacao = aval;
            float valorUn = tipoCafe.getPreco();
           float valorTotal = (float) (calculaValor(tipoCafe));
           
            ctrlIHC.getCtrlDominio().inserirVenda(exportador, saca, kg, tipoCafe, avaliacao, valorUn,valorTotal);
            ctrlIHC.atualizarMov();
            Component cmpnt = null;
            JOptionPane.showMessageDialog(cmpnt, "Venda Inserida com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(Vender.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BtnVenderActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
         ctrlIHC.getCtrlDominio().preencherCombo(ComboCafe, Cafe.class);
        ActionEvent evt1 = null;
        ComboCafeActionPerformed(evt1);
    }//GEN-LAST:event_formComponentShown

    private void ComboCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCafeActionPerformed
        Cafe c = (Cafe) ComboCafe.getSelectedItem();
        labelPreco.setText("R$ " + Double.toString(c.getPreco()));

        spnSaca.addChangeListener(e -> {
            ComboCafeActionPerformed(evt);
        });
        spnKg.addChangeListener(e -> {
            ComboCafeActionPerformed(evt);
        });
        calculaValor(c);
    }//GEN-LAST:event_ComboCafeActionPerformed

    private void ComboExpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboExpoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboExpoActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ctrlIHC.janelaConsultarAvaliacao("CAval");
        ComboLaudo.removeAllItems();
        aval = ctrlIHC.getAvalSelecionado();
        ComboLaudo.addItem("Laudo nº" + aval.getNLaudo() + " - Amostra nº" + aval.getnAmostra());
        ComboLaudo.setEnabled(false);
        ctrlIHC.setAvalSelecionado(null);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void ComboLaudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboLaudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboLaudoActionPerformed

    private void RadioAvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioAvalActionPerformed
        if (RadioAval.isSelected()) {
            PanelAvaliacao.setVisible(true);
        }
    }//GEN-LAST:event_RadioAvalActionPerformed

    private void radiosAvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiosAvalActionPerformed

        if (radiosAval.isSelected()) {
            PanelAvaliacao.setVisible(false);
        }
    }//GEN-LAST:event_radiosAvalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVender;
    private javax.swing.JButton BuscarCli;
    private javax.swing.JComboBox<String> ComboCafe;
    private javax.swing.JComboBox<String> ComboExpo;
    private javax.swing.JComboBox<String> ComboLaudo;
    private javax.swing.JLabel LabelValo;
    private javax.swing.JLabel LabelValorVenda;
    private javax.swing.JPanel PanelAvaliacao;
    private javax.swing.JRadioButton RadioAval;
    private javax.swing.ButtonGroup grpAvaliacao;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JRadioButton radiosAval;
    private javax.swing.JSpinner spnKg;
    private javax.swing.JSpinner spnSaca;
    // End of variables declaration//GEN-END:variables

   
}
