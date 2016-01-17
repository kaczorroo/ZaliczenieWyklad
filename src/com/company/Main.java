package com.company;

import java.util.Scanner;

/**
 * Temat: Wyznaczania średniej arytmetycznej, odchylenia standardowego i wariancji ciągu n liczb oraz min i max.
 */

public class Main {

    public static void main(String[] args) {
        int[] ciag={1,2,3,4,5,11,12,13,14,15,21,22,23,24,25,33,44,55,66,77,88,99,100};
        int i;
        int ciagWynik=0;
        int srednia;
        for(i=0; i<ciag.length;i++){
            ciagWynik=ciagWynik+ciag[i];
        }
        srednia=ciagWynik/ciag.length;
        System.out.println("Srednia arytmetyczna ciagu wynosi: "+srednia);
    }
}

/**
 *
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
 }
 else if(wciag==2){
 System.out.println("Wybrałeś ciąg geometryczny. Składa się z 10 wyrazów.");
 System.out.println("an=a1*q^(n-1)");
 System.out.println();

 }
 else System.out.println("Wybrana pozycja nie istnieje!");
 System.out.println("Koniec programu.");
 */