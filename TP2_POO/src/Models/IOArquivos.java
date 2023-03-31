/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Controller.ControladorProduto;
import Controller.ControladorUsuario;
import Controller.ControladorVenda;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class IOArquivos {
    public Configuracao lerConfig(){
        try{
            File arquivoConfig = new File("config.arq");
            
            Configuracao configAtual;
            FileInputStream ios;
            if (arquivoConfig.exists() == false){
                configAtual = new Configuracao();
                this.escreverConfig(configAtual);
                return configAtual;
            }
            
            ios = new FileInputStream(arquivoConfig);
            ObjectInputStream ois = new ObjectInputStream(ios);
            
            configAtual = (Configuracao) ois.readObject();
            return configAtual;
            
        }catch( FileNotFoundException ex){
            return null;
        }catch(IOException | ClassNotFoundException ex){
            return null;
        }
    }
    
    public void escreverConfig(Configuracao novaConfig){
        try{
            File configFile = new File("config.arq");
            
            if(configFile.exists() == false)configFile.createNewFile();
            
            FileOutputStream fos = new FileOutputStream("config.arq");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            
            ous.writeObject(novaConfig);
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo de configurações!");
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo de configurações!");
        }
    }
    
    
    public ArrayList<Cliente> lerClientes(){
        try{
            ControladorUsuario control = new ControladorUsuario();
            FileInputStream fis = new FileInputStream(control.getConfigClientes());
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            int contClientes = ois.readInt();
            ArrayList<Cliente> clientes = new ArrayList<>();
            
            for(int i = 0; i < contClientes; i++){
                clientes.add((Cliente) ois.readObject());
            }
            
            return clientes;
            
        }catch(IOException ex){
            return null;
        }catch(ClassNotFoundException ex){
            return null;
        }
    }
    
    public ArrayList<Gerente> lerGerentes(){
        try{
            ControladorUsuario control = new ControladorUsuario();
            FileInputStream fis = new FileInputStream(control.getConfigGerentes());
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            int contGerentes = ois.readInt();
            ArrayList<Gerente> gerentes = new ArrayList<>();
            
            for(int i = 0; i < contGerentes; i++){
                gerentes.add((Gerente) ois.readObject());
            }
            
            return gerentes;
            
        }catch(IOException ex){
            return null;
        }catch(ClassNotFoundException ex){
            return null;
        }
    }
    
    public void escreverCliente(Cliente cliente){
        
        try {
            ControladorUsuario control = new ControladorUsuario();
            File arquivoClientes = new File(control.getConfigClientes());
            ArrayList<Cliente> clientes;
            clientes = lerClientes();
            
            int contClientes;
            
            if(arquivoClientes.exists() == false) arquivoClientes.createNewFile();
             
            FileOutputStream fos = new FileOutputStream(arquivoClientes);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            
            
            
            if(clientes != null){
                clientes.add(cliente);
                contClientes = clientes.size();
                ous.writeInt(contClientes);
                for(int i = 0;i<contClientes;i++){
                    ous.writeObject(clientes.get(i));
                }
            }else{
                ous.writeInt(1);
                ous.writeObject(cliente);
            }
            ous.close();
            fos.close();
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado Com Sucesso!!");
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo de Clientes");
        } catch (IOException ex) {
            Logger.getLogger(IOArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    public void escreverGerente(Gerente gerente){
        
        try {
            ControladorUsuario control = new ControladorUsuario();
            File arquivoGerentes = new File(control.getConfigGerentes());
            ArrayList<Gerente> gerentes;
            gerentes = lerGerentes();
            
            int contClientes;
            
            if(arquivoGerentes.exists() == false) arquivoGerentes.createNewFile();
             
            FileOutputStream fos = new FileOutputStream(arquivoGerentes);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            
            
            
            if(gerentes != null){
                gerentes.add(gerente);
                contClientes = gerentes.size();
                ous.writeInt(contClientes);
                for(int i = 0;i<contClientes;i++){
                    ous.writeObject(gerentes.get(i));
                }
            }else{
                ous.writeInt(1);
                ous.writeObject(gerente);
            }
            ous.close();
            fos.close();
            JOptionPane.showMessageDialog(null, "Gerente Cadastrado Com Sucesso!!");
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo de Gerente");
        } catch (IOException ex) {
            Logger.getLogger(IOArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public ArrayList<Produto> lerProdutos(){
        try{
            ControladorProduto control = new ControladorProduto();
            FileInputStream fis = new FileInputStream(control.getConfigProduto());
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            int contProdutos = ois.readInt();
            ArrayList<Produto> produtos = new ArrayList<>();
            
            for(int i = 0; i < contProdutos; i++){
                produtos.add((Produto) ois.readObject());
            }
            
            return produtos;
        } catch(IOException ex){
            return null;
        } catch(ClassNotFoundException ex){
            return null;
        }
    }
    
    public void escreverProduto(Produto produto){
        try{
            ControladorProduto control = new ControladorProduto();
            File arquivoProduto = new File(control.getConfigProduto());
            ArrayList<Produto> produtos;
            produtos = lerProdutos();
            
            int contProdutos;
            
            if(arquivoProduto.exists() == false) arquivoProduto.createNewFile();
             
            FileOutputStream fos = new FileOutputStream(arquivoProduto);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            
            
            
            if(produtos != null){
                produtos.add(produto);
                contProdutos = produtos.size();
                ous.writeInt(contProdutos);
                for(int i = 0;i<contProdutos;i++){
                    ous.writeObject(produtos.get(i));
                }
            }else{
                ous.writeInt(1);
                ous.writeObject(produto);
            }
            ous.close();
            fos.close();
            JOptionPane.showMessageDialog(null, "Produto Cadastrado Com Sucesso!!");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo de Produtos");
        } catch (IOException ex) {
            Logger.getLogger(IOArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Venda> lerVendas(){
        try{
            ControladorVenda control = new ControladorVenda();
            FileInputStream fis = new FileInputStream(control.getConfigVenda());
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            int contVendas = ois.readInt();
            ArrayList<Venda> vendas = new ArrayList<>();
            
            for(int i = 0; i < contVendas; i++){
                vendas.add((Venda) ois.readObject());
            }
            
            return vendas;
            
        }catch(IOException ex){
            return null;
        }catch(ClassNotFoundException ex){
            return null;
        }
    }
    
    public void escreverVendas(Venda venda){
        try{
            ControladorVenda control = new ControladorVenda();
            File arquivoVenda = new File(control.getConfigVenda());
            ArrayList<Venda> vendas = lerVendas();
            
            int contVendas;
            
            if(arquivoVenda.exists() == false) arquivoVenda.createNewFile();
             
            FileOutputStream fos = new FileOutputStream(arquivoVenda);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            
            
            
            if(vendas != null){
                vendas.add(venda);
                contVendas = vendas.size();
                ous.writeInt(contVendas);
                for(int i = 0;i<contVendas;i++){
                    ous.writeObject(vendas.get(i));
                }
            }else{
                ous.writeInt(1);
                ous.writeObject(venda);
            }
            ous.close();
            fos.close();
            JOptionPane.showMessageDialog(null, "Venda Cadastrada Com Sucesso!!");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo de Vendas");
        } catch (IOException ex) {
            Logger.getLogger(IOArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Fabricante> lerFabricantes(){
        try{
            ControladorProduto control = new ControladorProduto();
            FileInputStream fis = new FileInputStream(control.getConfigFabricantes());
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            int contFabricantes = ois.readInt();
            ArrayList<Fabricante> fabricantes = new ArrayList<>();
            
            for(int i = 0; i < contFabricantes; i++){
                fabricantes.add((Fabricante) ois.readObject());
            }
            
            return fabricantes;
            
        }catch(IOException ex){
            return null;
        }catch(ClassNotFoundException ex){
            return null;
        }
    }
    
    public void escreverFabricante(Fabricante fabricante){
        try{
            ControladorProduto control = new ControladorProduto();
            File arquivoFabricante = new File(control.getConfigFabricantes());
            ArrayList<Fabricante> fabricantes;
            fabricantes = lerFabricantes();
            
            int contFabricantes;
            
            if(arquivoFabricante.exists() == false) arquivoFabricante.createNewFile();
             
            FileOutputStream fos = new FileOutputStream(arquivoFabricante);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            
            
            
            if(fabricantes != null){
                fabricantes.add(fabricante);
                contFabricantes = fabricantes.size();
                ous.writeInt(contFabricantes);
                for(int i = 0;i<contFabricantes;i++){
                    ous.writeObject(fabricantes.get(i));
                }
            }else{
                ous.writeInt(1);
                ous.writeObject(fabricante);
            }
            ous.close();
            fos.close();
            JOptionPane.showMessageDialog(null, "Fabricante Cadastrada Com Sucesso!!");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo de Fabricante");
        } catch (IOException ex) {
            Logger.getLogger(IOArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Transportadora> lerTransportadora(){
        try{
            ControladorVenda control = new ControladorVenda();
            FileInputStream fis = new FileInputStream(control.getConfigTransportadora());
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            int contTransportadoras = ois.readInt();
            ArrayList<Transportadora> transportadoras = new ArrayList<>();
            
            for(int i = 0; i < contTransportadoras; i++){
                transportadoras.add((Transportadora) ois.readObject());
            }
            
            return transportadoras;
            
        }catch(IOException ex){
            return null;
        }catch(ClassNotFoundException ex){
            return null;
        }
    }
    
    public void escreverTransportadora(Transportadora transportadora){
        try{
            ControladorVenda control = new ControladorVenda();
            File arquivoTransportadora = new File(control.getConfigTransportadora());
            ArrayList<Transportadora> transportadoras;
            transportadoras = lerTransportadora();
            
            int contTransportadoras;
            
            if(arquivoTransportadora.exists() == false) arquivoTransportadora.createNewFile();
             
            FileOutputStream fos = new FileOutputStream(arquivoTransportadora);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            
            if(transportadoras != null){
                transportadoras.add(transportadora);
                contTransportadoras = transportadoras.size();
                ous.writeInt(contTransportadoras);
                for(int i = 0;i<contTransportadoras;i++){
                    ous.writeObject(transportadoras.get(i));
                }
            }else{
                ous.writeInt(1);
                ous.writeObject(transportadora);
            }
            ous.close();
            fos.close();
            JOptionPane.showMessageDialog(null, "Transportadora Cadastrada Com Sucesso!!");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo de Transportadoras");
        } catch (IOException ex) {
            Logger.getLogger(IOArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    
    
    
}
