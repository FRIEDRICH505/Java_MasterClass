/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.SharedDigit;

/**
 *
 * @author FRIEDRICH
 */
public class SharedDigit {

    public static boolean hasSharedDigit(int firstValue, int secondValue) {
        if (firstValue < 10 || firstValue > 99 || secondValue < 10 || secondValue > 99) {
            return false;
        }

        int firstValueFirstDigit = firstValue % 10;
        int secondValueFirstDigit = secondValue % 10;
        firstValue /= 10;
        secondValue /= 10;
        int firstValueLastDigit = firstValue % 10;
        int secondValueLastDigit = secondValue % 10;
        return firstValueFirstDigit == secondValueLastDigit || firstValueFirstDigit == secondValueFirstDigit
                || firstValueLastDigit == secondValueFirstDigit || firstValueLastDigit == secondValueLastDigit;
    }
}
