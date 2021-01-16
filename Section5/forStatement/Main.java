/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.forStatement;

/**
 *
 * @author FRIEDRICH
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("10.000 at 2% interest = " + calculateInterest(10_000.0, 2.0));

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        for (int i = 2; i < 9; i++) {
            System.out.println("10.000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10_000.0, i)));
        }

        System.out.println("******************************");

        for (int i = 8; i > 1; i--) {
            System.out.println("10.000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10_000.0, i)));
        }

        System.out.println("******************************");

        int count = 0;
        for (int i = 2; i < 10_000; i++) {
            if (isPrime(i)) {
                System.out.println("Prime number found: " + i);
                count++;
                if (count == 3) {
                    System.out.println("Exiting the for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
