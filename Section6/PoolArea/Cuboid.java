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

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid (double width, double length, double heigth) {
        super(width, length);
        this.height = heigth < 0? 0: heigth;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.getArea() * this.height;
    }
}
