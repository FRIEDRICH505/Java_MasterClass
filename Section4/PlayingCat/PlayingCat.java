/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section4.PlayingCat;

/**
 *
 * @author FRIEDRICH
 */
public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer? 46: 36;
        return temperature > 24 && temperature < upperLimit;
    }
}