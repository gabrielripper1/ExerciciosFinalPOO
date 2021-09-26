/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ClassesAbstratas_e_Interfaces.Ex1;

/**
 *
 * @author gabri
 */
public abstract class Triangulo extends FormaGeometrica{
    private Double alt;
    private Double base;    
    private Double L1;
    private Double L2;
    private Double L3;
    

    public Triangulo(Double L1, Double L2, Double L3){
        this.L1 = L1;
        this.L2 = L2;
        this.L3 = L3;
    }

    /**
     *
     * @return
     */
    public Double calcularArea() {
        Double resArea = (this.base * this.alt)/2;
        return resArea;
    }

    
    public Double calcularPerimetro() {
        this.perimetro = this.L1+this.L2+this.L3;
        return this.perimetro;
    }
}
