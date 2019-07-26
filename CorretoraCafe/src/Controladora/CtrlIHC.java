package Controladora;

import Modelo.Avaliacao;
import Modelo.Cafe;
import Modelo.Cliente;
import Modelo.Exportador;
import Visao.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CtrlIHC {

    private Cliente cliSelecioando;
    private Exportador expoSelecionado;
    private Avaliacao AvalSelecionado;

    public Avaliacao getAvalSelecionado() {
        return AvalSelecionado;
    }

    public Exportador getExpoSelecionado() {
        return expoSelecionado;
    }

    public void setExpoSelecionado(Exportador expoSelecionado) {
        this.expoSelecionado = expoSelecionado;
    }

    public void setAvalSelecionado(Avaliacao AvalSelecionado) {
        this.AvalSelecionado = AvalSelecionado;
    }

    public Cliente getCliSelecioando() {
        return cliSelecioando;
    }

    public void setCliSelecioando(Cliente cliSelecioando) {
        this.cliSelecioando = cliSelecioando;
    }
    private Principal frmPrinc;
    private Login frmLogin;
    private CadastrarCliente frmCadastrarCliente;
    private PesquisarCliente frmPesquisarCliente;
    private Comprar frmComprar;
    private Vender frmVender;
    private Historico frmHistorico;
    private Preco frmPreco;
    private TipoCafe frmTipoCafe;
    private NovaAvaliacao frmnovaAvaliacao;
    private ConsultarAvaliacao frmConsultarAvaliacao;
    private CtrlDominio ctrlDominio;
    private ConsultarCafe frmConsultarCafe;
    private AlteraCafe frmAlteraCafe;
    private PesquisarExportador frmExportador;

    public CtrlIHC() {
        try {
            frmPrinc = new Principal(this);
            ctrlDominio = new CtrlDominio();
            frmLogin = new Login(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CtrlIHC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CtrlIHC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void authLogin(String usuario, String senha) throws SQLException {

        boolean auth = ctrlDominio.authLogin(usuario, senha);
        if (auth == true) {
            janelaPrincipal();
        } else {
            JOptionPane.showMessageDialog(frmPrinc, "Usuario e Senha Incorreto");
        }

    }

    public void inserircafe(String nomeCafe) {

        String retorno = ctrlDominio.inserirCafe(nomeCafe);
        JOptionPane.showMessageDialog(frmPrinc, "Café " + retorno + " Salvo com sucesso!");

    }

    public void listarCafe(javax.swing.JTable tblCafe) throws SQLException {

        ctrlDominio.listarCafe(tblCafe);
    }

    public void excluirCafe(Object obj) throws SQLException {
        ctrlDominio.excluirCafe(obj);

    }

    public void janelaNovaAvalicao() {
        frmnovaAvaliacao = new NovaAvaliacao(this);
        frmnovaAvaliacao.setVisible(true);

    }

    public void janelaConsultarAvaliacao(String prox) {
        frmConsultarAvaliacao = new ConsultarAvaliacao(this, prox);
        frmConsultarAvaliacao.setVisible(true);

    }

    public void janelaConsultarCafe() {
        frmConsultarCafe = new ConsultarCafe(this);
        frmConsultarCafe.setVisible(true);

    }

    public void AlteraCafe(Cafe cafe) {
        frmTipoCafe.setVisible(false);
        frmAlteraCafe = new AlteraCafe(this, cafe);
        frmAlteraCafe.setVisible(true);

    }

    public void janelaPrincipal() {
        frmPrinc.setVisible(true);
        frmLogin.setVisible(false);

    }

    public void janelaLogin() {
        frmLogin.setVisible(true);

    }

    public void janelaCadastrarCliente() {
        frmCadastrarCliente = new CadastrarCliente(this);
        frmCadastrarCliente.setVisible(true);

    }

    public void janelaPesquisarCliente(String prox) {

        frmPesquisarCliente = new PesquisarCliente(this, prox);
        frmPesquisarCliente.setVisible(true);

    }

    public void janelaPesquisarExportador(String janProx) {
        frmExportador = new PesquisarExportador(this,janProx);
        frmExportador.setVisible(true);
    }

    public void janelaTipoCafe() {
        frmTipoCafe = new TipoCafe(this);
        frmTipoCafe.setVisible(true);

    }

    public void janelaComprar() {
        frmComprar = new Comprar(this);
        frmComprar.setVisible(true);

    }

    public void janelaVender() {
        frmVender = new Vender(this);
        frmVender.setVisible(true);

    }

    public void janelaHistorico() {
        frmHistorico = new Historico(this);
        frmHistorico.setVisible(true);

    }

    public void janelaPreco() {
        frmPreco = new Preco(this);
        frmPreco.setVisible(true);

    }

    public CtrlDominio getCtrlDominio() {
        return ctrlDominio;
    }

    public void atualizarAval() throws SQLException {
        ctrlDominio.listarAvaliacao(frmPrinc.getTblAvaliacao(),3,"");
    }
    
    public void atualizarMov() throws SQLException {
        ctrlDominio.listarMovimentacao(frmPrinc.getTblMov());
    }

    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        CtrlIHC ctrlIHC = new CtrlIHC();
        ctrlIHC.janelaLogin();
    }

}
