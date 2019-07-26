/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladora;

import Modelo.*;
import Modelo.Avaliacao;

import dao.*;
import java.awt.Component;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;

import javax.swing.table.TableRowSorter;

/**
 *
 * @author 2016122760350
 */
public class CtrlDominio {

    CtrlRelatorios CtrlRelatorios;
    GenericDAO genDao;
    ExpoDao expoDao;
    UsuarioDAO userDao;
    CafeDAO cafeDao;
    CliDAO cliDao;
    PrecoDAO precoDao;
    AvalDao avalDao;

    public CtrlDominio() throws ClassNotFoundException, SQLException {
        CtrlRelatorios = new CtrlRelatorios();
        genDao = new GenericDAO();
        userDao = new UsuarioDAO();
        cafeDao = new CafeDAO();
        cliDao = new CliDAO();
        precoDao = new PrecoDAO();
        avalDao = new AvalDao();
        expoDao = new ExpoDao();
    }

    
    public CtrlRelatorios getCtrlRelatorios() {
        return CtrlRelatorios;
    }
    
    
    
    public  List<Cliente> buscarCliente() throws SQLException {
         List<Cliente> lista;
         lista = genDao.listar(Cliente.class);
    return lista;}
    
    public boolean authLogin(String usuario, String senha) throws SQLException {
        boolean verificaUser = false;
        List<Usuario> luser;
        luser = userDao.buscaUser(usuario);

        if (luser.size() == 0) {
            verificaUser = false;
        } else if (luser.get(0).getNome().equals(usuario) && luser.get(0).getSenha().equals(senha)) {
            verificaUser = true;
        }
        return verificaUser;
    }

    
    
    public String inserirCafe(String nomeCafe) {

        Cafe cafe = new Cafe(nomeCafe);
        cafeDao.inserir(cafe);
        return cafe.toString();
    }

    public void listarCafe(javax.swing.JTable tblCafe) throws SQLException {

        List<Cafe> ListCafe;
        ListCafe = cafeDao.listar(Cafe.class);
        // ZERAR a TABLE
        ((DefaultTableModel) tblCafe.getModel()).setRowCount(0);
        for (Cafe cafe : ListCafe) {
            ((DefaultTableModel) tblCafe.getModel()).addRow(cafe.toArray());
        }
    }

    public void listarCliente(javax.swing.JTable tblCliente, int indice, String str) throws SQLException {

        List<Cliente> ListCliente;
        ListCliente = cliDao.pesquisar(indice, str);
        // ZERAR a TABLE
        ((DefaultTableModel) tblCliente.getModel()).setRowCount(0);
        for (Cliente cliente : ListCliente) {
            ((DefaultTableModel) tblCliente.getModel()).addRow(cliente.toArray());
        }
    }

    public void listarExportador(javax.swing.JTable tblCliente, int indice, String str) throws SQLException {

        List<Exportador> ListExportador;
        ListExportador = expoDao.pesquisar(indice, str);
        // ZERAR a TABLE
        ((DefaultTableModel) tblCliente.getModel()).setRowCount(0);
        for (Exportador expo : ListExportador) {
            ((DefaultTableModel) tblCliente.getModel()).addRow(expo.toArray());
        }
    }

    public void preencherCombo(JComboBox combo, Class classe) {
        List lista;

        try {
            lista = genDao.listar(classe);
            combo.setModel(new DefaultComboBoxModel(lista.toArray()));

        } catch (SQLException ex) {
            combo = null;
        }

    }

    public void excluirCafe(Object obj) throws SQLException {

        genDao.excluir(obj);

    }

    public void excluirCliente(Object obj) throws SQLException {

        genDao.excluir(obj);

    }

    public void inserirCliente(String nomeCompleto, String cpf, String sexo, String nascimento, String celular, String telFixo, String email, String bairro, String rua, String cep, String estado, String municipio, String numero) {

        CtrlIHC ctrlihc;
        Cliente cli = new Cliente(nomeCompleto, sexo, cpf, nascimento, bairro, rua, cep, estado, municipio, Integer.parseInt(numero), celular, telFixo, email);
        cliDao.inserir(cli);
    }

    public void listarPrecoHistorico(JTable tblPreco) throws SQLException {

        List<Historico> ListCliente;
        ListCliente = cliDao.listar(Historico.class);
        // ZERAR a TABLE
        ((DefaultTableModel) tblPreco.getModel()).setRowCount(0);
        for (Historico hist : ListCliente) {
            ((DefaultTableModel) tblPreco.getModel()).addRow(hist.toArray());
        }
    }

