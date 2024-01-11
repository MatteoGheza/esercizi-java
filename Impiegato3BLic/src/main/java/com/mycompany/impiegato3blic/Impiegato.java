/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impiegato3blic;

/**
 *
 * @author utente 2023-24
 */
public class Impiegato {
    private String nome;
    private String cognome;
    private int eta;
    private int stipendio;
    private int anniAnzianita;
    
    //Costruttori
    public Impiegato() {
        this.nome = "";
        this.cognome = "";
        this.eta = 0;
        this.stipendio = 0;
        this.anniAnzianita = 0;
    }
    
    public Impiegato(String nome, String cognome, int eta, int stipendio, int anniAnzianita) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.stipendio = stipendio;
        this.anniAnzianita = anniAnzianita;
    }
    
    //Metodi get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    public int getEta() {
        return eta;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }
    
    public int getStipendio() {
        return stipendio;
    }
    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }
    
    public int getAnniAnzianita() {
        return anniAnzianita;
    }
    public void setAnniAnzianita(int anniAnzianita) {
        this.anniAnzianita = anniAnzianita;
    }
    
    //Metodo calcolaPensione
    public void calcolaPensione() {
        if(anniAnzianita > 20) {
            stipendio += stipendio*25/100;
        }
    }
    
    //Metodo toString personalizzato
    public String _toString() {
        return "Impiegato "+this.nome+" "+this.cognome+" di "+this.eta+" anni, con stipendio di "+this.stipendio+" euro e "+this.anniAnzianita+" anni di anzianità.";
    }
}
