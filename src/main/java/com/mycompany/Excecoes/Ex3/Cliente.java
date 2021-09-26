/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Excecoes.Ex3;

/**
 *
 * @author gabri
 */
public class Cliente {
    private String CPF;
    
    

    public void setCPF(String CPF) throws CPFInvalido {
        if(CPF.length() != 11){
            throw new CPFInvalido("CPF Inválido.");
        }
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }
    
    

}
