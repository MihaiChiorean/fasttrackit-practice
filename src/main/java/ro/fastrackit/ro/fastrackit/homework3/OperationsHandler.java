package ro.fastrackit.ro.fastrackit.homework3;

public class OperationsHandler {
    private int one;
    private int second;
    private Operations method;

    OperationsHandler(int one, int second, Operations method) {
        this.one = one;
        this.second = second;
        this.method = method;
    }

    public int calculate() {
        return method.calculate(one, second);
    }
}
