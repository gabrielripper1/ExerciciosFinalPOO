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
public class main {
    
    public main(String[] args){
        
        data papai = new data(12, 2, 1962);
        System.out.println(papai.Formato1());
        
        data mamae = new data(28, 12, 1962);
        System.out.println(mamae.Formato1());
    
        data casamento = new data("Novembro", 23, 1991);
        System.out.println(mamae.Formato2());
        
        data euNasci = new data("Janeiro", 23, 1994);
        System.out.println(mamae.Formato2());
        
        data qq = new data(365, 2021);
        System.out.println(mamae.Formato3());
        
        data bis = new data(366, 2020);
        System.out.println(mamae.Formato3());
    }
}
