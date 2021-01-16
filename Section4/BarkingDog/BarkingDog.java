/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section4.BarkingDog;

/**
 *
 * @author FRIEDRICH
 */
public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {

        if (!barking) {
            return false;
        }
        return hourOfTheDay > -1 && hourOfTheDay < 8 || hourOfTheDay == 23;
    }
}
