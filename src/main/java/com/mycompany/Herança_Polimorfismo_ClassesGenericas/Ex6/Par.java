/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Herança_Polimorfismo_ClassesGenericas.Ex6;

/**
 *
 * @author gabri
 */
public class Par <F, S> {
    private F F;
    private S S;

    public Par(F F, S S){
        this.F = F;
        this.S = S;
    }

    public void setElemento1(F F) {
        this.F = F;
    }

    public F getElemento1() {
        return F;
    }

    public void setElemento2(S S) {
        this.S = S;
    }

    public S getElemento2() {
        return S;
    }
}
