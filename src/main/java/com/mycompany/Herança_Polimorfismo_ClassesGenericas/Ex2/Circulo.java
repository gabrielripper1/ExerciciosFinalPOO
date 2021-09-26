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
public class Circulo extends Quadrado {
    private Double raio;

    public void setCirculo(Double raio){
        this.raio = raio;
    }
    public Double area(){
        this.area = (Double)(3.1415*(this.raio*this.raio));
        return this.area;
    }
}
