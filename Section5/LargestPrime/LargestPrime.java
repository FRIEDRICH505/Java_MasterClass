/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.LargestPrime;

/**
 *
 * @author FRIEDRICH
 */
public class LargestPrime {

    public static int getLargestPrime (int number) {
        if (number < 1) {
            return -1;
        }

        boolean isPrime = false;
        while (!isPrime) {
            isPrime = true;
            for (int i = 2; i < number/2 + 1; i++) {
                if (number % i != 0) {
                    continue;
                }
                number /= i;
                isPrime = false;
                break;
            }
        }

        return number;
    }
}