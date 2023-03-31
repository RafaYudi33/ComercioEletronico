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
public class StrategyOrdenacaoB implements OrdenacaoStrategy{
    public ArrayList<Produto> ordenar(ArrayList<Produto> produtos){
        int i;
        int j;
        Produto key ;
        for(j = 1; j < produtos.size(); j++){
            key = produtos.get(j);
            for(i = j -1; (i >=0) && (produtos.get(i).getValor() > key.getValor()); i--){
                produtos.set(i + 1, produtos.get(i));
            }
            produtos.set(i + 1, key);
        }
        
        return produtos;
    };
    
    
}
