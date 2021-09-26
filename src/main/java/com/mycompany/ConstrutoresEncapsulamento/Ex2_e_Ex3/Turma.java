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
public class Turma {

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
     * @return the capacidade
     */
    public Integer getCapacidade() {
        return capacidade;
    }

    /**
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * @return the qtdDeAlunos
     */
    public Integer getQtdDeAlunos() {
        return qtdDeAlunos;
    }

    /**
     * @param qtdDeAlunos the qtdDeAlunos to set
     */
    public void setQtdDeAlunos(Integer qtdDeAlunos) {
        this.qtdDeAlunos = qtdDeAlunos;
    }

    /**
     * @return the alunos
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    /**
     * @return the disc
     */
    public ArrayList<Disciplina> getDisc() {
        return disc;
    }

    /**
     * @param disc the disc to set
     */
    public void setDisc(ArrayList<Disciplina> disc) {
        this.disc = disc;
    }
    
    private String nome;
    private Integer capacidade;
    private Integer qtdDeAlunos;
    
    private ArrayList<Aluno> alunos = new ArrayList();
    private ArrayList<Disciplina> disc = new ArrayList();
    
    public void pegaHorarioAula(){}
}
