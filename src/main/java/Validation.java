import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {
    public static boolean get_name(String name)
    {
        return Pattern.matches("^[A-Z][a-z]{2,}",name);
    }

    public static boolean getEmail(String mail)
    {

        return Pattern.matches("(abc)(.xyz)?@(bl.co)(.in)?",mail);
    }

    public static boolean getPhoneNumber(String number) {
        return Pattern.matches("(91)\s[0-9]{10}",number);
    }

    public boolean getPassword(String password) {
        return Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[!@#$%^&*()+;:+/?]{1}.{8,}$",password);
    }
}
