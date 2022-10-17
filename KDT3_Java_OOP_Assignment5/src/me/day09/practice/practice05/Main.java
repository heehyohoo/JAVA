package me.day09.practice.practice05;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(3), new Rectangle(3, 5), new Triangle(5, 3),
                new Trapezoid(new Line[]{new Line(new Point(3,5),new Point(7,5)),new Line(new Point(2,0),new Point(10,0))}) };

        for (int i = 0; i < shapes.length; i++) {
            Point point = new Point((int)(Math.random()*10) + 1, (int)(Math.random()*10) + 1);
            shapes[i].setCenterPoint(point);
        }


        for (int i = 0; i < shapes.length; i++) { //실습 5번 출력
            shapes[i].calculateArea();
        }
        System.out.println();

        Circle circle = new Circle(new Point(3, 5), 2);
        System.out.println("기준 : " + circle);

        circle.translate(3,5);
        System.out.println("중점이동 : " + circle);

        circle.scale(2);
        System.out.println("스케일링 : " + circle);

    }

    // 객체지향적이지 않은 코드 🤔
//    public static double calculateArea(Shape shape) {
//        //final double PI = 3.14;
//        if (shape instanceof Circle) {
//            return ((Circle) shape).getRadius() * ((Circle) shape).getRadius() * PI;
//        } else if (shape instanceof Rectangle) {
//            return ((Rectangle) shape).getWidth() * ((Rectangle) shape).getHeight();
//        } else if (shape instanceof Triangle) {
//            return ((Triangle) shape).getBase() * ((Triangle) shape).getHeight() * 0.5;
//        } else {
//            return 0.0;
//        }
//    }
}
