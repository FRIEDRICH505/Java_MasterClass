/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operators;

/**
 *
 * @author FRIEDRICH
 */
public class Operators {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousresult = result;
        System.out.println("previousresult = " + previousresult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        
        boolean isAlien = false;
        if (isAlien == false){
        System.out.println("It is not an alien!");
        System.out.println("And i am scared of aliens!");
    }
        int topScore = 80;
        if (topScore < 100){
        System.out.println("You got the high score!");
    }
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of conditions are true");
        }
        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }
        boolean isCar = false;
        if (isCar == true){
            System.out.println("This not suppose to happen");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }
        double Double = 20.00;
        double secondDouble = 80.00; 
        double Total = (Double + secondDouble) * 100;
        System.out.println("My values total = " + Total);
        double Remainder = Total % 40.00;
        boolean NoRemainder = (Remainder == 0) ? true : false;
        System.out.println("NoRemainder = " + NoRemainder);
        if (!NoRemainder){
            System.out.println("Got a remainder");
        }
            
        
        
        
        
        
        
        
  }
}
