package ro.fastrackit.homework4;

public class MethodsHandler {
    private int theValue;
    private Methods method;

    MethodsHandler(int theValue, Methods method) {
        this.theValue = theValue;
        this.method = method;
    }

    public int calculate() {

        return method.calculate(theValue);
    }
    public boolean calculateAndReturnBoolean() {
        return method.calculateAndReturnBoolean(theValue);
    }
}
