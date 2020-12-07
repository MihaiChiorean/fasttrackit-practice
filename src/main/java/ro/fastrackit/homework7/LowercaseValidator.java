package ro.fastrackit.homework7;

public class LowercaseValidator implements Validator {
    private int charNumber = 0;

    public LowercaseValidator(int charNumber) {
        this.charNumber = charNumber;
    }

    @Override
    public Boolean isValid(String password) {
        Integer count = 0;

        for (int i = 0; i < password.length(); i++) {
            if ((Character.isLowerCase(password.charAt(i)))) {
                count++;
            }
            if(count == charNumber) {
                return true;
            }
        }

        if(count < charNumber) {
            return false;
        }
        return true;
    }
    @Override
    public String notValidMessage() {
        return "Doesn't contain lowercase letters\n";
    }
}
