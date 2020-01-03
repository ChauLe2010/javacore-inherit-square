package com.codegym;

public class Shape {
   private String color;
   private Boolean filled;

    public Shape() {
        color="green";
        filled=true;
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape with color of "+this.color+" and "+(isFilled()?"filled":"not filled");
    }

    public static void main(String[] args) {
        Shape shapeTest = new Shape();
        System.out.println(shapeTest.toString());
    }
}
