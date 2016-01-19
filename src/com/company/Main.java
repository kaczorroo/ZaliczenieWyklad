package com.company;


/**
 * Temat: Wyznaczania średniej arytmetycznej, odchylenia standardowego i wariancji ciągu n liczb oraz min i max.
 */

public class Main {

    public static void main(String[] args) {
        double[] ciag = {1, 2, 3, 4, 5, 11, 12, 13, 14, 15, 21, 22, 23, 24, 25, 33, 44, 55, 66, 77, 88, 99, 100};
        System.out.println("Suma wszystkich wyrazow ciagu wynosi: "+sumaWyrazow(ciag));
        System.out.println("Ilosc wyrazow w ciagu wynosi: " + ciag.length);
        System.out.println("Srednia arytmetyczna ciagu wynosi: "+sredniaArytmetyczna(ciag));
        najmniejsza(ciag);
        najwieksza(ciag);
        System.out.println("Odchylenie Standardowe wynosi: ");
        System.out.println("Wariancja ciagu wynosi: ");
        System.out.println("");
        System.out.println("Koniec programu.");
    }
    private static double sumaWyrazow(double[] ciag){
        double suma=0;
        for (double i : ciag){
            suma=suma+i;
        }
        return suma;
    }
    private static double sredniaArytmetyczna(double[] ciag){
        double srednia=sumaWyrazow(ciag)/ciag.length;
        return srednia;
    }
    private static void najmniejsza(double[] ciag){
        double najmniejsza=ciag[0];
        for (double i : ciag){
            if(i<najmniejsza){
                najmniejsza=i;
            }
        }
        System.out.println("Wartosc minimalna ciagu to: "+najmniejsza);
    }
    private static void najwieksza(double[] ciag){
        double najwieksza=ciag[0];
        for (double i : ciag){
            if(i>najwieksza){
                najwieksza=i;
            }
        }
        System.out.println("Wartosc maxymalna ciagu to: "+najwieksza);
    }

}



/**
 *         /**System.out.println("Start programu.");
 System.out.println("");
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
 //Wariancja ciagu
 private static double wariancjaWynik(double[] ciag) {
 double wariancja;
 double sum = 0.0;
 double srednia =;
 for (double l : ciag) {
 sum = sum + (l - srednia) * (l - srednia);
 }
 wariancja=sum/(ciag.length-1);
 return wariancja;
 }
 /**
 *
 */
//Odchylenie standardowe
/**
 * double std = 0.0;
 * double avg = mean(vals);
 *
 * for (int i=0; i< vals.length; i++)
 *     std += (vals[i]-avg)*(vals[i]-avg);
 *
 *     std/=vals.length;
 *     std=Math.sqrt(std)
 *
 *     return std;
System.out.println("Suma wszystkich wyrazow ciagu wynosi: " + ciagWynik);
        System.out.println("Ilosc wyrazow w ciagu wynosi: " + ciag.length);
        System.out.println("Srednia arytmetyczna ciagu wynosi: " + srednia);
        System.out.println("Odchylenie Standardowe wynosi: ");
        System.out.println("Wariancja ciagu wynosi: ");
        System.out.println("Wartosc minimalna ciagu to: " + minWynik);
        System.out.println("Wartosc maxymalna ciagu to: " + maxWynik);
        System.out.println("");
        System.out.println("Koniec programu.");
        }
private static double wariancja(double[] liczby){
        double wariancja;
        double srednia = ;
        }
        }
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