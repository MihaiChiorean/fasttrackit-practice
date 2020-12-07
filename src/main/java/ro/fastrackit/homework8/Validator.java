package ro.fastrackit.homework8;

public interface Validator {
    Boolean isValid(String password);

    String notValidMessage();
}
