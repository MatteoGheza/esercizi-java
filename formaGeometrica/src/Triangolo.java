/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.lang.Math;

/**
 *
 * @author utente 2023-24
 */
public class Triangolo {
    public int tipo;

    private float lato;
    
    private float base;
    private float altezza;
    
    private float lato1;
    private float lato2;
    private float lato3;

    public Triangolo(float lato) {
        this.tipo = 1;
        this.lato = lato;
    }
    
    public Triangolo(float base, float altezza) {
        this.tipo = 2;
        this.base = base;
        this.altezza = altezza;
    }
    
    public Triangolo(float lato1, float lato2, float lato3) {
        this.tipo = 3;
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    public Triangolo() {
    }

    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public float getLato() {
        return lato;
    }
    public void setLato(float lato) {
        this.lato = lato;
    }

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

    public float getLato1() {
        return lato1;
    }
    public void setLato1(float lato1) {
        this.lato1 = lato1;
    }
    public float getLato2() {
        return lato2;
    }
    public void setLato2(float lato2) {
        this.lato2 = lato2;
    }
    public float getLato3() {
        return lato3;
    }
    public void setLato3(float lato3) {
        this.lato3 = lato3;
    }
    
    public float trovaPerimetro() {
        return switch (tipo) {
            case 1 -> 3*lato;
            case 2 -> base+altezza+(float)Math.sqrt(base*base+lato*lato);
            default -> lato1+lato2+lato3;
        };
    }
    public float trovaArea() {
        switch(tipo) {
            case 1 -> {
                return (float) Math.sqrt(3)/4 * lato*lato;
            }
            case 2 -> {
                return base * altezza / 2;
            }
            case 3 -> {
                float semiPerimetro = trovaPerimetro()/2;
                return (float) Math.sqrt(semiPerimetro*(semiPerimetro-lato1)*(semiPerimetro-lato2)*(semiPerimetro-lato3));
            }
        }
        return 0;
    }
}
