/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimitiveTypesChallenge;

/**
 *
 * @author FRIEDRICH
 */
public class Main {
    public static void main(String[] args) {
        
         byte myByte = 5;
        short myShort = 1;
        int myInteger = 55;
        long myLong = 50000L;
        
        long longTotal = 50000L + 10L * (myByte + myShort + myInteger);
        System.out.println(longTotal);
    }
}
