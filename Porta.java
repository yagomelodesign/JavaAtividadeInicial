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
public class Porta {

    private boolean aberta;
    private String cor;
    private double dimensaoX, dimensaoY, dimensaoZ;

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public void abre() {
        this.setAberta(true);
    }

    public void fecha() {
        this.setAberta(false);
    }

    public void pinta(String cor) {
        this.cor = cor;
        System.out.println("Porta pintada para: " + cor);
    }

    public boolean estaAberta() {
        return this.isAberta();
    }

}
