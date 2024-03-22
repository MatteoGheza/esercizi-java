/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package artistajava;

import java.util.TreeMap;

/**
 *
 * @author utente 2023-24
 */
public class ConvertitoreRomano {
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public static String decimaleARomano(int numero) {
        int l =  map.floorKey(numero);
        if ( numero == l ) {
            return map.get(numero);
        }
        return map.get(l) + decimaleARomano(numero-l);
    }
    
    private static int processaDecimale(int decimale, int ultimoNumero, int ultimoDecimale) {
        if (ultimoNumero > decimale) {
            return ultimoDecimale - decimale;
        } else {
            return ultimoDecimale + decimale;
        }
    }
    
    public static int romanoADecimale(String numeroRomano) {
        int decimale = 0;
        int ultimoNumero = 0;
        String romanNumeral = numeroRomano.toUpperCase();
        /* operation to be performed on upper cases even if user 
           enters roman values in lower case chars */
        for (int x = romanNumeral.length() - 1; x >= 0 ; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {
                case 'M' -> {
                    decimale = processaDecimale(1000, ultimoNumero, decimale);
                    ultimoNumero = 1000;
                }

                case 'D' -> {
                    decimale = processaDecimale(500, ultimoNumero, decimale);
                    ultimoNumero = 500;
                }

                case 'C' -> {
                    decimale = processaDecimale(100, ultimoNumero, decimale);
                    ultimoNumero = 100;
                }

                case 'L' -> {
                    decimale = processaDecimale(50, ultimoNumero, decimale);
                    ultimoNumero = 50;
                }

                case 'X' -> {
                    decimale = processaDecimale(10, ultimoNumero, decimale);
                    ultimoNumero = 10;
                }

                case 'V' -> {
                    decimale = processaDecimale(5, ultimoNumero, decimale);
                    ultimoNumero = 5;
                }

                case 'I' -> {
                    decimale = processaDecimale(1, ultimoNumero, decimale);
                    ultimoNumero = 1;
                }
            }
        }
        return decimale;
    }
}
