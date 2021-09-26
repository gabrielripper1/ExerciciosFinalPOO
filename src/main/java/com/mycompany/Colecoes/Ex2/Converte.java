/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Colecoes.Ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author gabri
 */
public class Converte {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("The");
        al.add("Cake");
        al.add("is");
        al.add("a");
        al.add("Lie");
        System.out.println(al);

        Set<String> hs = new HashSet<>(al);
        System.out.println(hs);

        PriorityQueue<String> pq = new PriorityQueue<>(hs);
        System.out.println(pq);

        TreeSet<String> ts = new TreeSet<>(pq);
        System.out.println(ts);
    }
}
