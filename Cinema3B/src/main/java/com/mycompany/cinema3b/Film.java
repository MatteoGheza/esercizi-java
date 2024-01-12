/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinema3b;

/**
 *
 * @author utente 2023-24
 */
public class Film {
    private String nome;
    private double costoBiglietto;
    private Categoria categoria;
    private int etaMinima;
    private double incasso;
    
    //Costruttore vuoto
    public Film() {
        this.nome = "";
        this.costoBiglietto = 0.0;
        this.categoria = new Categoria();
        this.etaMinima = 0;
        this.incasso = 0.0;
    }
    
    //Costruttore pieno
    public Film(String nome, double costoBiglietto, Categoria categoria, int etaMinima, double incasso) {
        this.nome = nome;
        this.costoBiglietto = costoBiglietto;
        this.categoria = categoria;
        this.etaMinima = etaMinima;
        this.incasso = incasso;
    }
    
    //Costruttore parziale
    public Film(String nome, double costoBiglietto, Categoria categoria, int etaMinima) {
        this.nome = nome;
        this.costoBiglietto = costoBiglietto;
        this.categoria = categoria;
        this.etaMinima = etaMinima;
        this.incasso = 0.0;
    }
    
    //Metodi get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getCostoBiglietto() {
        return costoBiglietto;
    }
    public void setCostoBiglietto(double costoBiglietto) {
        this.costoBiglietto = costoBiglietto;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public int getEtaMinima() {
        return etaMinima;
    }
    public void setEtaMinima(int etaMinima) {
        this.etaMinima = etaMinima;
    }
    
    public double getIncasso() {
        return incasso;
    }
    public void setIncasso(double incasso) {
        this.incasso = incasso;
    }
    
    //Metodi e funzioni
    public void vendiBiglietto(int percSconto) {
        double sconto = costoBiglietto*percSconto / 100;
        double prezzoScontato = costoBiglietto-sconto;
        
        incasso += prezzoScontato;
    }
    
    public String _toString() {
        return "Film '"+nome+"' "+categoria.getNome()+" dal biglietto del costo di "+costoBiglietto+" proiettato nella sala "+categoria.getSala();
    }
}
