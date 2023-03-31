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
public abstract class Cliente extends Usuario implements Serializable{
    protected LocalDate dataCadastro;

    public Cliente(LocalDate dataCadastro, int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String email) {
        super(codigo, nome, cpf, rg, dataNascimento, endereco, cep, email);
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    @Override
    public String toString() {
        return  "\nCliente: " + 
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
