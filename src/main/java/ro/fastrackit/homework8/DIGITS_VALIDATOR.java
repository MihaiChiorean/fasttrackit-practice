package ro.fastrackit.homework8;

public class DIGITS_VALIDATOR implements Validator {
    private int charNumber = 0;

    public DIGITS_VALIDATOR(int charNumber) {
        this.charNumber = charNumber;
    }

    @Override
    public Boolean isValid(String password) {
        Integer count = 0;

        for (int i = 0; i < password.length(); i++) {
            if ((Character.isDigit(password.charAt(i)) == true)) {
                count++;
            }
            if(count == charNumber) {
                return true;
            }
        }

        if(count <= charNumber) {
            return false;
        }
        return true;
    }
    @Override
    public String notValidMessage() {
        return "Doesn't have enough digits\n";
    }
}
