/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Herança_Polimorfismo_ClassesGenericas.Ex4;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Pokemon {
    private String nome;
    private String tipo;
    private Integer lvl;
    private Integer HP;
    private Integer Atk;
    private Integer SPAtk;
    private Integer Def;
    private Integer SPDef;
    private Integer Spd;
    private ArrayList<HabilidadeAtk> ataquesAprendidos = new ArrayList<>();
    private ArrayList<Habilidade> habilidadesAprendidas = new ArrayList<>();

    public Pokemon(String nome, String tipo, Habilidade habilidade){
        this.tipo = tipo;
        String tipos[];
        tipos = new String[2];
        tipos[0] = "Fogo";
        tipos[1] = "Agua";
        tipos[2] = "Eletrico";
        for(int i = 0 ; i<tipos.length ; i++){
            String temp = tipos[i];
            String type = "Fogo";
            if(temp == type){
                // seta atributos do pokemon
            }
        }
    }
    
    
}