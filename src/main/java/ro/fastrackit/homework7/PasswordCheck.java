package ro.fastrackit.homework7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class PasswordCheck {
    public static void main(String[] args) {
        String password;

        Scanner input = new Scanner(System.in);

        password = input.nextLine();

        if(validatePassword(password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is not valid");
        }


    }

    public static boolean validatePassword(String thePassword) {

        AtomicReference<Integer> count = new AtomicReference<>(0);
        if(thePassword == null) {
            System.out.println("Please introduce the password");
            return false;
        }

        Arrays.asList(Constraints.values())
            .forEach(enumConstraint -> {
                if(!enumConstraint.validate(thePassword)){
                    count.getAndSet(count.get() + 1);
                    System.out.println(enumConstraint.notValidMessage());
                }
            });
        if(count.get() > 0) {
            return false;
        }
        return true;
    }
}
