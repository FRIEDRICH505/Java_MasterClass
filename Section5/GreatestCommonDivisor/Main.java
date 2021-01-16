/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.GreatestCommonDivisor;

/**
 *
 * @author FRIEDRICH
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("G.C.D (12, 30) = " + GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
        System.out.println("G.C.D (12, 12) = " + GreatestCommonDivisor.getGreatestCommonDivisor(12, 12));
        System.out.println("G.C.D (25, 15) = " + GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
        System.out.println("G.C.D (9, 18) = " + GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
        System.out.println("G.C.D (25, 15) = " + GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
    }
}