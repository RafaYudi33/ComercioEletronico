/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Lucas
 */
public class StrategyOrdenacaoA implements OrdenacaoStrategy {
    
    @Override
    public ArrayList<Produto> ordenar(ArrayList<Produto> produtos){
        Collections.sort(produtos);
        return produtos;
    };
}
