package ro.fastrackit.homework7;

public class SymbolsValidator implements Validator {
    private int charNumber = 0;

    public SymbolsValidator(int charNumber) {
        this.charNumber = charNumber;
    }

    @Override
    public Boolean isValid(String password) {
        Integer count = 0;

        for (int i = 0; i < password.length(); i++) {
            if ((!Character.isLetterOrDigit(password.charAt(i)))) {
                count++;
            }
        }

        if(count <= charNumber) {
            return true;
        }
        return false;
    }
    @Override
    public String notValidMessage() {
        return "Password must not contains symbols\n";
    }
}
