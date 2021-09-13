package MetodeOpgave;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MetodeOpgaver {

    public static void main(String[] args) {
        //Opgave 1
        printHelloWorld();
        //Opgave 2
        printHello("Dat21D");
        //Opgave 3
        printToday(); // Tip! Sådan får du dags dato: LocalDate today = LocalDate.now();
        //Opgave 4
        int number1 = 24;
        int number2 = 24;
        findLargestNumber(number1, number2); // prøv at udskift værdierne i number1 og number2
        //Opgave 5
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast bogstav: ");
        String input = scanner.next();
        char c = input.charAt(0);
        isVowel(c);
    }

    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static void printHello(String s) {
        System.out.println(s);
    }

    public static void printToday() {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        //DateTimeFormatter fmt = DateTimeFormatter.ofPattern("02-09-2021");
        //System.out.println(fmt);
    }

    public static void findLargestNumber(int x, int y) {
        if (x > y) {
            System.out.println(x);
        } else if (x < y) {
            System.out.println(y);
        } else if (x == y) {
            System.out.println("Begge tal er lige store");
        }
    }

    public static void isVowel(char c) {
        char[] vocal = {'a', 'e', 'i', 'o', 'u', 'y', 'æ', 'ø', 'å'};
        char[] consonant = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
                'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};

        for (int i = 0; i < vocal.length; i++) {
            if (c == vocal[i]) {
                System.out.println("Vokal: " + c);
            } else if (c == consonant[i]) {
                System.out.println("Konsonant: " + c);
            }

        }

    }
}