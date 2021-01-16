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
public class Carpet {

    private double cost;

    public Carpet(double cost) {
        this.cost = cost < 0? 0: cost;
    }

    public double getCost() {
        return cost;
    }
}