/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ConstrutoresEncapsulamento.Ex2_e_Ex3;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Professor {

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
     * @return the salario
     */
    public Double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    /**
     * @return the graduacao
     */
    public String getGraduacao() {
        return graduacao;
    }

    /**
     * @param graduacao the graduacao to set
     */
    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    /**
     * @return the tempoDeContrato
     */
    public String getTempoDeContrato() {
        return tempoDeContrato;
    }

    /**
     * @param tempoDeContrato the tempoDeContrato to set
     */
    public void setTempoDeContrato(String tempoDeContrato) {
        this.tempoDeContrato = tempoDeContrato;
    }

    /**
     * @return the materias
     */
    public ArrayList<Disciplina> getMaterias() {
        return materias;
    }

    /**
     * @param materias the materias to set
     */
    public void setMaterias(ArrayList<Disciplina> materias) {
        this.materias = materias;
    }
    private String nome;
    private Double salario;
    private String graduacao;
    private String tempoDeContrato;
    
    private ArrayList<Disciplina> materias = new ArrayList();
}
