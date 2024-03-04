/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3;

/**
 *
 * @author 12046386671
 */
public class Casa {

    private String cor;
   
    Porta porta1 = new Porta();
    Porta porta2 = new Porta();
    Porta porta3 = new Porta();
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void pinta(String cor) {
        this.setCor(cor);
    }

    public int quantasPortasEstaoAbertas() {
        int quantidade = 0;
        if (porta1.estaAberta()) {
            quantidade = quantidade + 1;
        }
        if (porta2.estaAberta()) {
            quantidade = quantidade + 1;
        } 
        if (porta3.estaAberta()) {
            quantidade = quantidade + 1;
        } 
        System.out.println(quantidade + " portas estão abertas!");
        return quantidade;
    }
}
