/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author gia.thinh
 */
public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle(String owner, String color, String borderColor, double width, double length) {
        super(owner, color, borderColor);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length; 
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2; 
    }

    @Override
    public void paint() {
        System.out.printf("|%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n", 
                            owner, color, borderColor, width, length, getArea());
    }
    
    
}   
