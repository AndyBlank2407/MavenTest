package de.neueFische;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println(fakultät(4));
    }

    public static int add(int a, int b){
        int summe = a+b;

        return summe;
    }

    public static boolean check(int a){

        if(a > 100){
            return true;
        }
        else{
            return false;
        }
    }

    public static String checkTeilbar(int a){
       if(a % 3 == 0 && a % 5 == 0){
           return "fizzbuzz";
       }
       else if(a % 3 == 0){
           return "fizz";
       }
       else if(a % 5 == 0){
           return "buzz";
       }
       return ""+a;
    }


    public static boolean smallerThanZero(int a) {
        if(a < 1){
            return false;
        }

        else {
            return true;
        }
    }

    public static int sumSquareOrSubstract(int a, int b, boolean y) {
        if(y){
            return b - a;
        }
        else if(a > b){
            return a + b;
        }
            return a * b;
    }

    public static String ladenKapazität(int a, String farbe) {
        int maxPersonen = 0;

        switch(farbe){

            case "gelb":
                maxPersonen = 30;
                break;
            case "grün":
                maxPersonen = 60;
                break;
            default:
                maxPersonen = 0;
        }

        if(a <= maxPersonen){
            return "Maximale Personenzahl nicht überschritten";
        }
        return "Zu viele Personen";
    }

    public static int fakultät(int a){
        int fak = a;
        if(a == 0){
            fak = 1;
        }
        for(int i = a; i > 1; i--){
            fak *=(i-1);
        }
        return fak;
    }

    public static int fakultätWhile(int a) {
        int fak = a;
        if (a == 0) {
            fak = 1;
        }
        while (a > 1) {
            fak *= (a - 1);
            a--;
        }
        return fak;
    }



}