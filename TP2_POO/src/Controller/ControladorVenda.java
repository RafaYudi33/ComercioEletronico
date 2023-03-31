    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.CartaoCredito;
import Models.Cliente;
import Models.ComercioEletronico;
import Models.Dinheiro;
import Models.Gerente;
import Models.IOArquivos;
import Models.ItemVenda;
import Models.Pagamento;
import Models.Pix;
import Models.Produto;
import Models.Transportadora;
import Models.Venda;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Lucas
 */
public class ControladorVenda {
    public static ComercioEletronico COM = new ComercioEletronico();
    
    public String getConfigVenda(){
        return COM.getConfiguracoes().getArquivoVendas();
    }
    
    public String getConfigTransportadora(){
        return COM.getConfiguracoes().getArquivoTransportadoras();
    };
    
    public void addVenda(int codigo, Cliente cliente, Gerente gerente, LocalDate dataVenda, ArrayList<ItemVenda> itensDaVenda, float valorTotal, Pagamento formaPagamento, Transportadora transportadora){
        IOArquivos arq = new IOArquivos();
        Venda venda = new Venda(codigo, cliente, gerente, dataVenda, null, itensDaVenda, valorTotal, 0, formaPagamento, transportadora);
        LocalDate dataDaEntrega = venda.calcularDataEntrega(dataVenda); 
        venda.setDataDaEntrega(dataDaEntrega);
        venda.setValorComDesconto(venda.calcularValorTotal());
        arq.escreverVendas(venda);
    }
    
    public ItemVenda AddItemVenda(Produto produto, float valor, int quantidade){
        ItemVenda itens = new ItemVenda(produto, valor, quantidade);
        return itens;
    }
    
    public Pix addPagamentoPix(String codigoPix, int codigoNota){
        IOArquivos arq = new IOArquivos(); 
        Pix pix = new Pix(codigoPix,codigoNota); 
        return pix; 
    }
    
    public CartaoCredito addPagamentoCartao(String nome, String bandeira, String numero, int codigoNota){
        IOArquivos arq = new IOArquivos(); 
        CartaoCredito cartao = new CartaoCredito(nome, bandeira, numero, codigoNota); 
        return cartao; 
    }
    
    public Dinheiro addPagamentoDinheiro(int codigoNota){
       IOArquivos arq = new IOArquivos(); 
       Dinheiro dinheiro = new Dinheiro(codigoNota); 
       return dinheiro; 
    }
    
    public Transportadora buscaTransportadoraPorCodigo(int codigo){
            IOArquivos arq = new IOArquivos(); 
            //Padrão Iterator!
            Iterator<Transportadora> iterator = arq.lerTransportadora().iterator();
        
            while (iterator.hasNext()) {
            
                Transportadora transportadora = iterator.next();
            
                if(transportadora.getCodigo() == codigo){
                    return(transportadora);
                }
        }
        
        return(null);
            
    } 
    
    public Object[][] relatorioTodasVendas(){
        IOArquivos arq = new IOArquivos();
        int cont = 0;
        Object[][] linha = new Object[arq.lerVendas().size()][10];
        
        Iterator<Venda> iterator = arq.lerVendas().iterator();
        
        while (iterator.hasNext()) {
            
            Venda venda = iterator.next();
            
            linha[cont][0] = venda.getCodigo();
            linha[cont][1] = venda.getCliente();
            linha[cont][2] = venda.getGerente();
            linha[cont][3] = venda.getDataVenda();
            linha[cont][4] = venda.getDataDaEntrega();
            linha[cont][5] = venda.getItensDaVenda();
            linha[cont][6] = venda.getValorTotal();
            linha[cont][7] = venda.getValorComDesconto();
            linha[cont][8] = venda.getFormaPagamento();
            linha[cont][9] = venda.getTransportadora();
            cont++;
        }
        
        return(linha);
    }
    
    
}
