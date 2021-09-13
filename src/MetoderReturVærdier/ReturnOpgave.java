package MetoderReturVærdier;

public class ReturnOpgave {

    public static void main(String[] args) {
        String resultat = greeting("Ahsan");
        resultat += " Hvad sker der?";
        System.out.println(resultat);

        int ald = age(1999);
        System.out.println(ald);
    }

    public static String greeting(String firstName){
        String hilsen = "Hello " + firstName + ", How are you doing?";
        return hilsen;
    }

    public static int age(int alder){
        int gammel = 2021 - alder;
        return gammel;
    }
}
