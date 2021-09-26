/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Excecoes.Ex3;

/**
 *
 * @author gabri
 */
public class ClienteJaExistenteException extends Exception{
    public ClienteJaExistenteException(String mensagem) {
        super (mensagem);
    }
}
