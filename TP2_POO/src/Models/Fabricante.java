/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author Lucas
 */
public class Fabricante implements Serializable{
    private int codigo;
    private String cnpj;
    private String nome;
    private String descricao;
    private String email;
    private String telefone;
    private String endereco;


    public Fabricante() {
    }
    
    public Fabricante(int codigo, String cnpj, String nome, String descricao, String email, String telefone, String endereco) {
        this.codigo = codigo;
        this.cnpj = cnpj;
        this.nome = nome;
        this.descricao = descricao;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return  "\nFabricante: " + 
                "\nCodigo: " + codigo + 
                "\nCnpj: " + cnpj + 
                "\nNome: " + nome + 
                "\nDescricao: " + descricao + 
                "\nEmail: " + email + 
                "\nTelefone: " + telefone +
                "\nEndereco: " + endereco +
                "______________________________";
    }
    
    



    
}
