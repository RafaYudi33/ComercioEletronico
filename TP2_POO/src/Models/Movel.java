/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public class Movel extends Produto implements Serializable{

    public Movel(int codigo, String nome, String descricao, LocalDate dataFabricacao, float valor, Fabricante fabricante, boolean disponivel) {
        super(codigo, nome, descricao, dataFabricacao, valor, fabricante, disponivel);
    }

    
    @Override
    public float calcularValor(){
        float taxaImposto = (float) 0.0075 * this.valor;//0.75%
        
        return this.valor + taxaImposto;
    }
    
    @Override
    public int compareTo(Produto produtoY){
        if(this.getValor() < produtoY.getValor() ){
            return -1;
        } else if (this.getValor() > produtoY.getValor() ){
            return 1;
        }else{
            return 0;
        }
    }
    
    @Override
    public String toString() {
        return  "\nMovel:" +
                    "\n\tCodigo: " + codigo + 
                    "\n\tNome: " + nome + 
                    "\n\tDescricao: " + descricao + 
                    "\n\tData da Fabricacao: " + dataFabricacao + 
                    "\n\tValor: " + valor + 
                    "\n\tFabricante: " + fabricante + 
                    "\n\tDisponivel: " + ((disponivel)?"Sim":"Nao")+
                    "______________________________";
    }
    
}
