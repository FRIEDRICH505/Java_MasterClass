/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section6.PoolArea;

/**
 *
 * @author FRIEDRICH
 */
public class Rectangle {

    private double width, length;

    public Rectangle(double width, double length) {
        this.width = width < 0? 0: width;
        this.length = length < 0? 0: length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}