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
public class Bicicleta implements CarbonFootprint{
    private String dono;
    private Integer dist;

    public Bicicleta(String dono, Integer dist){
        this.dono = dono;
        this.dist = dist;
    }

    public Integer getCarbonFootprInteger() {
        Integer carb = 10;
        carb += 10*dist; 
        return carb;
    }

    
    public String getDono() {
        return this.dono;
    }

    @Override
    public Double getCarbonFootprint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getIdentificador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
