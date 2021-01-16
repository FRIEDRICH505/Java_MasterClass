/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.SumChallenge;

/**
 *
 * @author FRIEDRICH
 */
public class Main {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for(int i=1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }

            if(count == 5) {
                break;
            }
        }

        System.out.println("Sum = " + sum);

    }
}
