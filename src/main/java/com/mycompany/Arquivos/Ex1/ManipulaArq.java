/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Arquivos.Ex1;

/**
 *
 * @author gabri
 */
public class ManipulaArq {
    public static void main(String[] args) throws Exception {
        Arquivo.showArq("arquivo.txt");   
        Altera.addDado("arquivo.txt");
    }
}
