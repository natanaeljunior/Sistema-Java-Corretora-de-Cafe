/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controladora.CtrlIHC;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.HibernateException;

/**
 *
 * @author junior
 */
public class Principal extends javax.swing.JFrame {

    private CtrlIHC ctrlIHC;

    public JTable getTblAvaliacao() {
        return tblAvaliacao;
    }

    public Principal(CtrlIHC ctrlIHC) {
        initComponents();
        this.ctrlIHC = ctrlIHC;

        // ABRIR CENTRALIZADO
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    public JTable getTblMov() {
        return tblMov;
    }

    public void preenchertblAval() {
        try {
            ctrlIHC.getCtrlDominio().listarAvaliacao(tblAvaliacao,3,null);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void preenchertblMov() {
        try {
            ctrlIHC.getCtrlDominio().listarMovimentacao(tblMov);

        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        popMov = new javax.swing.JPopupMenu();
        excluirMov = new javax.swing.JMenuItem();
        popAval = new javax.swing.JPopupMenu();
        ExcluirAval = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMov = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        BotaoComprar = new javax.swing.JButton();
        BotaoVender = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAvaliacao = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        ExcluirCli = new javax.swing.JMenu();
        CadCli = new javax.swing.JMenuItem();
        AltCli = new javax.swing.JMenu();
        AltCliPF = new javax.swing.JMenuItem();
        AltCliExpo = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        menuEPF = new javax.swing.JMenuItem();
        MenuEExpo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Comprar = new javax.swing.JMenuItem();
        Vender = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        Cafe = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        AtualizaPreco = new javax.swing.JMenuItem();
        HistoricoPreco = new javax.swing.JMenuItem();
        BtnRelatorio = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        excluirMov.setText("Excluir");
        excluirMov.setComponentPopupMenu(popMov);
        excluirMov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirMovActionPerformed(evt);
            }
        });
        popMov.add(excluirMov);

        popAval.setComponentPopupMenu(popAval);

        ExcluirAval.setText("Excluir");
        ExcluirAval.setComponentPopupMenu(popAval);
        ExcluirAval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirAvalActionPerformed(evt);
            }
        });
        popAval.add(ExcluirAval);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimentaçoes"));

        tblMov.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblMov.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Data", "Tipo Movimento", "Cliente", "Sacas", "KG", "Valor Unit.", "Valor Total", "Tipo Café", "Avaliação/ Laudo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMov.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblMov.setComponentPopupMenu(popMov);
        jScrollPane1.setViewportView(tblMov);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        BotaoComprar.setBackground(new java.awt.Color(102, 102, 102));
        BotaoComprar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotaoComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/sacocafe.png"))); // NOI18N
        BotaoComprar.setText("Comprar");
        BotaoComprar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        BotaoComprar.setFocusTraversalPolicyProvider(true);
        BotaoComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoComprarActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoComprar);

        BotaoVender.setBackground(new java.awt.Color(51, 51, 51));
        BotaoVender.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotaoVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/sacocafevenda.png"))); // NOI18N
        BotaoVender.setText("Vender");
        BotaoVender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        BotaoVender.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotaoVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVenderActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoVender);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Avaliações"));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        tblAvaliacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nº Laudo", "Data", "Nº Amostra", "Cliente", "Provador", "Cata", "Tipo Café"
            }
        ));
        tblAvaliacao.setComponentPopupMenu(popAval);
        tblAvaliacao.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tblAvaliacaoComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(tblAvaliacao);

        jPanel2.add(jScrollPane2);

        jMenuBar1.setAlignmentX(0.0F);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ExcluirCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/cli.png"))); // NOI18N
        ExcluirCli.setText("Clientes");
        ExcluirCli.setAlignmentY(0.0F);
        ExcluirCli.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        CadCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/cadCli.png"))); // NOI18N
        CadCli.setText("Cadastrar");
        CadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadCliActionPerformed(evt);
            }
        });
        ExcluirCli.add(CadCli);

        AltCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/altCli.png"))); // NOI18N
        AltCli.setText("Alterar");

        AltCliPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/cli.png"))); // NOI18N
        AltCliPF.setText("Pessoa Fisica");
        AltCliPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltCliPFActionPerformed(evt);
            }
        });
        AltCli.add(AltCliPF);

        AltCliExpo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/lote.png"))); // NOI18N
        AltCliExpo.setText("Exportador");
        AltCliExpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltCliExpoActionPerformed(evt);
            }
        });
        AltCli.add(AltCliExpo);

        ExcluirCli.add(AltCli);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/delCli.png"))); // NOI18N
        jMenu7.setText("Excluir");
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });

        menuEPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/cli.png"))); // NOI18N
        menuEPF.setText("Pessoa Fisica");
        menuEPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEPFActionPerformed(evt);
            }
        });
        jMenu7.add(menuEPF);

        MenuEExpo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/lote.png"))); // NOI18N
        MenuEExpo.setText("Exportador");
        MenuEExpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEExpoActionPerformed(evt);
            }
        });
        jMenu7.add(MenuEExpo);

        ExcluirCli.add(jMenu7);

        jMenuBar1.add(ExcluirCli);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/movi.png"))); // NOI18N
        jMenu2.setText("Movimentação");
        jMenu2.setAlignmentY(0.3F);
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Comprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/Entrada.png"))); // NOI18N
        Comprar.setText("Comprar");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });
        jMenu2.add(Comprar);

        Vender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/Saida.png"))); // NOI18N
        Vender.setText("Vender");
        Vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenderActionPerformed(evt);
            }
        });
        jMenu2.add(Vender);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/avaliacao.png"))); // NOI18N
        jMenu3.setText("Avaliação");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/novo.png"))); // NOI18N
        jMenuItem6.setText("Novo");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/espera.png"))); // NOI18N
        jMenuItem7.setText("Consultar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        Cafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/cafe.png"))); // NOI18N
        Cafe.setText("Café");
        Cafe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CafeMouseClicked(evt);
            }
        });
        Cafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CafeActionPerformed(evt);
            }
        });
        jMenuBar1.add(Cafe);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/preco.png"))); // NOI18N
        jMenu9.setText("Preços");
        jMenu9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jMenu9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu9.setMargin(new java.awt.Insets(0, -1, 0, 0));

        AtualizaPreco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/Atualizar.png"))); // NOI18N
        AtualizaPreco.setText("Atualizar Preços");
        AtualizaPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizaPrecoActionPerformed(evt);
            }
        });
        jMenu9.add(AtualizaPreco);

        HistoricoPreco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/historico.png"))); // NOI18N
        HistoricoPreco.setText("Histórico");
        HistoricoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoricoPrecoActionPerformed(evt);
            }
        });
        jMenu9.add(HistoricoPreco);

        jMenuBar1.add(jMenu9);

        BtnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/img/rela.png"))); // NOI18N
        BtnRelatorio.setText("Relatórios");
        BtnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRelatorioActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Relatorio Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        BtnRelatorio.add(jMenuItem1);

        jMenuBar1.add(BtnRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        ctrlIHC.janelaComprar();
    }//GEN-LAST:event_ComprarActionPerformed

    private void CadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadCliActionPerformed
        ctrlIHC.janelaCadastrarCliente();

    }//GEN-LAST:event_CadCliActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ctrlIHC.janelaPesquisarCliente("novaAval");

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void BotaoComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoComprarActionPerformed
        ctrlIHC.janelaComprar();
    }//GEN-LAST:event_BotaoComprarActionPerformed

    private void BotaoVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVenderActionPerformed
        ctrlIHC.janelaVender();
    }//GEN-LAST:event_BotaoVenderActionPerformed

    private void HistoricoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoricoPrecoActionPerformed
        ctrlIHC.janelaHistorico();
    }//GEN-LAST:event_HistoricoPrecoActionPerformed

    private void AtualizaPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizaPrecoActionPerformed
        ctrlIHC.janelaPreco();
    }//GEN-LAST:event_AtualizaPrecoActionPerformed

    private void VenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VenderActionPerformed
        ctrlIHC.janelaVender();
    }//GEN-LAST:event_VenderActionPerformed

    private void CafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CafeActionPerformed
        ctrlIHC.janelaTipoCafe();
    }//GEN-LAST:event_CafeActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ctrlIHC.janelaConsultarAvaliacao("consultar");
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void CafeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CafeMouseClicked
        ctrlIHC.janelaTipoCafe();
    }//GEN-LAST:event_CafeMouseClicked

    private void tblAvaliacaoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblAvaliacaoComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAvaliacaoComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        preenchertblAval();
        preenchertblMov();
    }//GEN-LAST:event_formComponentShown

    private void AltCliPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltCliPFActionPerformed
        ctrlIHC.janelaPesquisarCliente("cadastrarCli");
        try {
            ctrlIHC.atualizarAval();
            ctrlIHC.atualizarMov();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AltCliPFActionPerformed

    private void AltCliExpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltCliExpoActionPerformed
        ctrlIHC.janelaPesquisarExportador("alterarCli");
        
        try {
            ctrlIHC.atualizarMov();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_AltCliExpoActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void menuEPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEPFActionPerformed
        ctrlIHC.janelaPesquisarCliente("excluir");

    }//GEN-LAST:event_menuEPFActionPerformed

    private void MenuEExpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEExpoActionPerformed
        ctrlIHC.janelaPesquisarExportador("excluir");
    }//GEN-LAST:event_MenuEExpoActionPerformed

    private void excluirMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirMovActionPerformed
        int confirma = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir MOVIMENTACÃO? ");
        if (confirma == 0) {

            int linha = tblMov.getSelectedRow();

            if (linha >= 0) {
                try {
                    Object obj = (Object) tblMov.getValueAt(linha, 0);
                    ctrlIHC.getCtrlDominio().excluirMovimentacao(obj);
                    ctrlIHC.atualizarMov();
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_excluirMovActionPerformed

    private void ExcluirAvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirAvalActionPerformed
        int confirma = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir AVALIAÇÃO? ");
        if (confirma == 0) {

            int linha = tblAvaliacao.getSelectedRow();

            if (linha >= 0) {
                try {
                    Object obj = (Object) tblAvaliacao.getValueAt(linha, 0);
                    ctrlIHC.getCtrlDominio().excluiraAval(obj);
                    ctrlIHC.atualizarAval();
                } catch (SQLException ex) {
                    Logger.getLogger(PesquisarCliente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (HibernateException ex) {
                    JOptionPane.showMessageDialog(this, "Voce não pode Apagar essa Avaliação");
                    Logger.getLogger(PesquisarCliente.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        }
    }//GEN-LAST:event_ExcluirAvalActionPerformed

    private void BtnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRelatorioActionPerformed
        
    }//GEN-LAST:event_BtnRelatorioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            List listacli = ctrlIHC.getCtrlDominio().buscarCliente();
            System.out.println(listacli);
            ctrlIHC.getCtrlDominio().getCtrlRelatorios().relClientes(listacli);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AltCli;
    private javax.swing.JMenuItem AltCliExpo;
    private javax.swing.JMenuItem AltCliPF;
    private javax.swing.JMenuItem AtualizaPreco;
    private javax.swing.JButton BotaoComprar;
    private javax.swing.JButton BotaoVender;
    private javax.swing.JMenu BtnRelatorio;
    private javax.swing.JMenuItem CadCli;
    private javax.swing.JMenu Cafe;
    private javax.swing.JMenuItem Comprar;
    private javax.swing.JMenuItem ExcluirAval;
    private javax.swing.JMenu ExcluirCli;
    private javax.swing.JMenuItem HistoricoPreco;
    private javax.swing.JMenuItem MenuEExpo;
    private javax.swing.JMenuItem Vender;
    private javax.swing.JMenuItem excluirMov;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem menuEPF;
    private javax.swing.JPopupMenu popAval;
    private javax.swing.JPopupMenu popMov;
    private javax.swing.JTable tblAvaliacao;
    private javax.swing.JTable tblMov;
    // End of variables declaration//GEN-END:variables
}
