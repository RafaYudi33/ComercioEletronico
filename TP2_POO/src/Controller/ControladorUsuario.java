/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Cli_Comum;
import Models.Cli_Ouro;
import Models.Cliente;
import Models.ComercioEletronico;
import Models.Configuracao;
import Models.FactoryCliente;
import Models.Gerente;
import Models.IOArquivos;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ControladorUsuario {
    public static ComercioEletronico COM = new ComercioEletronico();
    
    public Configuracao getConfiguracoes(){
        return COM.getConfiguracoes();
    }
    
    public void setConfiguracoes(Configuracao config){
        COM.setConfiguracoes(config);
        IOArquivos arq = new IOArquivos();
        arq.escreverConfig(config);
        JOptionPane.showMessageDialog(null, "configurações salvas com sucesso!");
    }
    
    public String getConfigClientes(){
        return COM.getConfiguracoes().getArquivoClientes();
    }
    
    public String getConfigGerentes(){
        return COM.getConfiguracoes().getArquivoGerentes();
    }
    
    
    public void addCliente(LocalDate dataCadastro, int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String email, String tipo){
        IOArquivos arq = new IOArquivos();
        Cliente cliente = FactoryCliente.factoryMethod(dataCadastro, codigo, nome, cpf, rg, dataNascimento, endereco, cep, email, tipo);
        arq.escreverCliente(cliente);
    }

    public void addGerente( float salario, String pis, LocalDate dataAdmissao, int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String email){
        IOArquivos arq = new IOArquivos();
        Gerente gerente = new Gerente(salario, pis, dataAdmissao, codigo, nome, cpf, rg, dataNascimento, endereco, cep, email);
        arq.escreverGerente(gerente);
    }
    
    
    //Relatórios de Cliente
    
    public Object[][] relatorioTodosClientes(){
        IOArquivos arq = new IOArquivos();
        int cont = 0;
        Object[][] linha = new Object[arq.lerClientes().size()][9];
        
        Iterator<Cliente> iterator = arq.lerClientes().iterator();
        
        while (iterator.hasNext()) {
            
            Cliente cliente = iterator.next();
            
            linha[cont][0] = cliente.getCodigo();
            linha[cont][1] = cliente.getNome();
            linha[cont][2] = cliente.getCpf();
            linha[cont][3] = cliente.getRg();
            linha[cont][4] = cliente.getDataNascimento();
            linha[cont][5] = cliente.getEndereco();
            linha[cont][6] = cliente.getCep();
            linha[cont][7] = cliente.getEmail();
            linha[cont][8] = cliente.getDataCadastro();
            cont++;
        }
        
        return(linha);
    }
    
    public Object[][] relatorioClientesOuro(){
        int cont = 0;
        Object[][] linha = new Object[getClienteOuro().size()][9];
        
        Iterator<Cliente> iterator = getClienteOuro().iterator();
        
        while (iterator.hasNext()) {
            
            Cliente cliente = iterator.next();
            
            linha[cont][0] = cliente.getCodigo();
            linha[cont][1] = cliente.getNome();
            linha[cont][2] = cliente.getCpf();
            linha[cont][3] = cliente.getRg();
            linha[cont][4] = cliente.getDataNascimento();
            linha[cont][5] = cliente.getEndereco();
            linha[cont][6] = cliente.getCep();
            linha[cont][7] = cliente.getEmail();
            linha[cont][8] = cliente.getDataCadastro();
            cont++;
        }
        
        return(linha);
    }
    
        public Object[][] relatorioClientesComum(){
        int cont = 0;
        Object[][] linha = new Object[getClienteComum().size()][9];
        
        Iterator<Cliente> iterator = getClienteComum().iterator();
        
        while (iterator.hasNext()) {
            
            Cliente cliente = iterator.next();
            
            linha[cont][0] = cliente.getCodigo();
            linha[cont][1] = cliente.getNome();
            linha[cont][2] = cliente.getCpf();
            linha[cont][3] = cliente.getRg();
            linha[cont][4] = cliente.getDataNascimento();
            linha[cont][5] = cliente.getEndereco();
            linha[cont][6] = cliente.getCep();
            linha[cont][7] = cliente.getEmail();
            linha[cont][8] = cliente.getDataCadastro();
            cont++;
        }
        
        return(linha);
    }
    
    
    public ArrayList<Cliente> getClienteOuro(){
        IOArquivos arq = new IOArquivos();
        Iterator iterator = arq.lerClientes().iterator();
        ArrayList<Cliente> clientes = new ArrayList();
        
        while(iterator.hasNext()){
            Cliente cliente = (Cliente) iterator.next();
            
            if(cliente instanceof Cli_Ouro){
                clientes.add(cliente);
            }
        }
        return clientes;
    }
    
        public ArrayList<Cliente> getClienteComum(){
        IOArquivos arq = new IOArquivos();
        Iterator iterator = arq.lerClientes().iterator();
        ArrayList<Cliente> clientes = new ArrayList();
        
        while(iterator.hasNext()){
            Cliente cliente = (Cliente) iterator.next();
            
            if(cliente instanceof Cli_Comum){
                clientes.add(cliente);
            }
        }
        return clientes;
    }
    
    
    public int retornaQuantidadeClientes(){
        IOArquivos arq = new IOArquivos();
        int cont;
        try{
            cont = arq.lerClientes().size();
        }catch(NullPointerException e){
            cont = 0;
        }
        return(cont);
    }
    
    public Object[][] relatorioTodosGerentes(){
        IOArquivos arq = new IOArquivos();
        int cont = 0;
        Object[][] linha = new Object[arq.lerGerentes().size()][11];
        
        Iterator<Gerente> iterator = arq.lerGerentes().iterator();
        
        while (iterator.hasNext()) {
            
            Gerente gerente = iterator.next();
            
            linha[cont][0] = gerente.getCodigo();
            linha[cont][1] = gerente.getNome();
            linha[cont][2] = gerente.getCpf();
            linha[cont][3] = gerente.getRg();
            linha[cont][4] = gerente.getDataNascimento();
            linha[cont][5] = gerente.getEndereco();
            linha[cont][6] = gerente.getCep();
            linha[cont][7] = gerente.getEmail();
            linha[cont][8] = gerente.getSalario();
            linha[cont][9] = gerente.getPis();
            linha[cont][10] = gerente.getDataAdmissao();
            cont++;
        }
        
        return(linha);
    }
    
    

    public int retornaQuantidadeClientesOuro(){
        int cont;
        try{
            cont = getClienteOuro().size();
        }catch(NullPointerException e){
            cont = 0;
        }
        return(cont);
    }
    
    
    public int retornaQuantidadeClientesComuns(){
        int cont;
        try{
            cont = getClienteComum().size();
        }catch(NullPointerException e){
            cont = 0;
        }
        return(cont);
    }
    
    
    public int retornaQuantidadeGerente(){
        IOArquivos arq = new IOArquivos();
        int cont;
        try{
            cont = arq.lerGerentes().size();
        }catch(NullPointerException e){
            cont = 0;
        }
        return(cont);
    }
    
    public Cliente buscaClientePorCodigo(int codigo){
        IOArquivos arq = new IOArquivos();
        Iterator<Cliente> iterator = arq.lerClientes().iterator();
        
        while (iterator.hasNext()) {
            
            Cliente cliente = iterator.next();
            if(cliente.getCodigo() == codigo){
                return(cliente);
            }
        }
        
        return(null);
    }
    
    public Gerente buscaGerentePorCodigo(int codigo){
        IOArquivos arq = new IOArquivos();
        Iterator<Gerente> iterator = arq.lerGerentes().iterator();
        
        while (iterator.hasNext()) {
            
            Gerente gerente = iterator.next();
            
            if(gerente.getCodigo() == codigo){
                return(gerente);
            }
        }
        
        return(null);
    }
    

    
}
