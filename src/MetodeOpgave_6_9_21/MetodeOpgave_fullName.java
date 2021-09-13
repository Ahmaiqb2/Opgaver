package MetodeOpgave_6_9_21;

import java.util.Scanner;

public class MetodeOpgave_fullName {

    public static void main(String[] args) {
        writeFullName("Lind", "Peter", "Heronimous" );
        writeFullName("Potter", "Harry", "James");
        writeFullName("Dumbledore", "Albus", "Percival Wulfric Brian" );
        writeFullName("Iqbal", "Ahsan",null);
        writeFullName("Halifax", "Burger");
    }

    private static void writeFullName(String efterNavn, String forNavn, String mellemNavn) {
        String fullName;
        if( mellemNavn != null ) {
            // kode til at kombinere alle tre navne til én streng
            fullName = forNavn + " " + mellemNavn + " " + efterNavn;
        } else {
            // kode til at kombinere kun fornavn og efternavn
            fullName = forNavn + " " + efterNavn;
        }
        System.out.println(fullName);
    }

    private static void writeFullName(String efterNavn, String forNavn) {

        writeFullName(efterNavn, forNavn, null);

    }
}
