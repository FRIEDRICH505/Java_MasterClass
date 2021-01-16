/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section6.CarpetCostCalculator;

/**
 *
 * @author FRIEDRICH
 */
public class Floor {

    private double width, length;

    public Floor(double width, double length) {
        this.width = width < 0? 0: width;
        this.length = length < 0? 0: length;
    }

    public double getArea() {
        return this.length * this.width;
    }
}