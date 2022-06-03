import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {

    Validation Validation = new Validation();
    @Test
    public void givenName_whenValidated_shouldReturnTrue() {

        boolean result = Validation.get_name("Ram");
        Assert.assertEquals(true,result);

    }
    @Test
    public void givenName_whenValidated_shouldReturnFalse_forSmallFirstLetter() {

        boolean result = Validation.get_name("ram");
        Assert.assertEquals(false,result);

    }

    @Test
    public void givenName_whenValidated_shouldReturnFalse_forLessThanThreeLetters() {
        boolean result = Validation.get_name("Ra");
        Assert.assertEquals(false,result);

    }

    @Test
    public void givenEmail_whenValidated_shouldReturnTrue() {
        boolean result = Validation.getEmail("abc.xyz@bl.co.in");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenEmail_whenValidated_shouldReturnFalse_whenAtTheRateisnotgiven() {
        boolean result = Validation.getEmail("abc.xyzbl.co.in");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenEmail_whenValidated_shouldReturnFalse_whenabcIsNotGiven() {
        boolean result = Validation.getEmail("xyz@bl.co.in");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenEmail_whenValidated_shouldReturnTrue_whenInIsNotgiven() {
        boolean result = Validation.getEmail("abc.xyz@bl.co");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenEmail_whenValidated_shouldReturnTrue_whenxyzIsNotGiven() {
        boolean result = Validation.getEmail("abc@bl.co.in");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenMail_whenValidated_shouldReturnFalse_whenCoIsNotGiven() {
        boolean result = Validation.getEmail("abc.xyz@bl.in");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenPhoneNumber_whenValidated_shouldReturnTrue() {
       boolean result =  Validation.getPhoneNumber("91 9516654766");
       Assert.assertEquals(true,result);
    }

    @Test
    public void givenPhoneNumber_whenValidated_shouldReturnFalse_forNoCountryCode() {
        boolean result =  Validation.getPhoneNumber("9516654766");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenPhoneNumber_whenValidated_shouldReturnFalse_forNotExactDigits() {
        boolean result =  Validation.getPhoneNumber("91 951665476612");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenPassword_whenValidated_shouldReturnTrue() {
        boolean result = Validation.getPassword("Rohitraj123!@");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPassword_whenValidated_shouldReturnFalse_whenNoSpecialCharacterIsGiven() {
        boolean result = Validation.getPassword("Rohitraj123");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenPassword_whenValidated_shouldReturnFalse_whenMorethanOneSpecialCharacterIsGiven() {
        boolean result = Validation.getPassword("Rohitraj123!@");
        Assert.assertEquals(false,result);

    }

    @Test
    public void givenPassword_whenValidated_shouldReturnFalse_whenNoNumberIsGiven() {
        boolean result = Validation.getPassword("Rohitraj!");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenPassword_whenValidated_shouldReturnFalse_whenNoCapitalLetterIsGiven() {
        boolean result = Validation.getPassword("rohitraj123!");
        Assert.assertEquals(false,result);

    }

    @Test
    public void givenPassword_whenValidated_shouldReturnFalse_whenNoSmallLetterIsGiven() {
        boolean result = Validation.getPassword("ROHITRAJ15!");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenPassword_whenValidated_shouldReturnFalse_whenLengthIsLessThanEight() {
        boolean result = Validation.getPassword("Raj123!");
        Assert.assertEquals(false,result);
    }
}
