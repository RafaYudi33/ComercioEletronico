/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public class FactoryPagamento {
    public static Pagamento factoryMethod(int codigoNota, String tipo){
        switch(tipo){
            case "Dinheiro":
                return new Dinheiro(codigoNota);
            case "Cartao Credito": 
                return new CartaoCredito(codigoNota); 
            case "Pix":
                return new Pix(codigoNota);
            default:
                return null;
        }
    }
}
