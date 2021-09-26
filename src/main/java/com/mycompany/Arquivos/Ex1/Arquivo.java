package com.mycompany.Arquivos.Ex1;


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
public class Arquivo {
    public static void showArq(String arquivo) throws IOException {
        Scanner Scanner = new Scanner(System.in);

        FileWriter fw = new FileWriter("fwuivo.txt");
        PrintWriter pw = new PrintWriter(fw);

        int dm = Scanner.nextInt();
        pw.printf("Dia do mês: " + dm + "\n");
        
        double tMin = Scanner.nextDouble();        
        double tMax = Scanner.nextDouble();
        pw.printf("Temperatura máxima: "+ tMax +"\n");
        pw.printf("Temperatura mínima: "+ tMin +"\n");

        int ind = Scanner.nextInt();
        pw.printf("Índice pluviométrico: " + ind + "\n");

        fw.close();
    }
}
