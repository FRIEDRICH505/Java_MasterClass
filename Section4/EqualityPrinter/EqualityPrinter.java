/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section4.EqualityPrinter;

/**
 *
 * @author FRIEDRICH
 */
public class EqualityPrinter {

    public static void printEqual(int firstValue, int secondValue, int thirdValue) {
        if (firstValue < 0 || secondValue < 0 || thirdValue < 0) {
            System.out.println("Invalid Value");
            return;
        }

        String message = "Neither all are equal or different";
        if (firstValue == secondValue && secondValue == thirdValue) {
            message = "All numbers are equal";
        } else if (firstValue != secondValue && secondValue != thirdValue && firstValue != thirdValue) {
            message = "All numbers are different";
        }

        System.out.println(message);
    }
}