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
public abstract class FormaGeometrica {
    Double area;
    Double perimetro;

    public Double getPerimetro() {
        return this.perimetro;
    }

    public Double getArea() {
        return this.area;
    }

    public abstract Double calcularArea();
    public abstract Double calcularPerimetro();
}
