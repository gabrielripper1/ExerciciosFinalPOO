package com.mycompany.Arquivos.Ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class Altera {
    public static void Altera(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
            } else
                break;
            linha = br.readLine();
        }
        br.close();
    }

    public static void addDado(String path) throws Exception {
        System.out.println();
        Scanner Scanner = new Scanner(System.in);

        FileWriter fw = new FileWriter(path,true);
        PrintWriter pw = new PrintWriter(fw);

        int dm = Scanner.nextInt();
        pw.printf("\nDia do mês: "+ dm +"\n");

        double tMin = Scanner.nextDouble();
        double tMax = Scanner.nextDouble();
        pw.printf("Temperatura mínima: "+ tMin +"\n");      
        pw.printf("Temperatura máxima: "+ tMax +"\n");
        
        int ip = Scanner.nextInt();
        pw.printf("Índice pluviométrico: "+ ip +"\n");

        System.out.print("Digite 1 para adicionar mais dados");
        String verifentrada = Scanner.next();
        if (verifentrada.equals(1)) {
            addDado(path);
            System.out.println("Parabéns, você registrou mais um dado.");
        }
        
        fw.close();
    }
}
