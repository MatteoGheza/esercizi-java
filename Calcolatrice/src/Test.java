/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author utente 2023-24
 */
public class Test {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Calcolatrice c = new Calcolatrice();
        
        System.out.println("Inserisci il 1° numero:");
        c.setN1(input.nextFloat());

        System.out.println("Inserisci il 2° numero:");
        c.setN2(input.nextFloat());
        
        boolean operazioneValida = false;
        float risultato = 0;
        
        input.nextLine();
        while (!operazioneValida) {
            System.out.println("Seleziona l'operazione da effettuare:");
            System.out.println("s=somma, d=differenza, m=moltiplicazione, r=divisione");
            String operazione = input.nextLine();
            switch (operazione.toLowerCase()) {
                case "s", "somma", "sum" -> {
                    operazioneValida = true;
                    risultato = c.somma();
                }
                case "d", "differenza", "sottrazione", "subtract" -> {
                    operazioneValida = true;
                    risultato = c.differenza();
                }
                case "m", "moltiplicazione", "prodotto", "product", "moltiply" -> {
                    operazioneValida = true;
                    risultato = c.moltiplicazione();
                }
                case "r", "divisione", "rapporto", "division" -> {
                    operazioneValida = true;
                    risultato = c.divisione();
                }
                default -> {
                    System.out.println("Operazione selezionata non valida, riprova.");
                }
            }
        }
        
        System.out.println("Il risultato è "+risultato);
    }
}
