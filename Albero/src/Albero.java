/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utente 2023-24
 */
public class Albero {
    private String nome;
    private int qta;
    private float prezzo;
    private String specie;

    public Albero(String nome, int qta, float prezzo, String specie) {
        this.nome = nome;
        this.qta = qta;
        this.prezzo = prezzo;
        this.specie = specie;
    }

    public Albero() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQta() {
        return qta;
    }
    public void setQta(int qta) {
        this.qta = qta;
    }

    public float getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public String getSpecie() {
        return specie;
    }
    public void setSpecie(String specie) {
        this.specie = specie;
    }

    @Override
    public String toString() {
        return "Albero \"" + nome + "\" e di specie \"" + specie + "\" in quantità " + qta + " e prezzo " + prezzo + "€ (costo tot=" + costo() + "€)";
    }
    
    public float costo() {
        return prezzo * qta;
    }
}
