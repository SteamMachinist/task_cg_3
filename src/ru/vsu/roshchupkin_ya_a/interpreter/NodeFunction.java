package ru.vsu.roshchupkin_ya_a.interpreter;

import ru.vsu.roshchupkin_ya_a.base.RealPoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NodeFunction implements IFunction {
    private Node root;
    private Map<Character, Double> parameters;

    public NodeFunction(Node root, Map<Character, Double> parameters) {
        this.root = root;
        this.parameters = parameters;
    }

    @Override
    public List<RealPoint> calculatePoints(double leftBorder, double rightBorder, int pointsNumber) throws Exception {
        List<RealPoint> functionPoints = new ArrayList<>();
        Map<Character, Double> variables = new HashMap<>();
        double varStep = (leftBorder - rightBorder) / pointsNumber;

        for (int n = 0; n < pointsNumber; n++) {
            double currentVarValue = leftBorder + n * varStep;
            variables.put('x', currentVarValue);
            functionPoints.add(new RealPoint(currentVarValue, root.compute(variables, parameters)));
        }
        return functionPoints;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Map<Character, Double> getParameters() {
        return parameters;
    }

    public void setParameters(Map<Character, Double> parameters) {
        this.parameters = parameters;
    }
}
