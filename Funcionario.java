/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

/**
 *
 * @author 12046386671
 */
public class Funcionario {

    private String nome, departamento, dataEntradaBanco, rg;
    private double salario;
    private boolean ativo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataEntradaBanco() {
        return dataEntradaBanco;
    }

    public void setDataEntradaBanco(String dataEntradaBanco) {
        this.dataEntradaBanco = dataEntradaBanco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void bonifica(double valor) {
        this.salario = this.salario + valor;
    }

    public void demite() {
        this.ativo = false;
    }
    
    
    public void mostra(){
        System.out.println("Funcionario: " + this.getNome());
        System.out.println(this.getDepartamento());
        System.out.println(this.getDataEntradaBanco());
        System.out.println(this.getRg());
        System.out.println(this.getSalario());
        System.out.println("Ativo:" + this.isAtivo());
    }

}
