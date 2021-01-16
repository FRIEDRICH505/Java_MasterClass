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
public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int firstValue, int secondValue) {
        if (firstValue < 10 || secondValue < 10) {
            return -1;
        }

        int divisor = Math.min(firstValue, secondValue);
        while (firstValue % divisor != 0 || secondValue % divisor != 0) {
            divisor--;
        }
        return divisor;
    }
}