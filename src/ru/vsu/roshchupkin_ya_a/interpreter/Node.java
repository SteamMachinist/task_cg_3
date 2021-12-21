package ru.vsu.roshchupkin_ya_a.interpreter;

import ru.vsu.roshchupkin_ya_a.interpreter.operation.BinaryOperationComputer;

import java.util.Map;

public class Node implements IFunction{
    private NodeType type;
    private Node left;
    private Node right;
    private String value;

    public Node(NodeType type, Node left, Node right, String value) {
        this.type = type;
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public double compute(Map<Character, Double> variables, Map<Character, Double> parameters) throws Exception {
        switch (this.type) {
            case NUMBER -> {
                return Double.parseDouble(value);
            }
            case OPERATION -> {
                return BinaryOperationComputer.compute(value, left.compute(variables, parameters),
                        right.compute(variables, parameters));
            }
            case VARIABLE -> {
                return variables.get(this.value.charAt(0));
            }
            case PARAMETER -> {
                return parameters.get(this.value.charAt(0));
            }
            case FUNCTION -> {
                return 0;
            }
            case CONSTANT -> {
                switch (this.value) {
                    case "Pi" -> {
                        return Math.PI;
                    }
                    case "E" -> {
                        return Math.E;
                    }
                    default -> throw new Exception("Unknown constant");
                }
            }
            default -> throw new Exception("unknown node type");
        }
    }
}
