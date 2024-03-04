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
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        
        
        func1.setAtivo(true);
        func1.setNome("Línicker");
        func1.setRg("MG256435");
        func1.setSalario(4200);
        func1.setDepartamento("TI");
        func1.setDataEntradaBanco("15/02/2020");
        
        /*
        System.out.println("Funcionario:" + func1.getNome());
        System.out.println(func1.getRg());
        System.out.println(func1.getSalario());
        System.out.println(func1.getDepartamento());
        System.out.println(func1.getDataEntradaBanco());
        System.out.println(func1.isAtivo());
        */
        
        func1.mostra();
        
        func1.bonifica(5000);
        
        System.out.println(func1.getSalario());
        
        func1.demite();
        
        System.out.println(func1.isAtivo());
    }
    
}