    public void inserirCompra(Cliente cliente, int saca, float kg, Cafe tipoCafe, Avaliacao avaliacao, float valorUn, float valorTotal) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        Compra c = new Compra(date, saca, kg, valorUn, valorTotal, cliente, tipoCafe, avaliacao);
        genDao.inserir(c);
    }

    public Avaliacao inserirAvaliacao(String amostra, Cliente cliente, String cata, String provador, Cafe tipoCafe, Date data) {
        int intCata = Integer.parseInt(cata);
        int intAmostra = Integer.parseInt(amostra);
        Avaliacao aval = new Avaliacao(data, intAmostra, provador, intCata, cliente, tipoCafe);
        genDao.inserir(aval);
        return aval;
    }

    public void listarAvaliacao(javax.swing.JTable tblAvaliacao, int indice, String str) throws SQLException {

        List<Avaliacao> ListAvaliacao;
        ListAvaliacao = avalDao.pesquisar(indice, str);
        // ZERAR a TABLE
        ((DefaultTableModel) tblAvaliacao.getModel()).setRowCount(0);
        for (Avaliacao avaliacao : ListAvaliacao) {
            ((DefaultTableModel) tblAvaliacao.getModel()).addRow(avaliacao.toArray());
        }
    }

    public void listarMovimentacao(javax.swing.JTable tblMov) throws SQLException {

        List<Compra> ListCompra;
        ListCompra = genDao.listar(Compra.class);
        List<Venda> ListVenda;
        ListVenda = genDao.listar(Venda.class);
        // ZERAR a TABLE
        ((DefaultTableModel) tblMov.getModel()).setRowCount(0);
        for (Compra compra : ListCompra) {
            ((DefaultTableModel) tblMov.getModel()).addRow(compra.toArray());
        }
        for (Venda venda : ListVenda) {
            ((DefaultTableModel) tblMov.getModel()).addRow(venda.toArray());
        }
        // ORDENA A TABELA COMPRA E VENDA
        TableRowSorter tableSorter = new TableRowSorter(tblMov.getModel());
        tblMov.setRowSorter(tableSorter);
        tableSorter.setSortKeys(Arrays.asList(new RowSorter.SortKey(0, SortOrder.DESCENDING)));

    }

    public void buscarPrecoCafe(JComboBox<String> combo, Class<Cafe> classe, JTextField txtValorAtual) {
        List<Cafe> lista = null;
        try {
            lista = genDao.listar(classe);

            combo.setModel(new DefaultComboBoxModel(lista.toArray()));
            txtValorAtual.setText(Float.toString(lista.get(combo.getSelectedIndex()).getPreco()));
        } catch (SQLException ex) {
            combo = null;

        } catch (Exception e) {
            Component cmpnt = null;
            JOptionPane.showMessageDialog(cmpnt, "Nenhun Tipo de Café encontrado!");

        }
    }

    public void atualizarPrecoCafe(Cafe cafe) throws ClassNotFoundException, SQLException {
        Date datahoraEnvio = new java.sql.Date(System.currentTimeMillis());
        cafeDao.alterar(cafe);
        Historico hist = new Historico(datahoraEnvio, cafe.getPreco(), cafe);
        genDao.inserir(hist);
    }

    public void alterarCafe(Cafe cafe) throws ClassNotFoundException, SQLException {
        cafeDao.alterar(cafe);
    }

    public void alterarCliente(int idCli, String nomeCompleto, String cpf, String sexo, String nascimento, String celular, String telFixo, String email, String bairro, String rua, String cep, String estado, String municipio, String numero) throws ClassNotFoundException, SQLException {
        Cliente cli = new Cliente(idCli, nomeCompleto, sexo, cpf, nascimento, bairro, rua, cep, estado, municipio, Integer.parseInt(numero), celular, telFixo, email);
        cliDao.alterar(cli);
    }

    public void inserirExportador(String razaoSocial, String cnpj, String celular, String telFixo, String email, String bairro, String rua, String cep, String estado, String municipio, String numero) {

        Exportador expo = new Exportador(razaoSocial, cnpj, bairro, rua, cep, estado, municipio, Integer.parseInt(numero), celular, telFixo, email);
        genDao.inserir(expo);
    }

    public void alterarExportador(int idExpo, String razaoSocial, String cnpj, String celular, String telFixo, String email, String bairro, String rua, String cep, String estado, String municipio, String numero) throws ClassNotFoundException, SQLException {
        Exportador expo = new Exportador(idExpo, razaoSocial, cnpj, bairro, rua, cep, estado, municipio, Integer.parseInt(numero), celular, telFixo, email);
        genDao.alterar(expo);
    }

    public void inserirVenda(Exportador expo, int saca, float kg, Cafe tipoCafe, Avaliacao avaliacao, float valorUn, float valorTotal) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        Venda v = new Venda(date, saca, kg, valorUn, valorTotal, expo, tipoCafe, avaliacao);
        genDao.inserir(v);
    }

    public void excluirMovimentacao(Object obj) throws SQLException {
        genDao.excluir(obj);
    }

    public void excluiraAval(Object obj) throws SQLException {
        genDao.excluir(obj);
    }

}
