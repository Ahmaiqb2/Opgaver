package LoopOpgaver;

import java.util.Random;
import java.util.Scanner;

public class LøkkerOpgaver_9_9_21 {
    static Random rand = new Random();

    public static void main(String[] args) {


        //randomNummer();
        //butikken();
        //bagfra();
        //ord();
        //terning();

    }

    public static void randomNummer(){
        int randomNummer = 0;
        int sum = 0;
        int count = 0;
        //System.out.println(randomNummer);

        while (randomNummer != 7){
            randomNummer = getRandomNumber();
            count++;
            sum = sum + randomNummer;
            System.out.println(randomNummer + " ");
        }
        count--;
        sum = sum -7;
        System.out.printf("\n\nDer er antal random numre: %d\n", count);
        System.out.println("Sum af dem er: " +sum);

    }
    private static int getRandomNumber() {
        return rand.nextInt(10)+1;
    }

    public static void butikken(){

        int sum = 0;
        int antalProdukter = 1;
        int pris = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til butikken");

        while(pris > 0 && antalProdukter > 0){
            System.out.print("Antal: ");
            antalProdukter = scanner.nextInt();

            System.out.print("Varepris: ");
            pris = scanner.nextInt();

            int pristotal = pris * antalProdukter;
            sum = sum + pristotal;
        }

        double tax = 1.25;
        double total = sum*tax;
        System.out.println("Pris uden moms: " + sum + "kr.");
        System.out.println("Pris med moms: " + total + "kr");

    }

    public static void bagfra(){

        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        /*while (start >= slut){
            System.out.println(start);
            start = start - 1;
        }*/


    }

    public static void ord(){

    }

    public static void terning(){

        Random random = new Random();

        for (int i = 1; i < 10; i++){
            int randomNummer = random.nextInt(6)+1;
            System.out.println(randomNummer);

        }
    }
}
