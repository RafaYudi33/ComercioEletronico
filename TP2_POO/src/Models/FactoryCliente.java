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
public class FactoryCliente {
    public static Cliente factoryMethod(LocalDate dataCadastro, int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String email, String tipo){
        switch(tipo){
            case "Cliente Comum":
                return new Cli_Comum(dataCadastro, codigo, nome, cpf, rg, dataNascimento, endereco, cep, email);
            case "Cliente Ouro": 
                return new Cli_Ouro(dataCadastro, codigo, nome, cpf, rg, dataNascimento, endereco, cep, email); 
            default:
                return null;
        }
    }
}
