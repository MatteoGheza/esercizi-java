package zoo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import animali.Leone;
import java.util.Scanner;

/**
 *
 * @author utente 2023-24
 */
public class Test {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        Leone leo1 = new Leone();

        System.out.println("Come si chiama il leone?");
        leo1.setNome(input.nextLine());

        System.out.println("Di che razza è?");
        leo1.setRazza(input.nextLine());

        System.out.println("Quanti anni ha?");
        leo1.setAnno(input.nextInt());
        input.nextLine();

        System.out.println("Ha la criniera (è maschio)?");
        switch (input.nextLine()) {
            case "SI", "Si", "si", "SÌ", "Sì", "sì" -> {
                leo1.setCriniera(true);
            }
            case "NO", "No", "no" -> {
                leo1.setCriniera(false);
            }
        }
    }
}
