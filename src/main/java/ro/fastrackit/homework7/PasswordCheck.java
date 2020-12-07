package ro.fastrackit.homework7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordCheck {

    static CHARACTER_VALIDATOR CHARACTER_VALIDATOR = new CHARACTER_VALIDATOR(12);
    static UPPERCASE_VALIDATOR UPPERCASE_VALIDATOR = new UPPERCASE_VALIDATOR(1);
    static LOWERCASE_VALIDATOR LOWERCASE_VALIDATOR = new LOWERCASE_VALIDATOR(1);
    static DIGITS_VALIDATOR DIGITS_VALIDATOR = new DIGITS_VALIDATOR(3);
    static SYMBOLS_VALIDATOR SYMBOLS_VALIDATOR = new SYMBOLS_VALIDATOR(0);
    static List<Validator> VALIDATORS = new ArrayList<>();

    static{
        VALIDATORS.add(CHARACTER_VALIDATOR);
        VALIDATORS.add(UPPERCASE_VALIDATOR);
        VALIDATORS.add(LOWERCASE_VALIDATOR);
        VALIDATORS.add(DIGITS_VALIDATOR);
        VALIDATORS.add(SYMBOLS_VALIDATOR);
    }


    public static void main(String[] args) {
        String password;

        Scanner input = new Scanner(System.in);

        password = input.nextLine();

        validatePassword(password);
    }

    public static void validatePassword(String thePassword) throws InvalidPasswordException {
        List<String> nonValidMessages = new ArrayList<>();
        VALIDATORS.forEach(validator -> {
            if (!validator.isValid(thePassword)) {
                nonValidMessages.add(validator.notValidMessage());
            }
        });

        if (!nonValidMessages.isEmpty()) {
            throw new InvalidPasswordException(String.join("", nonValidMessages));
        } else {
            System.out.println("Valid password");
            System.out.println("Password: " + thePassword);
        }
    }
}
