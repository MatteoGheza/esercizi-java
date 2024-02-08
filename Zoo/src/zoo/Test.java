package zoo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import animali.Leone;
import animali.Panda;
import java.util.Scanner;

/**
 *
 * @author utente 2023-24
 */
public class Test {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        Leone[] leoni = {};
        Panda[] panda = {};
        
        for(int i=0; i < 4; i++) {
            Leone l = new Leone();
            
            System.out.println("Come si chiama il leone?");
            l.setNome(input.nextLine());

            System.out.println("Di che razza è?");
            l.setRazza(input.nextLine());

            System.out.println("Quanti anni ha?");
            l.setAnno(input.nextInt());
            input.nextLine();

            System.out.println("Ha la criniera (è maschio)?");
            switch (input.nextLine()) {
                case "SI", "Si", "si", "SÌ", "Sì", "sì", "S", "s", "y", "Y" -> {
                    l.setCriniera(true);
                }
                default -> {
                    l.setCriniera(false);
                }
            }
            
            leoni[i] = l;
        }
        
        for(int i=0; i < 4; i++) {
            Panda p = new Panda();
            
            System.out.println("Come si chiama il panda?");
            p.setNome(input.nextLine());

            System.out.println("Di che razza è?");
            p.setRazza(input.nextLine());

            System.out.println("Quanti anni ha?");
            p.setAnno(input.nextInt());
            input.nextLine();

            System.out.println("Di che sesso è?");
            p.setSesso(input.nextLine());
            
            System.out.println("Che provevienza ha?");
            p.setProvenienza(input.nextLine());
            
            panda[i] = p;
        }
        
        for(int i=0; i < 4; i++) {
            System.out.println("Leone "+i+": "+leoni[i].getNome());
            System.out.println(leoni[i].calcolaPrezzo());
            System.out.println("Panda "+i+": "+panda[i].getNome());
            System.out.println(panda[i].calcolaPrezzo());
        }
    }
}
