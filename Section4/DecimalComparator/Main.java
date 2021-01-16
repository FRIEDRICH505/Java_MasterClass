/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section4.DecimalComparator;

/**
 *
 * @author FRIEDRICH
 */
public class Main {

    public static void main(String[] args) {
        boolean areEqualByThreeDecimalPlaces = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(areEqualByThreeDecimalPlaces);

        areEqualByThreeDecimalPlaces = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(areEqualByThreeDecimalPlaces);

        areEqualByThreeDecimalPlaces = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(areEqualByThreeDecimalPlaces);

        areEqualByThreeDecimalPlaces = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(areEqualByThreeDecimalPlaces);
    }
}
