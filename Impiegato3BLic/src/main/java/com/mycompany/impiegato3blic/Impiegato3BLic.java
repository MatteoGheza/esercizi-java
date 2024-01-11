/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.impiegato3blic;
import java.util.Scanner;

/**
 *
 * @author utente 2023-24
 */
public class Impiegato3BLic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Impiegato pippo = new Impiegato("Pippo", "Rossi", 21, 5000, 2);
        System.out.println("Nome: "+pippo.getNome()+" Cognome: "+pippo.getCognome());
        
        Impiegato pluto = new Impiegato();
        System.out.println("Impiegato pluto");
        System.out.println("Inserisci nome:");
        String nome = input.nextLine();
        pluto.setNome(nome);
        
        System.out.println("Inserisci cognome:");
        String cognome = input.nextLine();
        pluto.setCognome(cognome);
        
        System.out.println("Inserisci eta:");
        int eta = input.nextInt();
        pluto.setEta(eta);
        
        System.out.println("Inserisci stipendio:");
        int stipendio = input.nextInt();
        pluto.setStipendio(stipendio);
        
        System.out.println("Inserisci anni anzianità:");
        int anniAnzianita = input.nextInt();
        pluto.setAnniAnzianita(anniAnzianita);
        
        System.out.println("Se l'impiegato "+pluto.getCognome()+" "+pluto.getNome()+" ha più di 20 anni di anzianità,");
        System.out.println("lo stipendio verrà maggiorato del 25%");
        pluto.calcolaPensione();
        
        String informazioniPluto = pluto._toString();
        System.out.println(informazioniPluto);
    }
}
