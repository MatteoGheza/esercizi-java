/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utente 2023-24
 */
public class Calcolatrice {
    private float n1;
    private float n2;

    public Calcolatrice(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Calcolatrice() {
    }

    public float getN1() {
        return n1;
    }
    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }
    public void setN2(float n2) {
        this.n2 = n2;
    }
    
    //Metodi
    public float somma() {
        return n1 + n2;
    }
    public float differenza() {
        return n1-n2;
    }
    public float moltiplicazione() {
        return n1*n2;
    }
    public float divisione() {
        if (n2 != 0) {
            return n1/n2;
        } else {
            System.err.println("La divisione non può essere svolta");
            return 0;
        }
    }
}
