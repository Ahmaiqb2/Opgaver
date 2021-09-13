package MetodeOpgave_6_9_21;

public class MetodeOpgave_Capitalization {

    public static void main(String[] args) {
        writeCapitalized("peter");
        System.out.println();
        writeCapitalized("peter");
        System.out.println();
        writeCapitalized("peter");
        System.out.println();
        writeCapitalized("peter");
        System.out.println();
    }

    private static void writeCapitalized(String name) {

        //Printer mit navn til at være med store bogstaver
        System.out.println(name.toUpperCase());
        //Printer mit navn til at være med små bogstaver
        System.out.println(name.toLowerCase());

        //Isolere det første bogstav
        String firstLetter = name.substring(0,1);
        //Her skal det isoleret bogstav, gøres stort
        firstLetter = firstLetter.toUpperCase();

        //Samler de resterende bogstaver til en variable
        String rest = name.substring(1, name.length());

        //Samler mit navn sammen igen, under nyt variable
        String navn = firstLetter + rest;

        //Printer det ud
        System.out.println(navn);

        //Isolere det andet bogstav
        String secondLetter = name.substring(1,2);
        //Her skal det isoleret bogstav, gøres stort
        secondLetter = secondLetter.toUpperCase();

        //Samler de resterende bogstaver og gøre dem små
        String rest2 = name.substring(0,1);
        rest2 = rest2.toLowerCase();
        String rest22 = name.substring(2, name.length());

        //Samler hele navnet
        String navn2 = rest2 + secondLetter + rest22;

        //Printer det ud
        System.out.println(navn2);

        String tL = name.substring(2,3);
        tL = tL.toUpperCase();

        String rest3 = name.substring(0,2);
        rest3 = rest3.toLowerCase();
        String rest33 = name.substring(3, name.length());

        String navn3 = rest3 + tL + rest33;
        System.out.println(navn3);


        String fourthLetter = name.substring(3,4);
        fourthLetter = fourthLetter.toUpperCase();

        String rest4 = name.substring(0,3);
        rest4 = rest4.toLowerCase();
        String rest44 = name.substring(4, name.length());

        String navn4 = rest4 + fourthLetter + rest44;
        System.out.println(navn4);


        String fifthLetter = name.substring(4,5);
        fifthLetter = fifthLetter.toUpperCase();

        String rest5 = name.substring(0,4);
        rest5 = rest5.toLowerCase();

        String navn5 = rest5 + fifthLetter;
        System.out.println(navn5);

        //Her substringer man det første ord og gøre det stort. Derefter tager man de resterende ord og gøre dem små.
        String storFor = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println(storFor);

    }
}
