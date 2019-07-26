/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Temporal;


@Entity
public class Avaliacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nLaudo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    private int nAmostra;
    private String provador;
    private int cata;
    @ManyToOne(fetch = FetchType.EAGER)
    Cliente cli;
    @ManyToOne(fetch = FetchType.EAGER)
    Cafe tipoCafe;

    public int getNLaudo() {
        return nLaudo;
    }

    public void setNLaudo(int nLaudo) {
        this.nLaudo = nLaudo;
    }

    public int getnAmostra() {
        return nAmostra;
    }

    public Avaliacao(int nLaudo, Date data, int nAmostra, String provador, int cata, Cliente cli, Cafe tipoCafe) {
        this.nLaudo = nLaudo;
        this.data = data;
        this.nAmostra = nAmostra;
        this.provador = provador;
        this.cata = cata;
        this.cli = cli;
        this.tipoCafe = tipoCafe;
    }

    public Avaliacao(Date data, int nAmostra, String provador, int cata, Cliente cli, Cafe tipoCafe) {
        this.data = data;
        this.nAmostra = nAmostra;
        this.provador = provador;
        this.cata = cata;
        this.cli = cli;
        this.tipoCafe = tipoCafe;
    }

    public Avaliacao() {
    }

    public Object[] toArray() {

        return new Object[]{this,this.data,this.nAmostra,this.cli,this.provador,this.cata, this.tipoCafe};

    }

    @Override
    public String toString() {
        return nLaudo+"";
    }
}
