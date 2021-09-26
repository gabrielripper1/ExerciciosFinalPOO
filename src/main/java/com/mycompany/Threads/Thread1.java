/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Threads;

/**
 *
 * @author gabri
 */
public class Thread1 extends Thread {
    private String nome;
    
    public Thread1(String nome){
        this.nome = nome;
        start();
    }
    
    public int checkPar(int n){
        int cont = n;
        for (int i = 0; i<n; i++){
            int temp = i/2;
            if(temp == 0){
                cont -= 1;
            }
        }
        return cont;
    }
}
