package ro.fastrackit.homework7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordCheck {

    static CharacterValidator characterValidator = new CharacterValidator(12);
    static UppercaseValidator uppercaseValidator = new UppercaseValidator(1);
    static LowercaseValidator lowercaseValidator = new LowercaseValidator(1);
    static DigitsValidator digitsValidator = new DigitsValidator(3);
    static SymbolsValidator symbolsValidator = new SymbolsValidator(0);
    static List<Validator> validators = new ArrayList<>();

    //TODO - rename to uppercase + _/
    static{
        validators.add(characterValidator);
        validators.add(uppercaseValidator);
        validators.add(lowercaseValidator);
        validators.add(digitsValidator);
        validators.add(symbolsValidator);
    }


    public static void main(String[] args) {
        String password;

        Scanner input = new Scanner(System.in);

        password = input.nextLine();

        validatePassword(password);
    }

    public static void validatePassword(String thePassword) throws InvalidPasswordException {
        List<String> nonValidMessages = new ArrayList<>();
        validators.forEach(validator -> {
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
