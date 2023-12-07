/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.es2b;

/**
 *
 * @author utente 2023-24
 */
public class Allenatore {
    public String nome;
    public String cognome;
    private int eta;
    private int anniAttivita;
    private String squadraAttuale;
    private String squadraPassata;
    private int nTrofei;
    
    public Allenatore() {
        this.nome = "";
        this.cognome = "";
        this.eta = 0;
        this.anniAttivita = 0;
        this.squadraAttuale = "";
        this.squadraPassata = "";
        this.nTrofei = 0;
    }
    
    public Allenatore(String nome, String cognome, int eta, int anniAttivita, String squadraAttuale, String squadraPassata, int nTrofei) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.anniAttivita = 0;
        this.squadraAttuale = squadraAttuale;
        this.squadraPassata = squadraPassata;
        this.nTrofei = nTrofei;
    }
    
    public Allenatore(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.anniAttivita = 0;
        this.squadraAttuale = "";
        this.squadraPassata = "";
        this.nTrofei = 0;
    }
    
    public int getEta() {
        return eta;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getAnniAttivita() {
        return anniAttivita;
    }
    public void setAnniAttivita(int anniAttivita) {
        this.anniAttivita = anniAttivita;
    }

    public String getSquadraAttuale() {
        return squadraAttuale;
    }
    
    public String getSquadraPassata() {
        return squadraPassata;
    }

    public int getNTrofei() {
        return nTrofei;
    }
    public void setNTrofei(int nTrofei) {
        this.nTrofei = nTrofei;
    }
    
    public void cambiaSquadra(String nuovaSquadra) {
        this.squadraPassata = this.squadraAttuale;
        this.squadraAttuale = nuovaSquadra;
    }
    
    public void palloneOro() {
        int diff = 0;
        if(this.nTrofei >= 3) {
            System.out.println("Hai vinto il pallone d'oro.");
        } else {
            diff = 3 - nTrofei;
            if(diff == 1) {
                System.out.println("Per vincere il pallone d'oro ti manca 1 trofeo.");
            } else {
                System.out.println("Per vincere il pallone d'oro ti mancano "+diff+" trofei.");
            }
        }
    }
}
