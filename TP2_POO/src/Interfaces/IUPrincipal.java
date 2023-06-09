/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Controller.ControladorUsuario;
import Controller.ControladorVenda;
import Models.ComercioEletronico;
import Models.IOArquivos;

/**
 *
 * @author Martines
 */
public class IUPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form IUPrincipal
     */
    public IUPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        menuItemCliente = new javax.swing.JMenuItem();
        menuItemGerente = new javax.swing.JMenuItem();
        menuItemVenda = new javax.swing.JMenuItem();
        menuItemCadFabricante = new javax.swing.JMenuItem();
        menuItemCadTransportadoras = new javax.swing.JMenuItem();
        menuItemCadastroProd = new javax.swing.JMenuItem();
        MenuRelatorios = new javax.swing.JMenu();
        MenuRelatorioCliente = new javax.swing.JMenu();
        menuItemTodosClientes = new javax.swing.JMenuItem();
        menuItemClientesOuro = new javax.swing.JMenuItem();
        menuItemCliComum = new javax.swing.JMenuItem();
        MenuRelatorioGerente = new javax.swing.JMenu();
        menuItemTodosGerentes = new javax.swing.JMenuItem();
        MenuRelatorioVendas = new javax.swing.JMenu();
        menuItemTodasVendas = new javax.swing.JMenuItem();
        menuItemVendMesEsp = new javax.swing.JMenuItem();
        itemMenuVendaDinheiro = new javax.swing.JMenuItem();
        menuItemVendaCartao = new javax.swing.JMenuItem();
        menuItemVendasPIX = new javax.swing.JMenuItem();
        menuItemVendaClienteEspeci = new javax.swing.JMenuItem();
        MenuRelatoriosProdutos = new javax.swing.JMenu();
        menuItemTodosProdutos = new javax.swing.JMenuItem();
        menuItemTodosMoveis = new javax.swing.JMenuItem();
        menuItemTodosEletrodomesticos = new javax.swing.JMenuItem();
        menuItemTodosEletronicos = new javax.swing.JMenuItem();
        menuItemTodosVestuarios = new javax.swing.JMenuItem();
        menuItemProdMaisVend = new javax.swing.JMenuItem();
        menuItemProdOrdA = new javax.swing.JMenuItem();
        ProdOrdB = new javax.swing.JMenuItem();
        MenuRelatorioTRansportadoras = new javax.swing.JMenu();
        menuItemTransport = new javax.swing.JMenuItem();
        menuItemTrasnpMaisTransp = new javax.swing.JMenuItem();
        MenuRelatorioFabricantes = new javax.swing.JMenu();
        menuItemTodosOsFabricantes = new javax.swing.JMenuItem();
        menuItemFabMaisVenda = new javax.swing.JMenuItem();
        menuItemFabMaisLucro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        jMenuCadastros.setText("Cadastros ");
        jMenuCadastros.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jMenuCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrosActionPerformed(evt);
            }
        });

        menuItemCliente.setText("Cadastro Cliente");
        menuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClienteActionPerformed(evt);
            }
        });
        jMenuCadastros.add(menuItemCliente);

        menuItemGerente.setText("Cadastro Gerente ");
        menuItemGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGerenteActionPerformed(evt);
            }
        });
        jMenuCadastros.add(menuItemGerente);

        menuItemVenda.setText("Cadastro Venda ");
        menuItemVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVendaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(menuItemVenda);

        menuItemCadFabricante.setText("Cadastro Fabricante");
        menuItemCadFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadFabricanteActionPerformed(evt);
            }
        });
        jMenuCadastros.add(menuItemCadFabricante);

        menuItemCadTransportadoras.setText("Cadastro Transportadoras");
        menuItemCadTransportadoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadTransportadorasActionPerformed(evt);
            }
        });
        jMenuCadastros.add(menuItemCadTransportadoras);

        menuItemCadastroProd.setText("Cadastro Produto");
        menuItemCadastroProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastroProdActionPerformed(evt);
            }
        });
        jMenuCadastros.add(menuItemCadastroProd);

        jMenuBar1.add(jMenuCadastros);

        MenuRelatorios.setText("Relatórios");
        MenuRelatorios.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        MenuRelatorioCliente.setText("Relatórios de Cliente");

        menuItemTodosClientes.setText("Todos os Clientes");
        menuItemTodosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTodosClientesActionPerformed(evt);
            }
        });
        MenuRelatorioCliente.add(menuItemTodosClientes);

        menuItemClientesOuro.setText("Clientes de Ouro");
        menuItemClientesOuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClientesOuroActionPerformed(evt);
            }
        });
        MenuRelatorioCliente.add(menuItemClientesOuro);

        menuItemCliComum.setText("Clientes Comuns");
        menuItemCliComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCliComumActionPerformed(evt);
            }
        });
        MenuRelatorioCliente.add(menuItemCliComum);

        MenuRelatorios.add(MenuRelatorioCliente);

        MenuRelatorioGerente.setText("Relatórios de Gerente");

        menuItemTodosGerentes.setText("Todos os Gerentes");
        menuItemTodosGerentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTodosGerentesActionPerformed(evt);
            }
        });
        MenuRelatorioGerente.add(menuItemTodosGerentes);

        MenuRelatorios.add(MenuRelatorioGerente);

        MenuRelatorioVendas.setText("Relatórios das Vendas");

        menuItemTodasVendas.setText("Todas as Vendas");
        MenuRelatorioVendas.add(menuItemTodasVendas);

        menuItemVendMesEsp.setText("Vendas Mês Específico e Lucro");
        MenuRelatorioVendas.add(menuItemVendMesEsp);

        itemMenuVendaDinheiro.setText("Vendas Pagas em Dinheiro");
        MenuRelatorioVendas.add(itemMenuVendaDinheiro);

        menuItemVendaCartao.setText("Vendas Pagas no Cartão");
        MenuRelatorioVendas.add(menuItemVendaCartao);

        menuItemVendasPIX.setText("Vendas Pagas no PIX");
        MenuRelatorioVendas.add(menuItemVendasPIX);

        menuItemVendaClienteEspeci.setText("Vendas Cliente Específico");
        MenuRelatorioVendas.add(menuItemVendaClienteEspeci);

        MenuRelatorios.add(MenuRelatorioVendas);

        MenuRelatoriosProdutos.setText("Relatório dos Produtos");

        menuItemTodosProdutos.setText("Todos Produtos");
        menuItemTodosProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTodosProdutosActionPerformed(evt);
            }
        });
        MenuRelatoriosProdutos.add(menuItemTodosProdutos);

        menuItemTodosMoveis.setText("Todos Móveis");
        menuItemTodosMoveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTodosMoveisActionPerformed(evt);
            }
        });
        MenuRelatoriosProdutos.add(menuItemTodosMoveis);

        menuItemTodosEletrodomesticos.setText("Todos Eletrodomésticos");
        menuItemTodosEletrodomesticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTodosEletrodomesticosActionPerformed(evt);
            }
        });
        MenuRelatoriosProdutos.add(menuItemTodosEletrodomesticos);

        menuItemTodosEletronicos.setText("Todos Eletrônicos ");
        menuItemTodosEletronicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTodosEletronicosActionPerformed(evt);
            }
        });
        MenuRelatoriosProdutos.add(menuItemTodosEletronicos);

        menuItemTodosVestuarios.setText("Todos Vestuários");
        menuItemTodosVestuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTodosVestuariosActionPerformed(evt);
            }
        });
        MenuRelatoriosProdutos.add(menuItemTodosVestuarios);

        menuItemProdMaisVend.setText("Produtos Mais Vendidos");
        MenuRelatoriosProdutos.add(menuItemProdMaisVend);

        menuItemProdOrdA.setText("Produtos Ordenados Por Valor(A)");
        MenuRelatoriosProdutos.add(menuItemProdOrdA);

        ProdOrdB.setText("Produtos Ordenados Por Valor(B)");
        MenuRelatoriosProdutos.add(ProdOrdB);

        MenuRelatorios.add(MenuRelatoriosProdutos);

        MenuRelatorioTRansportadoras.setText("Relatórios das Transportadoras");

        menuItemTransport.setText("Todas as Transportadoras");
        menuItemTransport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTransportActionPerformed(evt);
            }
        });
        MenuRelatorioTRansportadoras.add(menuItemTransport);

        menuItemTrasnpMaisTransp.setText("Transportadoras Com Mais Transportes");
        menuItemTrasnpMaisTransp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTrasnpMaisTranspActionPerformed(evt);
            }
        });
        MenuRelatorioTRansportadoras.add(menuItemTrasnpMaisTransp);

        MenuRelatorios.add(MenuRelatorioTRansportadoras);

        MenuRelatorioFabricantes.setText("Relatório dos Fabricantes");

        menuItemTodosOsFabricantes.setText("Todos os Fabricantes");
        menuItemTodosOsFabricantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTodosOsFabricantesActionPerformed(evt);
            }
        });
        MenuRelatorioFabricantes.add(menuItemTodosOsFabricantes);

        menuItemFabMaisVenda.setText("Fabricantes Com Mais Produtos Vendidos");
        menuItemFabMaisVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFabMaisVendaActionPerformed(evt);
            }
        });
        MenuRelatorioFabricantes.add(menuItemFabMaisVenda);

        menuItemFabMaisLucro.setText("Fabricantes com mais lucro");
        MenuRelatorioFabricantes.add(menuItemFabMaisLucro);

        MenuRelatorios.add(MenuRelatorioFabricantes);

        jMenuBar1.add(MenuRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClienteActionPerformed
        new IUCadastroCliente().setVisible(true);
    }//GEN-LAST:event_menuItemClienteActionPerformed

    private void menuItemGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGerenteActionPerformed
        new IUCadastroGerente().setVisible(true);
    }//GEN-LAST:event_menuItemGerenteActionPerformed

    private void menuItemVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVendaActionPerformed
        new IUCadastroVenda().setVisible(true);
    }//GEN-LAST:event_menuItemVendaActionPerformed

    private void jMenuCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrosActionPerformed
        
    }//GEN-LAST:event_jMenuCadastrosActionPerformed

    private void menuItemCadFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadFabricanteActionPerformed
        new IUCadastroFabricante().setVisible(true); 
    }//GEN-LAST:event_menuItemCadFabricanteActionPerformed

    private void menuItemCadTransportadorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadTransportadorasActionPerformed
        new IUCadastroTransportadoras().setVisible(true);
    }//GEN-LAST:event_menuItemCadTransportadorasActionPerformed

    private void menuItemTrasnpMaisTranspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTrasnpMaisTranspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemTrasnpMaisTranspActionPerformed

    private void menuItemTodosGerentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTodosGerentesActionPerformed
        IUConsultaGerente consuGer = new IUConsultaGerente(null, true);
        consuGer.setVisible(true);
    }//GEN-LAST:event_menuItemTodosGerentesActionPerformed

    private void menuItemFabMaisVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFabMaisVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemFabMaisVendaActionPerformed

    private void menuItemCadastroProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastroProdActionPerformed
      new IUCadastroProduto().setVisible(true); 
    }//GEN-LAST:event_menuItemCadastroProdActionPerformed

    private void menuItemTodosOsFabricantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTodosOsFabricantesActionPerformed
        IUConsultaFabricante consuFabri = new IUConsultaFabricante(null, true);
        consuFabri.setVisible(true); 
    }//GEN-LAST:event_menuItemTodosOsFabricantesActionPerformed

    private void menuItemTransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTransportActionPerformed
        IUConsultaTransportadora consuTrans = new IUConsultaTransportadora(null, true);
        consuTrans.setVisible(true);
    }//GEN-LAST:event_menuItemTransportActionPerformed

    private void menuItemTodosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTodosClientesActionPerformed
        IUConsultaCliente ConsulCliente = new IUConsultaCliente(null, true);
        ConsulCliente.setVisible(true);
    }//GEN-LAST:event_menuItemTodosClientesActionPerformed

    private void menuItemTodosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTodosProdutosActionPerformed
        IUConsultaProduto consulProd = new IUConsultaProduto(null, true);
        consulProd.setVisible(true);
    }//GEN-LAST:event_menuItemTodosProdutosActionPerformed

    private void menuItemTodosMoveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTodosMoveisActionPerformed
        IUConsultaMoveis consulMov = new IUConsultaMoveis(null, true); 
        consulMov.setVisible(true); 
    }//GEN-LAST:event_menuItemTodosMoveisActionPerformed

    private void menuItemTodosEletrodomesticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTodosEletrodomesticosActionPerformed
        IUConsultaEletrodomesticos consulEletrodo = new IUConsultaEletrodomesticos(null, true); 
        consulEletrodo.setVisible(true); 
    }//GEN-LAST:event_menuItemTodosEletrodomesticosActionPerformed

    private void menuItemTodosEletronicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTodosEletronicosActionPerformed
        IUConsultaEletronico consulEletronico = new IUConsultaEletronico(null, true); 
        consulEletronico.setVisible(true);     }//GEN-LAST:event_menuItemTodosEletronicosActionPerformed

    private void menuItemTodosVestuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTodosVestuariosActionPerformed
        IUConsultaVestuario consulVest = new IUConsultaVestuario(null, true); 
        consulVest.setVisible(true);     
    }//GEN-LAST:event_menuItemTodosVestuariosActionPerformed

    private void menuItemClientesOuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClientesOuroActionPerformed
        IUConsultaClienteOuro consulOuro = new IUConsultaClienteOuro(null, true); 
        consulOuro.setVisible(true); 
    }//GEN-LAST:event_menuItemClientesOuroActionPerformed

    private void menuItemCliComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCliComumActionPerformed
        IUConsultaClienteComum consulComum = new IUConsultaClienteComum(null, true); 
        consulComum.setVisible(true); 
    }//GEN-LAST:event_menuItemCliComumActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IOArquivos arq = new IOArquivos();
                ComercioEletronico COM = new ComercioEletronico();
                COM.setConfiguracoes(arq.lerConfig());
                ControladorVenda control = new ControladorVenda(); 
                ControladorUsuario controlUsu = new ControladorUsuario(); 
                //control.getVenda();
                System.out.println(arq.lerVendas());
                //System.out.println(arq.lerProdutos());
                
            
                
                
