package ro.fastrackit.homework7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        String password;

        Scanner input = new Scanner(System.in);

        password = input.nextLine();

        try {
            if(validatePassword(password)) {
                System.out.println("Valid password");
            };
        } catch (InvalidPasswordException e) {
            System.out.println("Password is not valid");
        }
    }

    public static boolean validatePassword(String thePassword) throws InvalidPasswordException {

        List<Validator> validators = new ArrayList<>();
        validators.add(new CharacterValidator(12));
        validators.add(new UppercaseValidator(1));
        validators.add(new LowercaseValidator(11));
        validators.add(new DigitsValidator(3));
        validators.add(new SymbolsValidator(0));

        List<String>nonValidMessages = new ArrayList<>();
        validators.forEach(validator -> {
            if (!validator.isValid(thePassword)) {
                System.out.println(validator.notValidMessage());
                nonValidMessages.add(validator.notValidMessage());
            }
        });

        return nonValidMessages.isEmpty();
    }
}
