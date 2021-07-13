/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section11.Packages;

/**
 *
 * @author FRIEDRICH
 */
public class Main {

    public static void main(String[] args) {
	    for(int i=0; i <=10; i++) {
            System.out.println(Series.nSum(i));
        }

        System.out.println("*****************************");
        for(int i=0; i<=10; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println("*****************************");
        for(int i=0; i<=10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}
