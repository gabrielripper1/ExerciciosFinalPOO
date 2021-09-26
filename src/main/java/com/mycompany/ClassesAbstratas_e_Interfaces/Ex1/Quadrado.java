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
public class Quadrado extends Retangulo{
    public Quadrado(Double alt) {       
        super(alt);
        this.alt = alt;
    }

    
    public Double calcularArea() {
        this.area = this.alt*this.alt;
        return this.area;
    }

    
    public Double calcularPerimetro() {
        this.perimetro = this.alt*4;
        return this.perimetro;
    }
}
