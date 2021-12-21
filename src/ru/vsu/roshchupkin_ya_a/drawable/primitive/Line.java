package ru.vsu.roshchupkin_ya_a.drawable.primitive;

import ru.vsu.roshchupkin_ya_a.base.RealPoint;
import ru.vsu.roshchupkin_ya_a.base.ScreenConverter;
import ru.vsu.roshchupkin_ya_a.base.ScreenPoint;
import ru.vsu.roshchupkin_ya_a.drawable.Drawable;

import java.awt.*;

public class Line implements Drawable {
    private RealPoint point1;
    private RealPoint point2;

    public Line(RealPoint point1, RealPoint point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public RealPoint getPoint1() {
        return point1;
    }

    public void setPoint1(RealPoint point1) {
        this.point1 = point1;
    }

    public RealPoint getPoint2() {
        return point2;
    }

    public void setPoint2(RealPoint point2) {
        this.point2 = point2;
    }

    @Override
    public void draw(Graphics2D graphics2D, ScreenConverter screenConverter) {
        ScreenPoint point1 = screenConverter.convertRealToScreen(this.point1);
        ScreenPoint point2 = screenConverter.convertRealToScreen(this.point2);
        graphics2D.drawLine(point1.getX(), point1.getY(), point2.getX(), point2.getY());
    }
}
