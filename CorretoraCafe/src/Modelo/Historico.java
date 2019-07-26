/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Vector;
import javax.persistence.*;

@Entity
public class Historico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHistorico;
    @Column(nullable = false)
    private Date data;
    @Column(nullable = false)
    private float valor;
   
    @ManyToOne
    Cafe tipoCafe;

    public Historico(Date data, float valor, Cafe tipoCafe) {
        this.data = data;
        this.valor = valor;
        this.tipoCafe = tipoCafe;
    }

    public Historico() {
    }

    public Object[] toArray() {

        return new Object[]{this.data, this.tipoCafe,this.valor};

    }

    @Override
    public String toString() {
        return data + " - " + valor;
    }

}
