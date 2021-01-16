/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.AllFactors;

/**
 *
 * @author FRIEDRICH
 */
public class FactorPrinter {

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        StringBuilder factors = new StringBuilder();
        for (int i=1; i<number/2 + 1; i++) {
            int remainder = number % i;
            factors.append(remainder == 0 ? i + "\n": "");
        }
        factors.append(number);
        System.out.println(factors);
    }
}