//                LocalDate data = LocalDate.parse("2022-07-21");
//                LocalDate data1 = LocalDate.parse("2021-09-12");
//                LocalDate data2 = LocalDate.parse("2021-08-27");
//                LocalDate data3 = LocalDate.parse("2021-09-27");
//                
                //Fabricante fab1 = new Fabricante(1, "123456789098", "Rafael Company", "fabricante de moveis", "Rafal@gmail.com", "14998765554", "Avenida Brasil, 1222");
                //Fabricante fab2 = new Fabricante(2, "123456789098", "Rafael Company", "fabricante de moveis", "Rafal@gmail.com", "14998765554", "Avenida Brasil, 1222");

//                Movel mv1 = new Movel(1, "Cadeira gamer", "Uma cadeira com RGB", data, 723, fab1, true);
//                
//                Movel mv2 = new Movel(2, "Mesa gamer", "Uma Mesa com RGB", data1, 1000, fab1, true);
//                
//                Movel mv3 = new Movel(3, "Armario gamer", "Um Armario com RGB", data2, 1200, fab1, true);
//                
//                Eletrodomestico elet = new Eletrodomestico(4, "Microondas", "Serve pra esquentar comidas", data3, 680, fab1, true);
//                
//                ControladorProduto ctrlProd = new ControladorProduto();
                
