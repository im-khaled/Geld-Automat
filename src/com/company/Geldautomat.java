package com.company;

import java.util.Scanner;

public class Geldautomat {

    public  void Manu() {
        
        Scanner in = new Scanner(System.in);

        System.out.println("1 - Kontostand");
        System.out.println("2 - Einzahlungen");
        System.out.println("3 - Abheben");
        System.out.println("4 - Verlassen");
        System.out.printf("Möchten Sie ihres Konto verwalten? (j/n): ");
        char wahl = in.next().charAt(0);

        while (wahl == 'j') {
            System.out.printf("%nBitte wählen Sie aus der Liste ein:");
            int auswahl = in.nextInt();
            switch (auswahl) {
                case 1:
                    System.out.println(Konto.getKontostand());
                    break;
                case 2:
                    System.out.printf("%nBitte Wert Eingeben: ");
                    double e = in.nextDouble();
                    Konto.einzahlen(e);
                    break;
                case 3:
                    System.out.printf("%nBitte Wert Eingeben: ");
                    double a = in.nextDouble();
                    Konto.abheben(a);
                    break;

                case 4:
                    System.out.printf("%nAuf Wiedersehen!");
                    return;
            }
        }


    }

}
