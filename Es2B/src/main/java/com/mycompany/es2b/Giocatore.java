/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.es2b;

/**
 *
 * @author utente 2023-24
 */
public class Giocatore {
    public String nome;
    public String cognome;
    private int eta;
    private String ruolo;
    private int golFatti;
    private int golNazionale;
    
    public Giocatore() {
        this.nome = "";
        this.cognome = "";
        this.eta = 0;
        this.ruolo = "";
        this.golFatti = 0;
        this.golNazionale = 0;
    }
    
    public Giocatore(String nome, String cognome, int eta, String ruolo, int golFatti, int golNazionale) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.ruolo = ruolo;
        this.golFatti = golFatti;
        this.golNazionale = golNazionale;
    }
    
    public Giocatore(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.ruolo = "";
        this.golFatti = 0;
        this.golNazionale = 0;
    }
    
    public int getEta() {
        return eta;
    }
    public String getRuolo() {
        return ruolo;
    }
    public int getGolFatti() {
        return golFatti;
    }
    public int getGolNazionale() {
        return golNazionale;
    }
    
    public void setEta(int eta) {
        this.eta = eta;
    }
    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }
    public void setGolFatti(int golFatti) {
        this.golFatti = golFatti;
    }
    public void setGolNazionale(int golNazionale) {
        this.golNazionale = golNazionale;
    }

    //METODI
    public int totaleGol() {
        return golFatti + golNazionale;
    }
    
    public String cognomeGiocatoreMigliore(Giocatore g2) {
        if(this.getGolFatti() > g2.getGolFatti()) {
            return this.cognome;
        } else {
            return g2.cognome;
        }
    }
}
