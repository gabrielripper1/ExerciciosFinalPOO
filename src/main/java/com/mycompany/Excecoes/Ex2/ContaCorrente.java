/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Excecoes.Ex2;

/**
 *
 * @author gabri
 */
public class ContaCorrente {
    private float limite;
    private float saldo;
    private float valorLimite;

    public ContaCorrente(float saldo){
        this.saldo = saldo;
    }

    public void sacar(float valor) {
        if (valor<0){
            throw new IllegalArgumentException("Valor negativo.");
        }
        else{
            if (valor>=this.getSaldo() && !(valor>this.getSaldo() && (valor - this.getSaldo()>this.limite))){
                this.limite -= (valor - this.getSaldo());
                this.saldo = 0;
            }
            else if (valor>=this.getSaldo() && (valor - this.getSaldo()>this.limite)){
                throw new IllegalArgumentException("Você não possui saldo.");
            }
            else{
                this.saldo -= valor;
            }
        }
    }

    public void depositar(float valor) {
        if (valor<0){
            throw new IllegalArgumentException("Valor negativo.");
        }
        this.saldo += valor;
    }

    public void setValorLimite(float valorLimite) {
        this.valorLimite = valorLimite;
        this.limite = valorLimite;
    }    

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public float getValorLimite() {
        return valorLimite;
    }
}
