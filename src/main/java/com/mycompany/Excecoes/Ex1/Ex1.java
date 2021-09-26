/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Excecoes.Ex1;

/**
 *
 * @author gabri
 */
public class Ex1 {
    public static void main(String[] args) {
        try{
            Double ruim = 1.0/0;
        }
        catch (IllegalArgumentException e){ // acontece quando o argumento não é compatível com o esperado
            System.out.println("Valor inválido");
        }

        try{
            Integer.parseInt("12-3");
        }
        catch(NumberFormatException e){ // acontece quando a formatação a ser convertida não faz sentido como número
            System.out.println("Formato inválido");
        }
    }    
}
