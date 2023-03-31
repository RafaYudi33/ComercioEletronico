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
public class Gerente extends Usuario implements Serializable{
    protected float salario;
    protected String pis;
    protected LocalDate dataAdmissao;

    public Gerente(float salario, String pis, LocalDate dataAdmissao, int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String email) {
        super(codigo, nome, cpf, rg, dataNascimento, endereco, cep, email);
        this.salario = salario;
        this.pis = pis;
        this.dataAdmissao = dataAdmissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
        @Override
        public String toString() {
            return  "\nGerente: " + 
                    "\nCodigo: " + codigo + 
                    "\nNome: " + nome + 
                    "\nCpf: " + cpf + 
                    "\nRg: " + rg + 
                    "\nData de Nascimento: " + dataNascimento + 
                    "\nData de Admissao: " + dataAdmissao + 
                    "\nSalario: R$" +  salario + 
                    "\nPIS: " +  pis + 
                    "\nEndereco: " + endereco + 
                    "\nCep: " + cep + 
                    "\nEmail: " + email +
                    "______________________________";
        }
    
    
}
