/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.FlourPack;

/**
 *
 * @author FRIEDRICH
 */
public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (!(bigCount > -1 && smallCount > -1 && goal > -1)) {
            return false;
        }

        goal -= Math.min(goal/5, bigCount) * 5;
        return goal - smallCount < 1;
    }
}