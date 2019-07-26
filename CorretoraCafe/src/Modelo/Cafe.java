
package Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Cafe implements Serializable {
     @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int cod;
    @Column (nullable = false)
    private String nome;
    @Column (nullable = false)
    private float preco;

    public Cafe(String nome) {
        this.nome = nome;
    }

    public Cafe(int cod, String nome) {
        this.cod = cod;
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Cafe() {
    }
      
   
    
     public Object[] toArray() {
        
        return new Object[] {cod,this};
        
    } 
  @Override
    public String toString() {
        return nome+"";
    }
  
      @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cafe other = (Cafe) obj;
        if (this.cod != other.cod) {
            return false;
        }
        return true;
    }
    
}
