/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controladora.CtrlIHC;
import Modelo.Avaliacao;
import Modelo.Cafe;
import Modelo.Cliente;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Comprar extends javax.swing.JDialog {

    private CtrlIHC ctrlIHC;
    private Avaliacao aval;
    private Cliente cli;

    public Comprar(CtrlIHC ctrlIHC) {
        initComponents();
        this.setModal(true);
        this.ctrlIHC = ctrlIHC;
        setLocationRelativeTo(null);
        if (GrupoAvaliacao.getSelection().getMnemonic() == 'S') {
            PanelLaudo.setVisible(false);
        } else {
            PanelLaudo.setVisible(true);
        }

    }

    public double calculaValor(Cafe c) {

        float kg = (float) spnKg.getValue();
        int sc = (int) spnSaca.getValue();
        double p = c.getPreco();
        double valor = (sc + (kg / 60)) * p;

        DecimalFormat df = new DecimalFormat("#.##");
        LabelValorCompra.setText("R$ " + df.format(valor));

        return valor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoAvaliacao = new javax.swing.ButtonGroup();
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
        PanelLaudo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ComboAvaliacao = new javax.swing.JComboBox<>();
        btnBuscarAval = new javax.swing.JButton();
        ComboCli = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        radioSemAval = new javax.swing.JRadioButton();
        RadioAval = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        labelPreco = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelValorCompra = new javax.swing.JLabel();
        btnCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comprar:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        BuscarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/buscar.png"))); // NOI18N
        BuscarCli.setText("Buscar");
        BuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCliActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantidade:");

        spnSaca.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnSaca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setText("SACAS");

        spnKg.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));

        jLabel7.setText("KG");

        jLabel10.setText("Cliente:");

        jLabel11.setText("Tipo Café:");

        ComboCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCafeActionPerformed(evt);
            }
        });

        jLabel1.setText("Laudo:");

        ComboAvaliacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        ComboAvaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAvaliacaoActionPerformed(evt);
            }
        });

        btnBuscarAval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/avaliacao.png"))); // NOI18N
        btnBuscarAval.setText("Buscar");
        btnBuscarAval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAvalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLaudoLayout = new javax.swing.GroupLayout(PanelLaudo);
        PanelLaudo.setLayout(PanelLaudoLayout);
        PanelLaudoLayout.setHorizontalGroup(
            PanelLaudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLaudoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnBuscarAval, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        PanelLaudoLayout.setVerticalGroup(
            PanelLaudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLaudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLaudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ComboAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarAval))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        ComboCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        ComboCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCliActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Avaliação"));

        GrupoAvaliacao.add(radioSemAval);
        radioSemAval.setMnemonic('S');
        radioSemAval.setSelected(true);
        radioSemAval.setText("Sem avaliação");
        radioSemAval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSemAvalActionPerformed(evt);
            }
        });

        GrupoAvaliacao.add(RadioAval);
        RadioAval.setMnemonic('A');
        RadioAval.setText("Avaliado");
        RadioAval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioAvalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioSemAval)
                .addGap(18, 18, 18)
                .addComponent(RadioAval)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioSemAval)
                    .addComponent(RadioAval))
                .addGap(23, 23, 23))
        );

        jLabel5.setText("Valor P/ Saca");

        labelPreco.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PanelLaudo, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 7, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPreco))
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
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ComboCli, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(BuscarCli))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(ComboCafe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarCli)
                    .addComponent(jLabel10)
                    .addComponent(ComboCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(spnKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnSaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelPreco))
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelLaudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Valor da Compra:");

        LabelValorCompra.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        LabelValorCompra.setForeground(new java.awt.Color(51, 51, 255));
        LabelValorCompra.setText("0,00");

        btnCompra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/Entrada.png"))); // NOI18N
        btnCompra.setText("Comprar");
        btnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelValorCompra))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCliActionPerformed

        ctrlIHC.janelaPesquisarCliente("compra");
        ComboCli.removeAllItems();
        cli = ctrlIHC.getCliSelecioando();
        ComboCli.addItem(cli.getNomeCompleto());
        ComboCli.setEnabled(false);
        ctrlIHC.setCliSelecioando(null);

    }//GEN-LAST:event_BuscarCliActionPerformed

    private void RadioAvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioAvalActionPerformed
        if (RadioAval.isSelected()) {
            PanelLaudo.setVisible(true);
        }

    }//GEN-LAST:event_RadioAvalActionPerformed

    private void radioSemAvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSemAvalActionPerformed
        if (radioSemAval.isSelected()) {
            PanelLaudo.setVisible(false);
        }

    }//GEN-LAST:event_radioSemAvalActionPerformed

    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
        try {
            Cliente cliente = cli;
            int saca = (int) spnSaca.getValue();
            float kg = (float) spnKg.getValue();
            Cafe tipoCafe = (Cafe) ComboCafe.getSelectedItem();
            Avaliacao avaliacao = aval;

            float valorUn = tipoCafe.getPreco();
            float valorTotal = (float) (calculaValor(tipoCafe));
            
            ctrlIHC.getCtrlDominio().inserirCompra(cli, saca, kg, tipoCafe, avaliacao, valorUn,valorTotal);
            ctrlIHC.atualizarMov();
            Component cmpnt = null;
            JOptionPane.showMessageDialog(cmpnt, "Compra Inserida com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(Comprar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnCompraActionPerformed

    private void btnBuscarAvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAvalActionPerformed
        ctrlIHC.janelaConsultarAvaliacao("CAval");
        ComboAvaliacao.removeAllItems();
        aval = ctrlIHC.getAvalSelecionado();
        ComboAvaliacao.addItem("Laudo nº" + aval.getNLaudo() + " - Amostra nº" + aval.getnAmostra());
        ComboAvaliacao.setEnabled(false);
        ctrlIHC.setAvalSelecionado(null);

    }//GEN-LAST:event_btnBuscarAvalActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        ctrlIHC.getCtrlDominio().preencherCombo(ComboCafe, Cafe.class);
        ActionEvent evt1 = null;
        ComboCafeActionPerformed(evt1);

    }//GEN-LAST:event_formComponentShown

    private void ComboAvaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAvaliacaoActionPerformed

    }//GEN-LAST:event_ComboAvaliacaoActionPerformed

    private void ComboCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCliActionPerformed

    }//GEN-LAST:event_ComboCliActionPerformed


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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarCli;
    private javax.swing.JComboBox<String> ComboAvaliacao;
    private javax.swing.JComboBox<String> ComboCafe;
    private javax.swing.JComboBox<String> ComboCli;
    private javax.swing.ButtonGroup GrupoAvaliacao;
    private javax.swing.JLabel LabelValorCompra;
    private javax.swing.JPanel PanelLaudo;
    private javax.swing.JRadioButton RadioAval;
    private javax.swing.JButton btnBuscarAval;
    private javax.swing.JButton btnCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JRadioButton radioSemAval;
    private javax.swing.JSpinner spnKg;
    private javax.swing.JSpinner spnSaca;
    // End of variables declaration//GEN-END:variables
}
