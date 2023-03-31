/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Contexto {
    private OrdenacaoStrategy strategy;
    
    public void setStrategy(OrdenacaoStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void selectContext(String tipoOrdenacao){
        if(tipoOrdenacao.equalsIgnoreCase("A")){
            this.setStrategy(new StrategyOrdenacaoA());
        }
        else {
            this.setStrategy(new StrategyOrdenacaoB());
        }
    }
    
    
    public void executarStrategy(ArrayList<Produto> produtos){
        strategy.ordenar(produtos);
    }
}
