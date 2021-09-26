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
public class Aluno {
    
    private String nome;
    private Boolean aprovado;
    private ArrayList<String> historico = new ArrayList();
    private ArrayList<Float> medias = new ArrayList();

    public void calculaCR(Aluno aluno){}

    public void mostraHistorico(Aluno Aluno){}
    
    public void mostraMedia(Aluno Aluno, Disciplina disciplina){}

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
     * @return the aprovado
     */
    public Boolean getAprovado() {
        return aprovado;
    }

    /**
     * @param aprovado the aprovado to set
     */
    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }

    /**
     * @return the historico
     */
    public ArrayList<String> getHistorico() {
        return historico;
    }

    /**
     * @param historico the historico to set
     */
    public void setHistorico(ArrayList<String> historico) {
        this.historico = historico;
    }

    /**
     * @return the medias
     */
    public ArrayList<Float> getMedias() {
        return medias;
    }

    /**
     * @param medias the medias to set
     */
    public void setMedias(ArrayList<Float> medias) {
        this.medias = medias;
    }
}
