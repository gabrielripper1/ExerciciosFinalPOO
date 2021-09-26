/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ConstrutoresEncapsulamento.Ex2_e_Ex3;

/**
 *
 * @author gabri
 */
public class Disciplina {

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the horasSemanais
     */
    public Integer getHorasSemanais() {
        return horasSemanais;
    }

    /**
     * @param horasSemanais the horasSemanais to set
     */
    public void setHorasSemanais(Integer horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the ementa
     */
    public String getEmenta() {
        return ementa;
    }

    /**
     * @param ementa the ementa to set
     */
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
    private String nome;
    private Integer horasSemanais;
    private String horario;
    private String ementa;
    

    public void returnHorarioAula(){}
    
    public void returnEmenta(){}
        
}
