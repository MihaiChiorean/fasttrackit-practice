package ro.fastrackit.homework7;

public interface Validator {
    Boolean isValid(String password);

    String notValidMessage();
}
