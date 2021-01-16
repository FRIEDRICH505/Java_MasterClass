/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.PerfectNumber;

/**
 *
 * @author FRIEDRICH
 */
public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0, remainder;
        for (int i=1; i<number/2+1; i++) {
            remainder = number % i;
            sum += remainder == 0? i: 0;
        }
        return number == sum;
    }
}