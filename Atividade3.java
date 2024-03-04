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
public class Atividade3 {

    public static void main(String[] args) {

        Casa casa1 = new Casa();
        casa1.setCor("Amarela");
        casa1.porta1.abre();
        casa1.porta2.abre();
        casa1.porta3.fecha();
        
        casa1.quantasPortasEstaoAbertas();
       
        
        casa1.porta1.abre();
        casa1.porta2.abre();
        casa1.porta3.abre();
        
        casa1.quantasPortasEstaoAbertas();

    }
}
