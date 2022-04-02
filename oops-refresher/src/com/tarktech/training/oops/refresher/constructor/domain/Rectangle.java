package com.tarktech.training.oops.refresher.constructor.domain;

public class Rectangle extends Polygon{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}
