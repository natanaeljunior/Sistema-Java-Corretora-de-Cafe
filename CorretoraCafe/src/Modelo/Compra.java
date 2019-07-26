/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Compra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCompra;
    @Column(nullable = false)
    private Date data;
    @Column(nullable = false)
    private int saca;
    @Column(nullable = false)
    private float kg;
    @Column(nullable = false)
    private float valorUn;
    @Column(nullable = false)
    private float valorTotal;

    @ManyToOne(fetch = FetchType.EAGER)
    Cliente cliente;
    @ManyToOne(fetch = FetchType.EAGER)
    Cafe tipCafe;
    @ManyToOne(fetch = FetchType.EAGER)
    Avaliacao avaliacao;

    //construtor com ID
    public Compra(int idCompra, Date data, int saca, float kg, float valorUn, float valorTotal, Cliente cliente, Cafe tipCafe, Avaliacao avaliacao) {
        this.idCompra = idCompra;
        this.data = data;
        this.saca = saca;
        this.kg = kg;
        this.valorUn = valorUn;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.tipCafe = tipCafe;
        this.avaliacao = avaliacao;
    }

    //construtor sem ID
    public Compra(Date data, int saca, float kg, float valorUn, float valorTotal, Cliente cliente, Cafe tipCafe, Avaliacao avaliacao) {
        this.data = data;
        this.saca = saca;
        this.kg = kg;
        this.valorUn = valorUn;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.tipCafe = tipCafe;
        this.avaliacao = avaliacao;
    }

    //construtor vazio
    public Compra() {
    }

    public Compra(Date date, int saca, float kg, float valorUn, float valorTotal) {
        this.data = data;
        this.saca = saca;
        this.kg = kg;
        this.valorUn = valorUn;
        this.valorTotal = valorTotal;

    }

    
    public Object[] toArray() {

        return new Object[]{this,"Compra",cliente,saca, kg, valorUn,valorTotal,tipCafe,avaliacao};

    }

    @Override
    public String toString() {
        return data.toString();
    }
}
