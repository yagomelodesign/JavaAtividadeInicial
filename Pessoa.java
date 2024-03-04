/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

/**
 *
 * @author 12046386671
 */
public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void fazAniversario(){
        this.idade = this.idade + 1;
        
        System.out.println("Pessoa: " + this.getNome() + " fez aniversário");
        System.out.println("Idade: " + this.getIdade());
    }
}
