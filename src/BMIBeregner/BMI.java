package BMIBeregner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        //Henter metode og udskriver fra parameter
        System.out.println(IntroSkrift("Velkommen til BMI-beregner"));
        Beregner();
    }

    public static String IntroSkrift(String velkomst){
        return velkomst;
    }

    public static void Beregner(){
        //Laver en scanner, så brugeren kan indtaste noget
        Scanner svarVægt = new Scanner(System.in);

        //Udskriver det første spørgsmål, hvor brugeren så skal indtaste sin vægt
        System.out.print("Indtast din vægt, i kg: ");
        double vægt = svarVægt.nextFloat();

        //Udskriver det andet spørgsmål, hvor brugeren så skal indtaste sin højde
        System.out.print("Indtast din højde, i m: ");
        double højde = svarVægt.nextFloat();

        //Hvis brugeren taster sin højde i cm, så retter den det til m
        if (højde > 100){
            højde = højde/100;
        }

        //Udregning af bmi
        double bmi = (vægt/(højde*højde));

        //For at skrive tallet ud i 1 decimal. Kan man bruge denne class, hvor # er et valgfrit tal
        //Her kan man taste om der skal 1 decimal (#.#) eller 2 decimaler (#.##)
            //DecimalFormat df2 = new DecimalFormat("#.#");
            //System.out.println("Du har en bmi på: " + df2.format(bmi));

        //Her printes teksten ud og der er ingen ln, så den næste SOUT, printes lige ved siden af
        System.out.print("Du har en bmi på: ");
        /*Her er den anden metode for at udskrive 1 eller flere decimaler. ("%.1f") står for hvor mange decimaler,
        så hvis der står 2f istedet, så printer den 2 decimaler ud. Derefter skrives den værdi (som kun kan være tal).*/
        System.out.printf("%.1f",bmi);

        String underV = "Du er undervægtig";
        String normalV = "Du er normalvægtig";
        String overV = "Du er overvægtig";
        String sværOV = "Du er sværovervægtig";

        /*If statement for at udskirve, hvilken vægt man er. ("\n") = næste linje */
        if (bmi < 18.5){
            System.out.println("\n" + underV);
        } else if (bmi < 25){
            System.out.println("\n" + normalV);
        } else if (bmi < 30){
            System.out.println("\n" + overV);
        } else if (bmi > 30){
            System.out.println("\n" + sværOV);
        }

    }
}
