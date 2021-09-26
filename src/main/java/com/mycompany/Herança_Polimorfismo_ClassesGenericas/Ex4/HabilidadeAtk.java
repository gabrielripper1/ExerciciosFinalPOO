/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Herança_Polimorfismo_ClassesGenericas.Ex4;

/**
 *
 * @author gabri
 */
public class HabilidadeAtk extends Habilidade{
    String tipo;
    String efeito;
    Integer dano;

    public HabilidadeAtk(String nome, String efeito, String tipo, Integer dano){
        super(nome, efeito);
        this.tipo = tipo;
        this.efeito = efeito;
        this.dano = dano;
    }
}
