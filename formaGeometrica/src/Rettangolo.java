/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utente 2023-24
 */
public class Rettangolo {
    private float base;
    private float altezza;

    public Rettangolo(float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    
    public Rettangolo() { }

    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }

    public float getAltezza() {
        return altezza;
    }
    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }
    
    public float trovaPerimetro() {
        return (base+altezza)*2;
    }
    public float trovaArea() {
        return base*altezza;
    }
}
