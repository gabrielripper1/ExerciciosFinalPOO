/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ClassesAbstratas_e_Interfaces.Ex2_e_Ex3;

/**
 *
 * @author gabri
 */
public abstract class Carro implements CarbonFootprint{
    private String dono;
    private Double dist;

    public Carro(String dono, Double km_percorridos){
        this.dono = dono;
        this.dist = dist;
    }
    
    public Double getCarbonFootprInteger() {
        Double carb = 234.0;
        carb += 234*dist;
        return carb;
    }
    
    public String getIdentificador() {
        return this.dono;
    }
}
