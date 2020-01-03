package com.codegym;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
        this.width=1.0;
        this.height=1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, Boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public  double getPerimeter(){
        return (this.width+this.height)*2;
    }

    @Override
    public String toString() {
        return "A rectangle with width = "+this.width
                +" and length = "+this.height
                +", which is a subclass of "+super.toString();
    }

    public static void main(String[] args) {
        Shape rectangleTest = new Rectangle();
        System.out.println(rectangleTest.toString());
    }
}
