package ru.vsu.roshchupkin_ya_a.interpreter;

import ru.vsu.roshchupkin_ya_a.base.RealPoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionPoints implements IFunctionPoints {
    private IFunction rootFunction;
    private Map<Character, Double> parameters;

    public FunctionPoints(IFunction rootFunction, Map<Character, Double> parameters) {
        this.rootFunction = rootFunction;
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
            functionPoints.add(new RealPoint(currentVarValue, rootFunction.compute(variables, parameters)));
        }
        return functionPoints;
    }

    public IFunction getRootFunction() {
        return rootFunction;
    }

    public void setRootFunction(IFunction rootFunction) {
        this.rootFunction = rootFunction;
    }

    public Map<Character, Double> getParameters() {
        return parameters;
    }

    public void setParameters(Map<Character, Double> parameters) {
        this.parameters = parameters;
    }
}
