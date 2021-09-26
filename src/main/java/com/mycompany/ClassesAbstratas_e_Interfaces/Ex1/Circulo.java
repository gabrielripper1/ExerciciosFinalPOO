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
public class Circulo extends FormaGeometrica{
    private Double raio;

    public Circulo(Double raio){
        this.raio = raio;
    }
    
    public Double calcularArea() {
        this.area = (Double)(3.14*(this.raio*this.raio));
        return this.area;
    }

    public Double calcularPerimetro() {
        this.perimetro = (Double)(2*3.14*this.raio);
        return this.perimetro;
    }
}
