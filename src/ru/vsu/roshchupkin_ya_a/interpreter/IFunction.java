package ru.vsu.roshchupkin_ya_a.interpreter;

import java.util.Map;

public interface IFunction {
    double compute(Map<Character, Double> variables, Map<Character, Double> parameters) throws Exception;
}
