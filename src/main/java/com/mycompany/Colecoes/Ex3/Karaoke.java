/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Colecoes.Ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

/**
 *
 * @author gabri
 */
public class Karaoke {
    private static ArrayList<Musica> Musicas = new ArrayList<>();
    private static ArrayList<String> OrdemNome = new ArrayList<>();
    private static Queue<String> filaTocaMusicas = new LinkedList<>();

    public static void addMs(Musica musica){
        Musicas.add(musica);
        OrdemNome.add(musica.getNome());
    }

    public static void Org(){
        System.out.println("Musicas:");
        Stream<String> OrdemNome = Karaoke.OrdemNome.stream().sorted(Comparator.naturalOrder());
        OrdemNome.forEach(e -> System.out.println(e));
        System.out.println();
    }

    public static void Queue(Musica musica){
        filaTocaMusicas.add(musica.getNome());        
    }

    public static void musicaAtual(){
        System.out.println("Tocando agora: "+filaTocaMusicas.peek());
    }

    public static void proxMusica(){
        System.out.println("-Música pulada-");
        filaTocaMusicas.remove();
    }
}
