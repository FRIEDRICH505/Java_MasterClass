/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section6.Cylinder;

/**
 *
 * @author FRIEDRICH
 */
public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = 0;
        if (radius >= 0) {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}
