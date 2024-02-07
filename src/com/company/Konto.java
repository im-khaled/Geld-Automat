package com.company;

public class Konto {
    private static double kontostand;


    public static double getKontostand() {

        return kontostand;

    }

    public static   void einzahlen(double betrag) {

        kontostand += betrag;
    }

    public static double abheben(double betrag) {

        kontostand -= betrag;
        return kontostand;
    }
    public static void main (String[] args){

        Konto.einzahlen(0.00);
        Konto.abheben(0.00);
        Geldautomat geld = new Geldautomat();
        geld.Manu();
    }

}




