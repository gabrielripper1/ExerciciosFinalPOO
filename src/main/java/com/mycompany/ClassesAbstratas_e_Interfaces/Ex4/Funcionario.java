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
public abstract class Funcionario {
    protected Double salario;
    protected Double trabHora;
    protected Double salarioBase;
    protected Double horas;
    protected Integer vendas;

    public abstract Double salario();

    public Double getSalario() {
        return salario;
    }
}
