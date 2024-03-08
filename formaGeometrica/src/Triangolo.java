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
    private float lato1;
    private float lato2;
    private float lato3;

    public Triangolo(float lato1, float lato2, float lato3) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    public Triangolo() {
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
        return lato1+lato2+lato3;
    }
    public float trovaArea() {
        float semiPerimetro = trovaPerimetro()/2;
        return (float) Math.sqrt(semiPerimetro*(semiPerimetro-lato1)*(semiPerimetro-lato2)*(semiPerimetro-lato3));
    }
}
