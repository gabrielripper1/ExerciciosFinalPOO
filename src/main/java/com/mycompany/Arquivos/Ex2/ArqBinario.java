/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Arquivos.Ex2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class ArqBinario {
    public static void leArquivoBinario(String path) throws IOException {
        String nome;
        int reg;
        int dpt;
        int dptGer;        

        FileInputStream fis = new FileInputStream(path);
        DataInputStream dis = new DataInputStream(fis);

        nome = dis.readUTF();
        reg = dis.readInt();
        dpt = dis.readInt();
        dptGer = dis.readInt();        

        fis.close();
    }

    public static void criaArquivoBinario(String nome_do_fisuivo) throws IOException {
        Scanner Scanner = new Scanner(System.in);

        FileOutputStream fis = new FileOutputStream("C:\\Users\\lucas\\Documents\\ArquivosTeste\\"+nome_do_fisuivo+".dat");
        DataOutputStream dos = new DataOutputStream(fis);

        System.out.printf("Nome do funcionário?\n");
        String nome = Scanner.nextLine();
        dos.writeUTF(nome);

        System.out.printf("Num de registro?\n");
        int reg = Scanner.nextInt();
        dos.writeInt(reg);

        System.out.printf("Num do Departamento?\n");
        int dpt = Scanner.nextInt();
        dos.writeInt(dpt);

        System.out.printf("Num do departamento de gerencia?\n ");
        int dptGer = Scanner.nextInt();
        dos.writeInt(dptGer);

        fis.close();
    }
}