//                ctrlProd.addProduto(mv1);
//                ctrlProd.addProduto(mv2);
//                ctrlProd.addProduto(mv3);
//                ctrlProd.addProduto(elet);

                  //ctrlProd.addFabricante(fab2);
//                Object[][] linha = controlUsu.relatorioTodosGerentes();
//                
//                for(int cont = 0; cont < linha.length; cont++){
//                    System.out.println(linha[cont][0]);
//                    System.out.println(linha[cont][1]);
//                    System.out.println(linha[cont][2]);
//                    System.out.println(linha[cont][3]);
//                    System.out.println(linha[cont][4]);
//                    System.out.println(linha[cont][5]);
//                    System.out.println(linha[cont][6]);
//                    System.out.println(linha[cont][7]);
//                    System.out.println(linha[cont][8]);
//                    System.out.println(linha[cont][9]);
//                    System.out.println(linha[cont][10]);
//                
//                }

//                Object[][] linha = ctrlProd.relatorioTodosProdutos();
//                
//                for(int cont = 0; cont < linha.length; cont++){
//                    System.out.println(linha[cont][0]);
//                    System.out.println(linha[cont][1]);
//                    System.out.println(linha[cont][2]);
//                    System.out.println(linha[cont][3]);
//                    System.out.println(linha[cont][4]);
//                    System.out.println(linha[cont][5]);
//                    System.out.println(linha[cont][6]);
                
