/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section4.LeapYear;

/**
 *
 * @author FRIEDRICH
 */
public class Main {

    public static void main(String[] args) {
        boolean isLeapYear = LeapYear.isLeapYear(-1_600);
        System.out.println(isLeapYear);

        isLeapYear = LeapYear.isLeapYear(10_000);
        System.out.println(isLeapYear);

        isLeapYear = LeapYear.isLeapYear(1_600);
        System.out.println(isLeapYear);

        isLeapYear = LeapYear.isLeapYear(1_924);
        System.out.println(isLeapYear);

        isLeapYear = LeapYear.isLeapYear(2_200);
        System.out.println(isLeapYear);

        isLeapYear = LeapYear.isLeapYear(2_000);
        System.out.println(isLeapYear);

        isLeapYear = LeapYear.isLeapYear(2_400);
        System.out.println(isLeapYear);
    }
}
