/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class ComercioEletronico implements Serializable{
    private String nomeLoja;
    private ArrayList<Venda> vendas = new ArrayList();
    private ArrayList<Produto> produtos = new ArrayList();
    private ArrayList<Fabricante> fabricantes = new ArrayList();
    private ArrayList<Transportadora> transportadoras = new ArrayList();
    private ArrayList<Cliente> clientes = new ArrayList();
    private ArrayList<Gerente> gerentes = new ArrayList();
    private Configuracao configuracoes;

    public ComercioEletronico() {
        this.nomeLoja = "Comercio X";
        this.configuracoes = new Configuracao();
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(ArrayList<Venda> vendas) {
        this.vendas = vendas;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public ArrayList<Fabricante> getFabricantes() {
        return fabricantes;
    }

    public void setFabricantes(ArrayList<Fabricante> fabricantes) {
        this.fabricantes = fabricantes;
    }

    public ArrayList<Transportadora> getTransportadoras() {
        return transportadoras;
    }

    public void setTransportadoras(ArrayList<Transportadora> transportadoras) {
        this.transportadoras = transportadoras;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Gerente> getGerentes() {
        return gerentes;
    }

    public void setGerentes(ArrayList<Gerente> gerentes) {
        this.gerentes = gerentes;
    }

    public Configuracao getConfiguracoes() {
        return configuracoes;
    }

    public void setConfiguracoes(Configuracao configuracoes) {
        this.configuracoes = configuracoes;
    }
    
    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    
    public void addGerente(Gerente gerente){
        this.gerentes.add(gerente);
    }
    
}
