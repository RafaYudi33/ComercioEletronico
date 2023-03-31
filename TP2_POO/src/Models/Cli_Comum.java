/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Martines
 */
public class Cli_Comum extends Cliente implements Serializable {
    public Cli_Comum(LocalDate dataCadastro, int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String email) {
        super(dataCadastro, codigo, nome, cpf, rg, dataNascimento, endereco, cep, email);
    }

    @Override
    public String toString() {
        return  "\nCliente Comum: " + 
                "\nCodigo: " + codigo + 
                "\nNome: " + nome + 
                "\nCpf: " + cpf + 
                "\nRg: " + rg + 
                "\nData de Nascimento: " + dataNascimento + 
                "\nData de Cadastro: " + dataCadastro +
                "\nEndereco: " + endereco + 
                "\nCep: " + cep + 
                "\nEmail: " + email +
                "______________________________";
    }
}
