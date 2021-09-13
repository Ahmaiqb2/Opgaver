package MetoderReturVærdier;

public class MetodeReturCapitalize {
    public static void main(String[] args) {

        System.out.println( capitalize("pETer") );
        System.out.println( capitalize("PEter") );
        System.out.println( capitalize("peteR") );
        System.out.println( capitalize("PEtER") );

    }

    public static String capitalize( String name ){

        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        return name;
    }

    public static String capitalize( String lastName, String firstName ){

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName + " " +  lastName;
        return fullName;
    }

    public static String capitalize( String lastName, String firstName, String middleName ){

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        middleName = middleName.substring(0,1).toUpperCase() + middleName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName + " " + middleName + " " + lastName;
        return fullName;
    }
}
