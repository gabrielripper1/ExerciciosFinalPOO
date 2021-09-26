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
public abstract class Retangulo extends FormaGeometrica{
    Double alt;
    private Double lar;

    public Retangulo(Double alt, Double lar) {
        this.alt = alt;
        this.lar = lar;
    }

    public Retangulo(Double alt) {
    }

    
    public Double calcularArea() {
        this.area = this.alt*this.lar;
        return this.area;
    }

    
    public Double calcularPerimetro() {
        this.perimetro = (this.alt*2)+(this.lar*2);
        return this.perimetro;
    }
}
