package com.codegym;

public class Circle extends Shape {
    private double radius;
    //public static final double PI=3.14159;

    public Circle() {
        this.radius=1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "A circle with radius = "+this.radius
                +", which is a subclass of "+super.toString();
    }

    public static void main(String[] args) {
        Shape circleTest = new Circle();
        System.out.println(circleTest.toString());
    }
}
