/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Colecoes.Ex3;

/**
 *
 * @author gabri
 */
public class KaraokeMain {
    public static void main(String[] args){
        Musica Musica1 = new Musica("Hino do Flamengo");
        Musica Musica2 = new Musica("Hino do Vasco");
        Musica Musica3 = new Musica("Hino do Fluminense");
        Musica Musica4 = new Musica("Hino do Botafogo");

        Karaoke.addMs(Musica1);
        Karaoke.addMs(Musica2);
        Karaoke.addMs(Musica3);
        Karaoke.addMs(Musica4);
        Karaoke.Org();
        Karaoke.Queue(Musica1);
        Karaoke.proxMusica();
        Karaoke.Queue(Musica2);
        Karaoke.Queue(Musica3);
        Karaoke.musicaAtual();
        Karaoke.Queue(Musica4);
    }
}
