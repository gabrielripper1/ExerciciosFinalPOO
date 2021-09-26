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
public class Triangulo extends Quadrado {
    private Double base;

    public void setTriangulo(Double base, Double altura){
        this.base = base;
        this.alt = alt;
    }
    public Double area(){
        this.area = (this.base*this.alt)/2;
        return this.area;
    }
    
}
