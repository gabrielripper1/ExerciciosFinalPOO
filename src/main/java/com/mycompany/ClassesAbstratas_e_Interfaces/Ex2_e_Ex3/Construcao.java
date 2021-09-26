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
public abstract class Construcao implements CarbonFootprint{
    private String cd;
    private Integer pessoas;
    private boolean energReno;
    private Integer lamps;
    private boolean arCond;

    public Construcao(String cd, Integer pessoas, Integer lamps, boolean arCond, boolean energReno){
        this.cd = cd;
        this.pessoas = pessoas;
        this.lamps = lamps;
        this.arCond = arCond;
        this.energReno = energReno;
    }
    
    public Double getCarbonFootprInteger() {
        Double carb = 0.0;
        carb += pessoas;
        if (energReno == true){
            carb += lamps;
        }
        else{
            carb += lamps;
        }
        if (arCond == true){
            carb += pessoas;
        }

        return carb;
    }

    public String getIdentificador() {
        return this.cd;
    }
}
