/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Herança_Polimorfismo_ClassesGenericas.Ex2;

/**
 *
 * @author gabri
 */
public class Quadrado {
    
    Double alt;
    Double lar;
    Double area;

    /**
     * @return the alt
     */
    public Double getAlt() {
        return alt;
    }

    /**
     * @param alt the alt to set
     */
    public void setAlt(Double alt) {
        this.alt = alt;
    }

    /**
     * @return the lar
     */
    public Double getLar() {
        return lar;
    }

    /**
     * @param lar the lar to set
     */
    public void setLar(Double lar) {
        this.lar = lar;
    }
    
    public Double area(){
        this.area = this.alt*this.lar;
        return this.area;
    }
    
    
}
