/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utente 2023-24
 */
public class RicambiAuto {
    private String tipo;
    private float prezzo;
    private int numero;
    private float dimensione;

    //Costruttori
    public RicambiAuto() {
        this.tipo = "";
        this.prezzo = 0;
        this.numero = 0;
        this.dimensione = 0;
    }
    public RicambiAuto(String tipo, float prezzo, int numero, int dimensione) {
        this.tipo = tipo;
        this.prezzo = prezzo;
        this.numero = numero;
        this.dimensione = dimensione;
    }

    //Get e set
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getDimensione() {
        return dimensione;
    }
    public void setDimensione(float dimensione) {
        this.dimensione = dimensione;
    }
    
    //Metodi
    public float calcolaPrezzo() {
        return prezzo * numero;
    }
    
    /*
     * Usato per l'inserimento dei ricambi nei log di inserimento dati
     */
    @Override
    public String toString() {
        return "Ricambio \"" + tipo + "\" x" + numero + " di prezzo " + prezzo + "€ e dimensione " + dimensione + "cm";
    }
}
