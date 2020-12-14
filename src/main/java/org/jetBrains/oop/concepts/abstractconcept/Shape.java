package org.jetBrains.oop.concepts.abstractconcept;

public class Shape {

    public static void main(String[] args) {
        Triangle shape = new Triangle(3, 4, 5);
        System.out.println(shape.getArea() + " - " + shape.getPerimeter());

        Circle circle = new Circle(10);
        System.out.println(circle.getArea() + " - " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(5,10);
        System.out.println(rectangle.getArea() + " - " + rectangle.getPerimeter());

    }
}

    class Triangle extends Shape {
        double side1;
        double side2;
        double side3;

        protected Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        public double getPerimeter() {
            return side1 + side2 + side3;
        }

        public double getArea() {
            double p = (side1 + side2 + side3) / 2;
            return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        }

    }

    class Rectangle extends Shape {
        double side1;
        double side2;

        protected Rectangle(double side1, double side2) {
            this.side1 = side1;
            this.side2 = side2;
        }

        public double getPerimeter() {
            return 2 * (side1 + side2);
        }

        public double getArea() {
            return side1 * side2;
        }
    }

    class Circle extends Shape {
        double radius;

        protected Circle(double radius) {
            this.radius = radius;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }
