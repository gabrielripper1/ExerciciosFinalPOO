/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Atributos_e_MetodosEstaticos;

/**
 *
 * @author gabri
 */
public class ConversaoDeUnidadesDeArea {
    private static Double metros;
    private static Double cent;
    private static Double pes;
    private static Double milhas;
    private static Double acres;

    public ConversaoDeUnidadesDeArea(Double metros){
        this.metros = metros;
    }
    
    public Double getMetros() {
        return this.metros;
    }

    public Double metroPes(Double metros){
        pes = (metros*10.76);   
        return pes;
    }
    
    public static Double pesCent(Double pes){
        cent = (Double)(pes*929);
        return cent;
    }

    public static Double milhasAcres(Double milhas) {
        acres = (Double)(milhas*640);
        return acres;
    }
    public static Double acresPes(Double acres){
        acres = (Double)(acres/43.560);
        return acres;
    }

    // método para a solução do exercício 2
    public Double converteMetrosqParaAcres(){
        pes = metroPes(metros); // pes é a area em pés do estadio
        cent = pesCent(pes); // cent é a area em centímetros do estadio
        acres = acresPes(pes); // acres é a quantidades de acres do estadio
        return null;
    }
    
}
