/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.EvenDigitSum;

/**
 *
 * @author FRIEDRICH
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of even digits in number 123456789 is " + EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println("Sum of even digits in number 252 is " + EvenDigitSum.getEvenDigitSum(252));
        System.out.println("Sum of even digits in number -22 is " + EvenDigitSum.getEvenDigitSum(-22));
        System.out.println("Sum of even digits in number 4 is " + EvenDigitSum.getEvenDigitSum(4));
        System.out.println("Sum of even digits in number 5 is " + EvenDigitSum.getEvenDigitSum(5));
    }
}