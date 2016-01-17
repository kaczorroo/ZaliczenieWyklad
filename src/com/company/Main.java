package com.company;

import java.util.Scanner;

/**
 * Temat: Wyznaczania średniej arytmetycznej, odchylenia standardowego i wariancji ciągu n liczb oraz min i max.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Start pogramu.");
        System.out.println("Wybierz jaki rodzaj ciągu chcesz uzyskać.");
        System.out.println("1)Ciąg arytmetyczny.");
        System.out.println("2)Ciąg geometryczny.");
        Scanner ciag = new Scanner(System.in);
        int wciag = ciag.nextInt();
        if(wciag==1){
            System.out.println("Wybrałeś ciąg arytmetyczny. Składa się z 10 wyrazów.");
            System.out.println("an=a1+(n-1)*r");
            System.out.println("Podaj pierwszy wyraz ciągu.");
                Scanner ajeden = new Scanner(System.in);
                int pierwszywyraz = ajeden.nextInt();
            System.out.println("Podaj r.");
                Scanner roznica = new Scanner(System.in);
                int r = roznica.nextInt();
            System.out.println(ciaga(10));
        }
        else if(wciag==2){
            System.out.println("Wybrałeś ciąg geometryczny. Składa się z 10 wyrazów.");
            System.out.println("an=a1*q^(n-1)");
            System.out.println();

        }
        else System.out.println("Wybrana pozycja nie istnieje!");
        System.out.println("Koniec programu.");
    }
    public static long ciaga(long n){
        if(n==1 || n==0){
            return n;
        }
        else
            return ciaga(n-2)+ciaga(n-1);
    }
}
