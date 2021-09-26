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
public class CadastroCliente {
    public static Cliente[] clientes = new Cliente[20];

    public static void inserir(Cliente cliente) throws RepositorioException, ClienteJaExistenteException {
        if (clientes[20] != null){
            throw new RepositorioException("Banco de dados sem espaço.");
        }
        for (int i=0; i<clientes.length; i++){
            if (clientes[i] != null){
                if (clientes[i].getCPF() == cliente.getCPF()){
                    throw new ClienteJaExistenteException("Cliente já cadastrado.");
                }
            }
            if (clientes[i] == null){
                clientes[i] = cliente;
                break;
            }
        }
    }

    public static void buscar(Cliente cliente) throws ClienteInexistenteException {
        boolean verif_existencia = false;
        for (int i=0; i<clientes.length; i++){
            if (clientes[i] != null) {
                if (cliente.getCPF() == clientes[i].getCPF()) {
                    System.out.println("CPF: " + cliente.getCPF());
                    verif_existencia = true;
                    break;
                }
            }
        }
        if (verif_existencia == false){
            throw new ClienteInexistenteException("Cliente não existe.");
        }
    }
}
