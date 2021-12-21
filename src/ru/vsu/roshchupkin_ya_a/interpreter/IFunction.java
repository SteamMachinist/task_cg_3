package ru.vsu.roshchupkin_ya_a.interpreter;

import ru.vsu.roshchupkin_ya_a.base.RealPoint;

import java.util.List;

public interface IFunction {
    List<RealPoint> calculatePoints(double leftBorder, double rightBorder, int pointsNumber) throws Exception;
}
