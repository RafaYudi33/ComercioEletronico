/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;

/**
 *
 * @author Martines
 */
public class FactoryProduto {
    
    public static Produto factoryMethod(int codigo, String nome, String descricao, LocalDate dataFabricacao, float valor, Fabricante fabricante, boolean disponivel, String tipo){
        switch(tipo){
            case "MOVEL":
                return new Movel(codigo, nome, descricao, dataFabricacao, valor, fabricante, true);
            case "ELETRODOMESTICO": 
                return new Eletrodomestico(codigo, nome, descricao, dataFabricacao, valor, fabricante, true); 
            case "ELETRONICO":
                return new Eletronico(codigo, nome, descricao, dataFabricacao, valor, fabricante, true);
            case "VESTUARIO":
                return new Vestuario(codigo, nome, descricao, dataFabricacao, valor, fabricante, true);
            default:
                return null;
        }
    }
    
}
