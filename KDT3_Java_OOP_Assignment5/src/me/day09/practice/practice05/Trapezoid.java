package me.day09.practice.practice05;

import java.util.Arrays;

public class Trapezoid extends Shape {
    private Line[] lines; // 윗변, 아랫변, 왼쪽변, 오른쪽변 들어온다고 가정

    public Trapezoid() {
    }

    public Trapezoid(Point centerPoint) {
        super(centerPoint);
    }

    public Trapezoid(Line[] lines) {
        this.lines = lines;
    }

    public Trapezoid(Point centerPoint, Line[] lines) {
        super(centerPoint);
        this.lines = lines;
    }

    public Line[] getLines() {
        return lines;
    }

    public void setLines(Line[] lines) {
        this.lines = lines;
    }

    // draw() 함수 무조건 재정의!
    @Override
    public void draw() {
        System.out.println(Trapezoid.class.getName() + " draw()");
    }

    @Override
    public void calculateArea() {
        double upperSide = Math.sqrt(Math.pow((lines[0].getEnd().getX()-lines[0].getStart().getX()),2)
                +Math.pow((lines[0].getEnd().getY()-lines[0].getStart().getY()),2));

        double lowerSide = Math.sqrt(Math.pow((lines[1].getEnd().getX()-lines[1].getStart().getX()),2)
                +Math.pow((lines[1].getEnd().getY()-lines[1].getStart().getY()),2));

        double trapezoidArea = 0.5*(upperSide+lowerSide)*getHeight(lines[0],lines[1]);
        System.out.println("사다리꼴의 넓이 : " + trapezoidArea);

    }
    public int getHeight(Line x,Line y){
        return (x.getStart().getY() - y.getStart().getY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Trapezoid trapezoid = (Trapezoid) o;
        return Arrays.equals(lines, trapezoid.lines);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(lines);
        return result;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "lines=" + Arrays.toString(lines) +
                ", centerPoint=" + centerPoint +
                '}';
    }
}
