/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Excecoes.Ex2;

/**
 *
 * @author gabri
 */
public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente ContaCorrente = new ContaCorrente(5000);
        ContaCorrente.setValorLimite(1000000);
        
        try{
            ContaCorrente.sacar(-1);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());

        }
        ContaCorrente.sacar(10000);      
               
        try{
            ContaCorrente.sacar(1);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        ContaCorrente.depositar(600);       
        ContaCorrente.sacar(500);
        
    }
}
