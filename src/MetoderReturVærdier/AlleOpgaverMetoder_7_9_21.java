package MetoderReturVærdier;

public class AlleOpgaverMetoder_7_9_21 {
    public static void main(String[] args) {

        String fullName = getFullName("Iqbal", "Ahsan", "Masood");
        fullName += ", how you doing?";
        System.out.println(fullName);

        System.out.println(getFullName("Lind", "Peter", "Heronimous"));
        System.out.println(getFullName("Potter", "Harry", "James"));
        System.out.println(getFullName("Dumbledore", "Albus", "Percival Wulfric Brian"));

        System.out.println(getFullName("Lind", "Peter"));
        System.out.println(getFullName("Potter", "Harry"));
        System.out.println(getFullName("Dumbledore", "Albus"));


        System.out.println( capitalize("pETer") );
        System.out.println( capitalize("PEter") );
        System.out.println( capitalize("peteR") );
        System.out.println( capitalize("PEtER") );

        System.out.println( getFullName("LIND", "peTRr", "hERONIMOUs") );
        System.out.println( getFullName("pOtteR", "HaRRy") );
        System.out.println( getFullName("POTTER", "haRrY", "jAMEs") );

    }


    public static String getFullName(String lastName, String firstName, String middleName) {

        String fullName;
        if (middleName != null) {
            // kode til at kombinere alle tre navne til én streng
            fullName = capitalize(firstName) + " " + capitalize(middleName) + " " + capitalize(lastName);
        } else {
            // kode til at kombinere kun fornavn og efternavn
            fullName = capitalize(firstName) + " " + capitalize(lastName);
        }

        return fullName;
    }

    public static String getFullName(String lastName, String firstName) {

        String fullName = getFullName(lastName, firstName, null);

        return fullName;
    }

    public static String capitalize( String firstName ){

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        return firstName;
    }

    public static String capitalize( String lastName, String firstName ){

        firstName = capitalize(firstName);
        lastName = capitalize(lastName);

        String fullName = firstName + " " +  lastName;
        return fullName;
    }

    public static String capitalize( String lastName, String firstName, String middleName ){

        firstName = capitalize(firstName);
        middleName = capitalize(middleName);
        lastName = capitalize(lastName);

        String fullName = firstName + " " + middleName + " " + lastName;
        return fullName;
    }
}
