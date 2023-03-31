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
public class ItemVenda implements Serializable {
    private Produto produto;
    private float valor;
    private int quantidade;

    public ItemVenda() {
    }

    public ItemVenda(Produto produto, float valor, int quantidade) {
        this.produto = produto;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setCodProduto(Produto produto) {
        this.produto = produto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public float calcularValorTotal(){ //a se pensar
        return 0;
    }
    
    
}
