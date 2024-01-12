/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cinema3b;
import java.util.Scanner;

/**
 *
 * @author utente 2023-24
 */
public class Cinema3B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Categoria cFantasy = new Categoria("Fantasy", 1);
        Categoria cFantascienza = new Categoria("Fantascienza", 2);
        
        Film fHarryPotter = new Film("Harry Potter e la pietra filosofale", 2.5, cFantasy, 8);
        Film fStarTrek = new Film("Star Trek Beyond", 5, cFantascienza, 14);
        
        fHarryPotter.vendiBiglietto(0);
        fHarryPotter.vendiBiglietto(0);
        fHarryPotter.vendiBiglietto(50);
        fHarryPotter.vendiBiglietto(0);
        
        fStarTrek.vendiBiglietto(0);
        fStarTrek.vendiBiglietto(10);
        fStarTrek.vendiBiglietto(75);
        fStarTrek.vendiBiglietto(0);
        
        System.out.println("Incasso totale Harry Potter: "+fHarryPotter.getIncasso());
        System.out.println("Incasso totale Harry Potter: "+fStarTrek.getIncasso());
        
        System.out.println("NUOVO FILM");
        Film fNuovo = new Film();

        System.out.println("Inserisci nome:");
        String nome = input.nextLine();
        fNuovo.setNome(nome);
        
        System.out.println("Inserisci costo biglietto:");
        double costoBiglietto = input.nextDouble();
        fNuovo.setCostoBiglietto(costoBiglietto);
        
        System.out.println("Inserisci nome categoria:");
        String nomeCategoria = input.nextLine();
        
        switch (nomeCategoria) {
            case "Fantasy" -> fNuovo.setCategoria(cFantasy);
            case "Fantascienza" -> fNuovo.setCategoria(cFantascienza);
            default -> {
                Categoria cNuova = new Categoria(nomeCategoria);
                System.out.println("Inserisci sala della categoria:");
                int numSala = input.nextInt();
                cNuova.setSala(numSala);                
                fNuovo.setCategoria(cNuova);
            }
        }
        
        System.out.println("Inserisci età minima:");
        int etaMinima = input.nextInt();
        fNuovo.setEtaMinima(etaMinima);
        
        System.out.println(fNuovo._toString());
    }
}
