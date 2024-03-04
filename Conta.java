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
public class Conta {

    private int idConta;
    private String dataVencimento, dataPagamento;
    private Produto pro;
    private Clientes cli;

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Produto getPro() {
        return pro;
    }

    public void setPro(Produto pro) {
        this.pro = pro;
    }

    public Clientes getCli() {
        return cli;
    }

    public void setCli(Clientes cli) {
        this.cli = cli;
    }

    public void visualizarConta() {
        System.out.println("Identificador da conta: " + this.getIdConta());
        System.out.println("Nome Produto: " + this.pro.getDescricaoProduto());
        System.out.println("Nome e CPF cliente: " + this.cli.getNomeCliente() + " " +  this.cli.getCpf());
        System.out.println("Valor do produto: " + this.pro.getValorProduto());
        System.out.println("data do vencimento: " + this.getDataVencimento());
        System.out.println("data do pagamento: " + this.getDataPagamento());
    }
}
