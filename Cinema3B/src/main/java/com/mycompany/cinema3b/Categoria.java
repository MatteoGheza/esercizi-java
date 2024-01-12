/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinema3b;

/**
 *
 * @author utente 2023-24
 */
public class Categoria {
    private String nome;
    private int sala;
    
    //Costruttore vuoto
    public Categoria() {
        this.nome = "";
        this.sala = 0;
    }
    
    //Costruttore pieno
    public Categoria(String nome, int sala) {
        this.nome = nome;
        this.sala = sala;
    }
    
    //Costruttore parziale
    public Categoria(String nome) {
        this.nome = nome;
        this.sala = 0;
    }
    
    //Metodi get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getSala() {
        return sala;
    }
    public void setSala(int sala) {
        this.sala = sala;
    }
}
