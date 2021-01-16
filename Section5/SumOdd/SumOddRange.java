/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.SumOdd;

/**
 *
 * @author FRIEDRICH
 */
public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number < 1) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (start < 1 || end < 1 || start > end) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += isOdd(i) ? i : 0;
        }
        return sum;
    }
}
