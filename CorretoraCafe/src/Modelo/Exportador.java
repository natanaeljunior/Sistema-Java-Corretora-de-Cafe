/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controladora.CtrlIHC;
import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Exportador implements Serializable {

    public int getIdExportador() {
        return idExportador;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExportador;
    @Column(nullable = false, length = 150)
    private String razaoSocial;
    @Column(nullable = false)
    private String cnpj;
    // ENDERECO
    @Column(nullable = false)
    private String bairro;
    @Column(nullable = false)
    private String rua;
    @Column(nullable = false)
    private String cep;
    @Column(nullable = false)
    private String estado;
    @Column(nullable = false)
    private String municipio;
    @Column(nullable = false)
    private int numero;
    // CONTATO
    @Column(nullable = false)
    private String celular;
    @Column(nullable = false)
    private String telFixo;
    @Column(nullable = false)
    private String email;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String nomeCompleto) {
        this.razaoSocial = nomeCompleto;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // SEM ID 
    public Exportador(String razaoSocial, String cnpj, String bairro, String rua, String cep, String estado, String municipio, int numero, String celular, String telFixo, String email) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.bairro = bairro;
        this.rua = rua;
        this.cep = cep;
        this.estado = estado;
        this.municipio = municipio;
        this.numero = numero;
        this.celular = celular;
        this.telFixo = telFixo;
        this.email = email;
    }

    // COM ID 
    public Exportador(int idExportador, String razaoSocial, String cnpj, String bairro, String rua, String cep, String estado, String municipio, int numero, String celular, String telFixo, String email) {
        this.idExportador = idExportador;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.bairro = bairro;
        this.rua = rua;
        this.cep = cep;
        this.estado = estado;
        this.municipio = municipio;
        this.numero = numero;
        this.celular = celular;
        this.telFixo = telFixo;
        this.email = email;
    }

    // NENHUM CAMPO
    public Exportador() {
    }

    public Object[] toArray() {

        return new Object[]{this, cnpj};

    }

    @Override
    public String toString() {
        return razaoSocial;
    }
}
