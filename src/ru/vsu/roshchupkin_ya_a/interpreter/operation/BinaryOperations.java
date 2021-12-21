package ru.vsu.roshchupkin_ya_a.interpreter.operation;

public enum BinaryOperations implements IBinaryOperation {
    SUM {
        @Override
        public double compute(double firstOperand, double lastOperand) {
            return firstOperand + lastOperand;
        }
    },
    SUBTRACT {
        @Override
        public double compute(double firstOperand, double lastOperand) {
            return firstOperand - lastOperand;
        }
    },
    MULTIPLY {
        @Override
        public double compute(double firstOperand, double lastOperand) {
            return firstOperand * lastOperand;
        }
    },
    DIVIDE {
        @Override
        public double compute(double firstOperand, double lastOperand) {
            return firstOperand / lastOperand;
        }
    },
    POWER {
        @Override
        public double compute(double firstOperand, double lastOperand) {
            return Math.pow(firstOperand, lastOperand);
        }
    }
}
