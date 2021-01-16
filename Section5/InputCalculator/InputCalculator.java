/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.InputCalculator;

/**
 *
 * @author FRIEDRICH
 */
import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        double sum = 0, count = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNextLong()) {
                long number = sc.nextLong();
                sum += number;
                count++;
            } else {
                break;
            }
        }
        long average = Math.round(sum/count);
        System.out.println("SUM = " + (long) sum + " AVG = " + average);
    }
}