/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contasPagas;

/**
 *
 * @author 12046386671
 */
public class Programa {
    public static void main(String[] args) {
        
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        
        Clientes cliente1 = new Clientes();
        Clientes cliente2 = new Clientes();
        
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        
        cliente1.setNomeCliente("Lucas");
        cliente1.setCpf("17588831627");
        
        cliente2.setNomeCliente("Linicker");
        cliente2.setCpf("88865421526");
        
        produto1.setDescricaoProduto("Itel core i3");
        produto1.setValorProduto(600);
        
        conta1.setCli(cliente1);
        conta1.setIdConta(1);
        conta1.setPro(produto1);
        conta1.setDataPagamento("15/02/2021");
        conta1.setDataVencimento("20/05/2023");
        
        conta1.visualizarConta();
        
        
        
        
    }
}
