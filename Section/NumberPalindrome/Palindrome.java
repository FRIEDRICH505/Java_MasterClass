/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section.NumberPalindrome;

/**
 *
 * @author FRIEDRICH
 */
public class Palindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int copyNumber = number;
        int digit = 0;
        while (number != 0) {
            digit = number % 10;
            reverse = (reverse * 10) + digit;
            number /= 10;
        }
        return reverse == copyNumber;
    }
}