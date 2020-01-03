package com.codegym;

public class Square extends Rectangle{
    public Square() {
        super(1.0,1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, Boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        this.setWidth(side);
        this.setHeight(side);
    }

    @Override
    public double getWidth() {
        return this.getSide();
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public String toString() {
        return "A square with side = "+this.getSide()+", which is a subclass of "+super.toString();
    }

    public static void main(String[] args) {
        Square squareTest = new Square("red",false,10.3);
        System.out.println(squareTest.toString());
    }
}
