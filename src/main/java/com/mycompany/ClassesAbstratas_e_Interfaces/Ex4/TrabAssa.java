/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ClassesAbstratas_e_Interfaces.Ex4;

/**
 *
 * @author gabri
 */
public class TrabAssa extends Funcionario{

    public TrabAssa(Double salarioBase) {
        this.salarioBase = salarioBase;
        this.salario = this.salario();
    }
    
    public Double salario() {
        this.salario = this.salarioBase * 1.1;
        return this.salario;
    }
}
