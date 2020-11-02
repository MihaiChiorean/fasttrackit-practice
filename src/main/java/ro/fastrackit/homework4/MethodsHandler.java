package ro.fastrackit.homework4;

public class MethodsHandler {
    private int theValue;
    private int theValue2;
    private Methods method;

    MethodsHandler(int theValue, int theValue2, Methods method) {
        this.theValue = theValue;
        this.theValue2 = theValue2;
        this.method = method;
    }

    public int calculate() {

        return method.calculate(theValue, theValue2);
    }
    public String calculateDaysOfAMont() {

        return method.calculateDaysOfAMont(theValue, theValue2);
    }
    public boolean calculateAndReturnBoolean() {
        return method.calculateAndReturnBoolean(theValue, theValue2);
    }

    public String calculateAndReturnString() {
        return method.calculateAndReturnString(theValue, theValue2);
    }
}
