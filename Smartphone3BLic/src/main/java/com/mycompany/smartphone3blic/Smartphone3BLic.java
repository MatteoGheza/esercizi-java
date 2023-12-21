package com.mycompany.smartphone3blic;
import java.util.Scanner;

public class Smartphone3BLic {
    public static void main(String[] args) {
        Smartphone m1 = new Smartphone();
        /*
        Smartphone m2 = new Smartphone("Sanung", "A20Esimo", 150, 6, 4, true);
        m2.tostring();
        */
        
        //Creo l'oggetto che mi permette di memorizzare ciò che l'utente digita
        Scanner input = new Scanner(System.in);

        System.out.println("Ciao, mi dici la marca del tuo telefono?");
        String marca = input.nextLine();
        m1.setMarca(marca);
        
        System.out.println("Ciao, mi dici il modello del tuo telefono?");
        String modello = input.nextLine();
        m1.setModello(modello);
        
        System.out.println("Ciao, mi dici il prezzo di lancio del tuo telefono?");
        float prezzoDiLancio = input.nextFloat();
        m1.setPrezzoDiLancio(prezzoDiLancio);
        
        System.out.println("Ciao, mi dici il numero di pollici del tuo telefono?");
        int numPollici = input.nextInt();
        m1.setNumPollici(numPollici);
        
        System.out.println("Ciao, mi dici la misura della RAM del tuo telefono?");
        int ram = input.nextInt();
        m1.setRam(ram);
        
        System.out.println("Hai opzione touch screen? Rispondi SI oppure NO.");
        String rTouchScreen = input.nextLine();
        switch(rTouchScreen) {
            case "SI", "Si", "si", "SÌ", "Sì", "sì" -> {
                m1.setTouchScreen(true);
            }
            case "NO", "No", "no" -> {
                m1.setTouchScreen(false);
            }
        }
        
        System.out.println("Fascia di prezzo:");
        m1.ottieniFasciaDiPrezzo();
        
        System.out.println("Tipologia smartphone:");
        m1.ottieniTipologiaSmartphone();
    }
}
