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
public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        if (height < 0) {
            this.height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.getArea() * this.height;
    }
}