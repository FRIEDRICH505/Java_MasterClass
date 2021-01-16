/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section4.AreaCalculator;

/**
 *
 * @author FRIEDRICH
 */
public class AreaCalculator {

    public static double area(double radius) {
        if (radius < 0d) {
            return -1.0;
        }

        return Math.pow(radius, 2) * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0d || y < 0d) {
            return -1.0;
        }

        return x * y;
    }
}
