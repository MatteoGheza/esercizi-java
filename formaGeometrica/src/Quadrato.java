/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utente 2023-24
 */
public class Quadrato {
    private float lato;

    public Quadrato(float lato) {
        this.lato = lato;
    }
    
    public Quadrato() { }

    public float getLato() {
        return lato;
    }
    public void setLato(float lato) {
        this.lato = lato;
    }

    public float trovaPerimetro() {
        return lato*4;
    }
    public float trovaArea() {
        return lato*lato;
    }
}
