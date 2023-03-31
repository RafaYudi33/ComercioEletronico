/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Lucas
 */
public abstract class Pagamento {
    private int codigoNota;

    public Pagamento(int codigoNota) {
        this.codigoNota = codigoNota;
    }
    
    @Override 
    public abstract String toString();
}
