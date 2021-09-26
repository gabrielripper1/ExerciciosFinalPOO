/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Herança_Polimorfismo_ClassesGenericas.Ex5;

/**
 *
 * @author gabri
 */
public enum DiaDaSemana {
    SEGUNDA(0), TERÇA(1), QUARTA(2), QUINTA(3), SEXTA(4), SABADO(5), DOMINGO(6);   
       
    private Integer dia;
    
    DiaDaSemana(Integer dia){
        this.dia = dia;
    }
    
    public boolean ehDiaUtil(){
        if (dia < 5){
            return true;
        }else{
            return false;
        }
    }
}
