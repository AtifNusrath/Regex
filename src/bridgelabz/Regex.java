package bridgelabz;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean isValidFirstName(String firstName) {
        String pattern = "^[A-Z][A-Za-z]{3,}";
        Pattern fnme = Pattern.compile(pattern);
        if (firstName == null) {
            return false;
        }
        Matcher match = fnme.matcher(firstName);
        return match.matches();
    }

    public static boolean isValidLastName(String lastName) {
        String lname = "^[A-Z][A-Za-z]{3,}";
        Pattern pattern = Pattern.compile(lname);
        if (lastName == null) {
            return false;
        }
        Matcher m2 = pattern.matcher(lastName);
        return m2.matches();
    }

    public static boolean isValidEmail(ArrayList<String> emails) {

        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        if (emails == null) {
            return false;
        }

        for (String email : emails) {
            Matcher match = pattern.matcher(email);
            System.out.println(email + " : " + match.matches());
        }
        return true;
    }

    public static boolean isValidNo(String mobileNo) {
        String mobile = "^(\\d{0,9}[\\s]?)?\\d{10}$";
        Pattern mob = Pattern.compile(mobile);
        if (mobileNo == null) {
            return false;
        }

        Matcher match = mob.matcher(mobileNo);
        return match.matches();
    }

    public static boolean isValidPwd(String pwd)
    {
        String password = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*d).{8,}$";
        Pattern pattern = Pattern.compile(password);
        if (pwd ==null) {
            return false;
        }
        Matcher match = pattern.matcher(pwd);
        return match.matches();
    }

    public static void main(String[] args) {

        String firstName = "Mohammed";
        System.out.println("IS the above first name valid? " + isValidFirstName(firstName));

        String lastName = "Atif";
        System.out.println("IS the above last name valid? " + isValidLastName(lastName));

        ArrayList<String> emails = new ArrayList<>();
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user1@domain.com");
        emails.add("user.name@domain.com");
        emails.add("user#@domain.co.in");
        emails.add("user@domaincom");

        emails.add("user#domain.com");
        emails.add("@yahoo.com");

        isValidEmail(emails);

        String mobileNo = "91 9874563210";
        System.out.println("IS the above mobile number valid? " + isValidNo(mobileNo));

        String pwd = "admin07Pwd";
        System.out.println("IS the above password valid? " + isValidPwd(pwd));

    }
}