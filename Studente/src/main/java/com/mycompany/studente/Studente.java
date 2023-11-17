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
        this.nome = " ";
        this.cognome = " ";
        this.eta = 0;
        this.classe = 0;
        this.sezione = 'B';
        this.indirizzo = "LIC";
    }
    
    //Costruttore completo
    public Studente(String nome, String cognome, int eta, int classe, char sezione, String indirizzo) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.classe = classe;
        this.sezione = sezione;
        this.indirizzo = indirizzo;
    }
    
    //Costruttore parziale, per iscrizione dello studente a inizio anno
    public Studente(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }
    
    //Costruttore parziale, per aggiungere ad una classe uno studente generico di cui esrvirà inserire dati
    public Studente(int classe, char sezione, String indirizzo) {
        this.classe = classe;
        this.sezione = sezione;
        this.indirizzo = indirizzo;
    }
    
    //METODI SET --> Permettono di dare un valore all'attributo
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //METODI GET --> Restituiscono il valore dell'attributo
    public String getNome() {
        return nome;
    }
}
