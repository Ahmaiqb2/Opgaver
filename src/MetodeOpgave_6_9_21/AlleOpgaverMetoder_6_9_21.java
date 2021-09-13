package MetodeOpgave_6_9_21;

public class AlleOpgaverMetoder_6_9_21 {

    public static void main(String[] args) {
        writeCapitalized("peter");
        System.out.println();
        writeCapitalized("peter");
        System.out.println();
        writeCapitalized("peter");
        System.out.println();
        writeCapitalized("peter");
        System.out.println();

        writeNameParts("aHsAn MAsoOD IQbaL");
        writeNameParts("Peter Heronimous Lind");
        writeNameParts("Harry James Potter");
        writeNameParts("Albus Percival Wulfric Brian Dumbledore");
        writeNameParts("James Gosling"); //Melder fejl, pga mellemrum

        writeFullName("Lind", "Peter", "Heronimous" );
        writeFullName("Potter", "Harry", "James");
        writeFullName("Dumbledore", "Albus", "Percival Wulfric Brian" );
        writeFullName("Iqbal", "Ahsan",null);
        writeFullName("Halifax", "Burger");
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

        //For at gøre hele ordet småt
        System.out.println(name.toLowerCase());

        //Her substringer man det første ord og gøre det stort. Derefter tager man de resterende ord og gøre dem små.
        String storFor = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println(storFor);

    }

    public static void writeNameParts( String fullName){

        System.out.println(fullName.length());

        int space = fullName.indexOf(" ");
        int nextSpace = fullName.lastIndexOf(" ");

        String forNavn = fullName.substring(0,space);
        String mellemNavn = fullName.substring(space+1,nextSpace);
        String efterNavn = fullName.substring(nextSpace+1);

        System.out.println("fornavn: ");
        writeCapitalized(forNavn);
        System.out.println("mellemnavn: ");
        writeCapitalized(mellemNavn);
        System.out.println("efternavn: ");
        writeCapitalized(efterNavn);
    }

    private static void writeFullName(String efterNavn, String forNavn, String mellemNavn) {

        if( mellemNavn != null ) {
            // kode til at kombinere alle tre navne til én streng
            System.out.println(forNavn + " " + mellemNavn + " " + efterNavn );
        } else {
            // kode til at kombinere kun fornavn og efternavn
            System.out.println(forNavn + " " + efterNavn);
        }
    }
    private static void writeFullName(String efterNavn, String forNavn) {

        writeFullName(efterNavn, forNavn, null);

    }
}
