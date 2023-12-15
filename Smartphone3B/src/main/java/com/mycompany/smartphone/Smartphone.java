/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartphone;

/**
 *
 * @author utente 2023-24
 */
public class Smartphone {
    private String marca;
    private String modello;
    private float prezzoDiLancio;
    private int numPollici;
    private int ram;
    private boolean touchScreen;

    public Smartphone() {
        this.marca = "";
        this.modello = "";
        this.prezzoDiLancio = 0;
        this.numPollici = 0;
        this.ram = 0;
        this.touchScreen = false;
    }

    public Smartphone(String marca, String modello, int prezzoDiLancio, int numPollici, int ram, boolean touchScreen) {
        this.marca = marca;
        this.modello = modello;
        this.prezzoDiLancio = prezzoDiLancio;
        this.numPollici = numPollici;
        this.ram = ram;
        this.touchScreen = touchScreen;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }

    public float getPrezzoDiLancio() {
        return prezzoDiLancio;
    }
    public void setPrezzoDiLancio(float prezzoDiLancio) {
        this.prezzoDiLancio = prezzoDiLancio;
    }

    public int getNumPollici() {
        return numPollici;
    }
    public void setNumPollici(int numPollici) {
        this.numPollici = numPollici;
    }

    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }
    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }
    
    public void ottieniFasciaDiPrezzo() {
        if(prezzoDiLancio > 500) {
            System.out.println("Fascia ALTA");
        } else if(prezzoDiLancio > 200) {
            System.out.println("Fascia MEDIA");
        } else {
            System.out.println("Fascia BASSA");
        }
    }
    
    public void ottieniTipologiaSmartphone() {
        if(numPollici >= 7) {
            System.out.println("Maxi");
        } else if(numPollici >= 5) {
            System.out.println("Normal");
        } else {
            System.out.println("Mini");
        }
    }

    public void tostring() {
        System.out.println("prezzoDiLancio "+prezzoDiLancio+" ram "+ram+" touchscreen "+(touchScreen ? "Si" : "No")+" marca "+marca+" modello "+modello+" numPollici "+numPollici);
    }
}
