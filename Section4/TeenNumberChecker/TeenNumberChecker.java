/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section4.TeenNumberChecker;

/**
 *
 * @author FRIEDRICH
 */
public class TeenNumberChecker {

    public static boolean hasTeen (int firstValue, int secondValue, int thirdValue) {
        return isTeen(firstValue) || isTeen(secondValue) || isTeen(thirdValue);
    }

    public static boolean isTeen (int value) {
        return value > 12 && value < 20;
    }
}