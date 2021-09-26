/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ClassesAbstratas_e_Interfaces.Ex5;

/**
 *
 * @author gabri
 */
public class Servico {
    private String descricao;
    private int horas;
    private Double precoHora;

    public Servico(String descricao, int horas, Double precoHora) {
        this.descricao = descricao;
        this.horas = horas;
        this.precoHora = precoHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getHoras() {
        return horas;
    }

    public Double getPrecoHora() {
        return precoHora;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }
}
