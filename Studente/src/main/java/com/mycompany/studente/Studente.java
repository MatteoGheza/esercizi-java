/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.studente;

/**
 *
 * @author utente 2023-24
 */
public class Studente {
    private int eta;
    private String nome;
    private String cognome;
    private int classe; //3
    private char sezione; //B
    private String indirizzo; //LIC

    //Costruttore vuoto
    public Studente() {
        this.eta = 0;
        this.nome = " ";
        this.cognome = " ";
        this.classe = 0;
        this.sezione = 'B';
        this.indirizzo = "LIC";
    }
    
    //Costruttore completo
    public Studente(int eta, String nome, String cognome, int classe, char sezione, String indirizzo) {
        this.eta = eta;
        this.nome = nome;
        this.cognome = cognome;
        this.classe = classe;
        this.sezione = sezione;
        this.indirizzo = indirizzo;
    }
}
