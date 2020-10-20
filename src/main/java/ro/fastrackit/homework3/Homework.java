package ro.fastrackit.homework3;

public class Homework {

    public static void main(String[] args) {
        OperationsHandler add = new OperationsHandler(20,2, Operations.ADD);
        OperationsHandler subtract = new OperationsHandler(20,2, Operations.SUBTRACT);
        OperationsHandler multiply = new OperationsHandler(20,2, Operations.MULTIPLY);
        OperationsHandler divide = new OperationsHandler(20,2, Operations.DEVIDE);

        System.out.println("Add: " + add.calculate());
        System.out.println("Subtract: " + subtract.calculate());
        System.out.println("Multiply: " + multiply.calculate());
        System.out.println("Divide: " + divide.calculate());
    }
}
