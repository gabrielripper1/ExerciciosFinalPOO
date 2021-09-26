/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Colecoes.Ex1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gabri
 */
public class Palavras {
    public static void Palavras(){
        String frase = "teste do teste";
        
        Map<String, Integer> map = new HashMap<>();
        for (String str : frase.split(" ")) {
            Integer cont = map.get(String.valueOf(str));
            if (cont != null){
                map.put(String.valueOf(str), ++cont);
            }
            else{
                map.put(String.valueOf(str), 1);
            }
        }
        System.out.println("Número de ocorrências:");
        map.entrySet().forEach(str -> {
            System.out.println(str.getKey() + " apareceu " + str.getValue() + " vezes.");
        });
    }
}
