package com.mycompany.smartphone;

public class Smartphone3B {
    private String marca;
    private String modello;
    private float prezzoDiLancio;
    private int numPollici;
    private int ram;
    private boolean touchScreen;

    public Smartphone3B() {
        this.marca = "";
        this.modello = "";
        this.prezzoDiLancio = 0;
        this.numPollici = 0;
        this.ram = 0;
        this.touchScreen = false;
    }

    public Smartphone3B(String marca, String modello, int prezzoDiLancio, int numPollici, int ram, boolean touchScreen) {
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

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
