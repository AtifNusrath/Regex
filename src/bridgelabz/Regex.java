package bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean isValidFirstName(String firstName) {
        String pattern = "^[A-Z][A-Za-z]{3,}";
        Pattern fnme = Pattern.compile(pattern);
        if (firstName == null) {
            return false;
        }
        Matcher matcher = fnme.matcher(firstName);
        return matcher.matches();
    }

    public static boolean isValidLastName(String lastName )
    {
        String lname = "^[A-Z][A-Za-z]{3,}";
        Pattern pattern = Pattern.compile(lname);
        if (lastName == null) {
            return false;
        }
        Matcher m2 = pattern.matcher(lastName);
        return m2.matches();
    }

    public static void main(String[] args) {

        String firstName = "Mohammed";
        System.out.println("IS the above first name valid? " + isValidFirstName(firstName));

        String lastName = "Atif";
        System.out.println("IS the above last name valid? " +isValidLastName(lastName));
    }
}
