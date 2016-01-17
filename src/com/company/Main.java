package com.company;

import java.util.Scanner;

/**
 * Temat: Wyznaczania średniej arytmetycznej, odchylenia standardowego i wariancji ciągu n liczb oraz min i max.
 */

public class Main {

    public static void main(String[] args) {
        //Tworze tablice z ciagiem.
        int[] ciag = {1, 2, 3, 4, 5, 11, 12, 13, 14, 15, 21, 22, 23, 24, 25, 33, 44, 55, 66, 77, 88, 99, 100};
        int i;
        int ciagWynik = 0;
        double srednia;
        //Tworze instrukcje obliczajaca rekurencyjnie sume ciagu.
        for (i = 0; i < ciag.length; i++) {
            ciagWynik = ciagWynik + ciag[i];
        }
        //Obliczam srednia arytmetyczna
        srednia = ciagWynik / ciag.length;
        //Szukam minimalna wartosc ciagu
        int minWynik = ciag[0];
        for (int j = 1; j < ciag.length; j++)
            if (minWynik > ciag[j]) {
                minWynik = ciag[j];
            }
        //Szukam maksymalnej wartosci ciagu
        int maxWynik = ciag[0];
        for (int n = 1; n < ciag.length; n++)
            if (maxWynik < ciag[n]) {
                maxWynik = ciag[n];
            }
        System.out.println("Suma wszystkich wyrazow ciagu wynosi: " + ciagWynik);
        System.out.println("Ilosc wyrazow w ciagu wynosi: " + ciag.length);
        System.out.println("Srednia arytmetyczna ciagu wynosi: " + srednia);
        System.out.println("Odchylenie Standardowe wynosi: ");
        System.out.println("Wariancja ciagu wynosi: ");
        System.out.println("Wartosc minimalna ciagu to: " + minWynik);
        System.out.println("Wartosc maxymalna ciagu to: " + maxWynik);
    }
}

/**
 * System.out.println("Start pogramu.");
 * System.out.println("Wybierz jaki rodzaj ciągu chcesz uzyskać.");
 * System.out.println("1)Ciąg arytmetyczny.");
 * System.out.println("2)Ciąg geometryczny.");
 * Scanner ciag = new Scanner(System.in);
 * int wciag = ciag.nextInt();
 * if(wciag==1){
 * System.out.println("Wybrałeś ciąg arytmetyczny. Składa się z 10 wyrazów.");
 * System.out.println("an=a1+(n-1)*r");
 * System.out.println("Podaj pierwszy wyraz ciągu.");
 * Scanner ajeden = new Scanner(System.in);
 * int pierwszywyraz = ajeden.nextInt();
 * System.out.println("Podaj r.");
 * Scanner roznica = new Scanner(System.in);
 * int r = roznica.nextInt();
 * }
 * else if(wciag==2){
 * System.out.println("Wybrałeś ciąg geometryczny. Składa się z 10 wyrazów.");
 * System.out.println("an=a1*q^(n-1)");
 * System.out.println();
 * <p>
 * }
 * else System.out.println("Wybrana pozycja nie istnieje!");
 * System.out.println("Koniec programu.");
 */