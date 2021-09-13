package MetoderReturVærdier;

public class MetodeReturOpgaveGetFullName {
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
    }

    public static String getFullName(String lastName, String firstName, String middleName) {

        String fullName;
        if (middleName != null) {
            // kode til at kombinere alle tre navne til én streng
            fullName = firstName + " " + middleName + " " + lastName;
        } else {
            // kode til at kombinere kun fornavn og efternavn
            fullName = firstName + " " + lastName;
        }
        return fullName;
    }

    public static String getFullName(String lastName, String firstName) {

        String fullName = getFullName(lastName, firstName, null);
        return fullName;
    }
}
