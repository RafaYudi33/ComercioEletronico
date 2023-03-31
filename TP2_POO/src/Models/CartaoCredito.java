/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author Lucas
 */
public class CartaoCredito extends Pagamento implements Serializable{
    private String nome;
    private String bandeira;
    private String numero;
    
    public CartaoCredito(int codigoNota) {
        super(codigoNota);
     }

    public CartaoCredito(String nome, String bandeira, String numero, int codigoNota) {
        super(codigoNota);
        this.nome = nome;
        this.bandeira = bandeira;
        this.numero = numero;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    
    @Override
    public String toString(){
        return  "\nCartao:" +
                "\n\tNome: " + this.nome +
                "\n\tBandeira: " + this.bandeira +
                "\n\tNumero: " + this.numero;
    }
    
    
}
