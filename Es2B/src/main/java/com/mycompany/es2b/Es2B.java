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
        Giocatore matteo = new Giocatore("Matteo", "Gheza", 16);
        
        System.out.println(topolino.nome);
        System.out.println(pluto.cognome);
        System.out.println(pluto.nome);
    }
}
