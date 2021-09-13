package MetodeOpgave_6_9_21;

public class MetodeOpgave_NameParts {

    public static void main(String[] args) {
        writeNameParts("Peter Heronimous Lind");
        writeNameParts("Harry James Potter");
        writeNameParts("Albus Percival Wulfric Brian Dumbledore");
        writeNameParts("James Gosling"); //Melder fejl, pga mellemrum
    }

    public static void writeNameParts( String fullName){

        System.out.println(fullName.length());

        int space = fullName.indexOf(" ");
        int nextSpace = fullName.lastIndexOf(" ");

        String forNavn;
        String mellemNavn;
        String efterNavn;

        forNavn = fullName.substring(0,space);

        if (nextSpace == space){

            efterNavn = fullName.substring(space + 1);
            mellemNavn = null;

        } else {
            mellemNavn = fullName.substring(space +1, nextSpace);
            efterNavn = fullName.substring(nextSpace+1);
        }


        System.out.println("fornavn: " +forNavn);
        System.out.println("mellemnavn: " +mellemNavn);
        System.out.println("efternavn: " +efterNavn);
    }
}
