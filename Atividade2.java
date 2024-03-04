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
public class Atividade2 {
    
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();
        
        pessoa1.setNome("Línicker");
        pessoa1.setIdade(18);
        
        System.out.println(pessoa1.getIdade());
        
        pessoa1.fazAniversario();
        
        System.out.println(pessoa1.getIdade());
        
        
        
        
    }
    
}
