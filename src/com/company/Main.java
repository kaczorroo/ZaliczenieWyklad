package com.company;


/**
 * Temat: Wyznaczania średniej arytmetycznej, odchylenia standardowego i wariancji ciągu n liczb oraz min i max.
 */

public class Main {

    public static void main(String[] args) {
        double[] ciag = {11, 20, 40, 30, 99, 30, 50};
        System.out.println("Suma wszystkich wyrazow ciagu wynosi: " + sumaWyrazow(ciag));
        System.out.println("Ilosc wyrazow w ciagu wynosi: " + ciag.length);
        System.out.println("Srednia arytmetyczna ciagu wynosi: " + sredniaArytmetyczna(ciag));
        najmniejsza(ciag);
        najwieksza(ciag);
        System.out.println("Wariancja ciagu wynosi: " + wariancja(ciag));
        System.out.println("Odchylenie Standardowe wynosi: " + odchylenieStandardowe(ciag));
        System.out.println("");
        System.out.println("Wykonal: Daniel Kaczorowski");
        System.out.println("Koniec programu.");
    }

    private static double sumaWyrazow(double[] ciag) {
        double suma = 0;
        for (double i : ciag) {
            suma = suma + i;
        }
        return suma;
    }

    private static double sredniaArytmetyczna(double[] ciag) {
        double srednia = sumaWyrazow(ciag) / ciag.length;
        return srednia;
    }

    private static void najmniejsza(double[] ciag) {
        double najmniejsza = ciag[0];
        for (double i : ciag) {
            if (i < najmniejsza) {
                najmniejsza = i;
            }
        }
        System.out.println("Wartosc minimalna ciagu to: " + najmniejsza);
    }

    private static void najwieksza(double[] ciag) {
        double najwieksza = ciag[0];
        for (double i : ciag) {
            if (i > najwieksza) {
                najwieksza = i;
            }
        }
        System.out.println("Wartosc maxymalna ciagu to: " + najwieksza);
    }

    private static double wariancja(double[] ciag) {
        double wariancja=0.0;
        double srednia = sredniaArytmetyczna(ciag);
        for (int i=0; i<ciag.length;i++)
            wariancja+=(ciag[i]-srednia)*(ciag[i]-srednia);
        wariancja/=ciag.length;
        return wariancja;
    }

    private static double odchylenieStandardowe(double[] ciag) {
        double odchylenie=0.0;
        double srednia = sredniaArytmetyczna(ciag);
        for (int i=0; i<ciag.length;i++)
            odchylenie+=(ciag[i]-srednia)*(ciag[i]-srednia);
        odchylenie/=ciag.length;
        odchylenie=Math.sqrt(odchylenie);
        return odchylenie;
    }
   }
