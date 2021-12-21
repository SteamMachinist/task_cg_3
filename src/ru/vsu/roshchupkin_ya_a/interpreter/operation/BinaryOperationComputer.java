package ru.vsu.roshchupkin_ya_a.interpreter.operation;

public class BinaryOperationComputer {
    public static double compute(String operation, double firstValue, double lastValue) throws Exception {
        switch (operation) {
            case "+" -> {
                return BinaryOperations.SUM.compute(firstValue, lastValue);
            }
            case "-" -> {
                return BinaryOperations.SUBTRACT.compute(firstValue, lastValue);
            }
            case "*" -> {
                return BinaryOperations.MULTIPLY.compute(firstValue, lastValue);
            }
            case "/" -> {
                return BinaryOperations.DIVIDE.compute(firstValue, lastValue);
            }
            case "^" -> {
                return BinaryOperations.POWER.compute(firstValue, lastValue);
            }
            default -> throw new Exception("unknown binary operation");
        }
    }
}
