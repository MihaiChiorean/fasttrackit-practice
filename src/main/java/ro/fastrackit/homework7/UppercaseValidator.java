package ro.fastrackit.homework7;

public class UppercaseValidator implements Validator {
    private int charNumber = 0;

    public UppercaseValidator(int charNumber) {
        this.charNumber = charNumber;
    }

    @Override
    public Boolean isValid(String password) {
        Integer count = 0;

        for (int i = 0; i < password.length(); i++) {
            if ((Character.isUpperCase(password.charAt(i)))) {
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
        return "Doesn't contain uppercase letters\n";
    }
}
