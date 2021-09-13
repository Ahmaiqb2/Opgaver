package MetodeOpgave;

import java.util.Random;
import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

            System.out.println("Lad os spille Gæt et tal");
            System.out.print("Du skal gætte på et tal ml. 1-10 ");
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();
            checkGuess(guess);

    }

    private static void checkGuess(int guess) {

        //Random er en klasse, som vi initialiserer vha. 'new'
        Random randomGenerator = new Random();
        //vi bruger metoden nextInt til at generere tilfældigt tal
        int randomNumber = randomGenerator.nextInt(10) + 1;
        System.out.println(randomNumber);
        while (guess == randomNumber){
            System.out.println("Korrekt");
        }
        System.out.println("Forkert");

        /*if (guess == randomNumber) {
            System.out.println("Wauw - du gættede rigtigt.");
        }
        else
            System.out.println("Øv, du gættede ikke rigtigt.");*/

    }
}