//                }

                
                
                
                
                
                
                new IUPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuRelatorioCliente;
    private javax.swing.JMenu MenuRelatorioFabricantes;
    private javax.swing.JMenu MenuRelatorioGerente;
    private javax.swing.JMenu MenuRelatorioTRansportadoras;
    private javax.swing.JMenu MenuRelatorioVendas;
    private javax.swing.JMenu MenuRelatorios;
    private javax.swing.JMenu MenuRelatoriosProdutos;
    private javax.swing.JMenuItem ProdOrdB;
    private javax.swing.JMenuItem itemMenuVendaDinheiro;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem menuItemCadFabricante;
    private javax.swing.JMenuItem menuItemCadTransportadoras;
    private javax.swing.JMenuItem menuItemCadastroProd;
    private javax.swing.JMenuItem menuItemCliComum;
    private javax.swing.JMenuItem menuItemCliente;
    private javax.swing.JMenuItem menuItemClientesOuro;
    private javax.swing.JMenuItem menuItemFabMaisLucro;
    private javax.swing.JMenuItem menuItemFabMaisVenda;
    private javax.swing.JMenuItem menuItemGerente;
    private javax.swing.JMenuItem menuItemProdMaisVend;
    private javax.swing.JMenuItem menuItemProdOrdA;
    private javax.swing.JMenuItem menuItemTodasVendas;
    private javax.swing.JMenuItem menuItemTodosClientes;
    private javax.swing.JMenuItem menuItemTodosEletrodomesticos;
    private javax.swing.JMenuItem menuItemTodosEletronicos;
    private javax.swing.JMenuItem menuItemTodosGerentes;
    private javax.swing.JMenuItem menuItemTodosMoveis;
    private javax.swing.JMenuItem menuItemTodosOsFabricantes;
    private javax.swing.JMenuItem menuItemTodosProdutos;
    private javax.swing.JMenuItem menuItemTodosVestuarios;
    private javax.swing.JMenuItem menuItemTransport;
    private javax.swing.JMenuItem menuItemTrasnpMaisTransp;
    private javax.swing.JMenuItem menuItemVendMesEsp;
    private javax.swing.JMenuItem menuItemVenda;
    private javax.swing.JMenuItem menuItemVendaCartao;
    private javax.swing.JMenuItem menuItemVendaClienteEspeci;
    private javax.swing.JMenuItem menuItemVendasPIX;
    // End of variables declaration//GEN-END:variables
}
