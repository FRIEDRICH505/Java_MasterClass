/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.DiagonalStar;

/**
 *
 * @author FRIEDRICH
 */
public class DiagonalStar {

    public static void printSquareStar(int number) {
        long start = System.currentTimeMillis();
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        StringBuilder halfStar = new StringBuilder(new String(new char[number]).replace("\0", "*"));
        StringBuilder starRow = new StringBuilder("*"
                + new String(new char[number-2]).replace("\0", " ")
                + "*");
        for (int i=1; i<number/2; i++) {
            starRow.setCharAt(i, '*');
            starRow.setCharAt(number-i-1, '*');
            halfStar.append("\n").append(starRow);
            starRow.setCharAt(i, ' ');
            starRow.setCharAt(number-i-1, ' ');
        }

        // Prints both star halves and the center in case the number of rows is odd
        System.out.println(halfStar);
        if (number % 2 == 1) {
            starRow.setCharAt(number/2, '*');
            System.out.println(starRow);
        }
        System.out.println(halfStar.reverse());
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Time elapsed: " + timeElapsed + " ms.");
    }
}
