/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ConstrutoresEncapsulamento.Ex4;

/**
 *
 * @author gabri
 */
public class data {
    private Integer dia;
    private Integer mes;
    private Integer ano;
    private String extenso;
    private Integer diasAno;

    public data(Integer dia, Integer mes, Integer ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public data(String extenso, Integer dia, Integer ano){
        this.extenso = extenso;
        this.dia = dia;
        this.ano = ano;
    }
    public data(Integer diasAno, Integer ano){
        this.diasAno = diasAno;
        this.ano = ano;
    }

    public String Formato1(){
        return this.dia+"/"+this.mes+"/"+this.ano +";";
    }
    public String Formato2(){
        return this.extenso + " " + this.dia + ", " + this.ano +";";
    }
    public String Formato3(){
        return this.diasAno+" "+this.ano +";";
    }
}
