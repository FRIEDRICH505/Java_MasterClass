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
public class Main {

    public static void main(String[] args) {
        boolean barking = BarkingDog.shouldWakeUp(true, 7);
        System.out.println(barking);

        barking = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(barking);

        barking = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(barking);

        barking = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(barking);

        barking = BarkingDog.shouldWakeUp(true, 23);
        System.out.println(barking);
    }
}

