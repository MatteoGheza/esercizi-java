/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.es2b;

/**
 *
 * @author utente 2023-24
 */
public class Es2B {

    public static void main(String[] args) {
        Giocatore topolino = new Giocatore("TopoDisney", "Malefico", 95, "portiere", 515, 58);
        Giocatore pluto = new Giocatore();
        Giocatore pippo = new Giocatore("Pippo", "Bianchi", 56, "attaccante", 24, 2);
        
        System.out.println("Nome di topolino: " + topolino.nome);
        System.out.println("Nome di pluto: " + pluto.cognome);
        System.out.println("Nome di pippo: " + pippo.nome);
        
        topolino.nome = "Topolino";
        System.out.println("Nome di topolino: " + topolino.nome);
        
        pippo.setEta(19);
        System.out.println("Età di pippo: " + pippo.getEta());
        
        Giocatore matteo = new Giocatore("Matteo", "Ghezza", 16);
        System.out.println("Età di matteo: " + matteo.getEta());
        matteo.setEta(17);
        System.out.println("Età di matteo: " + matteo.getEta());
        
        System.out.println("Ruolo di matteo: " + matteo.getRuolo());
        matteo.setRuolo("Panchinaro");
        System.out.println("Ruolo di matteo: " + matteo.getRuolo());
        
        System.out.println("Cognome di matteo: " + matteo.cognome);
        matteo.cognome = "Gheza";
        System.out.println("Cognome di matteo: " + matteo.cognome);
    }
}
