package ArrayOpgaver;

import java.util.Scanner;

public class ArrayOpgave {

    public static void main(String[] args) {

        //arrayString();
        //arrayString1();
        //arrayIndtaste();

    }

    private static void arrayString() {
        String[] names = {"Bo", "Jens", "Lars", "Jakob", "Jacob", "Peter", "Adam", "Mikkel", "Simon", "Oliver"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    private static void arrayString1() {
        String[] ord = new String[8];

    }

    private static void arrayIndtaste() {
        Scanner indtast = new Scanner(System.in);
        String[] ord = new String[5];

        for (int i = 0; i < ord.length; i++){
            ord[i] = indtast.nextLine();

        }
        System.out.println("1: " + ord[0]);
        System.out.println("2: " + ord[1]);
        System.out.println("3: " + ord[2]);
        System.out.println("4: " + ord[3]);
        System.out.println("5: " + ord[4]);


    }


}



