/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Cliente implements Serializable {

    public int getIdCliente() {
        return idCliente;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    @Column(nullable = false, length = 150)
    private String nomeCompleto;
    @Column(nullable = false)
    private String sexo;
    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String nascimento;
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

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
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

    // COM ID
    public Cliente(int idCliente, String nomeCompleto, String sexo, String cpf, String nascimento, String bairro, String rua, String cep, String estado, String municipio, int numero, String celular, String telFixo, String email) {
        this.idCliente = idCliente;
        this.nomeCompleto = nomeCompleto;
        this.sexo = sexo;
        this.cpf = cpf;
        this.nascimento = nascimento;
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
    
    // SEM ID
    public Cliente(String nomeCompleto, String sexo, String cpf, String nascimento, String bairro, String rua, String cep, String estado, String municipio, int numero, String celular, String telFixo, String email) {
        this.nomeCompleto = nomeCompleto;
        this.sexo = sexo;
        this.cpf = cpf;
        this.nascimento = nascimento;
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
    public Cliente() {
    }

    public Object[] toArray() {

        return new Object[]{this, cpf};

    }

    @Override
    public String toString() {
        return nomeCompleto;
    }

}
