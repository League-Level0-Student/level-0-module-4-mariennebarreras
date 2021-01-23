package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

// ANY QUESTIONS?

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have 
		String nickels=JOptionPane.showInputDialog("how many nickels do you have?");

		// Convert their answer to an int.   Hint: Integer.parseInt() 
		int in=Integer.parseInt(nickels);
		System.out.println(in);		// 'in' has stored the number of nickels

		// Ask the user how many dimes they have, and convert their answer
		String dimes=JOptionPane.showInputDialog("how many dimes do you have? ");
        int D=Integer.parseInt(dimes);
        	// 'D' has stored the number of dimes
		// Ask the user how many quarters they have, and convert their answer
		String quarters=JOptionPane.showInputDialog("how many quarters do you have?");
         int Q=Integer.parseInt(quarters);
         // 'Q' has stored the number of quarters
         
		// Calculate how much money the user has.  Hint: Use a double variable 
         
        double answer = in * 0.05 + D * 0.10 + Q * 0.25;	// questions?
        System.out.println("the amount of money is " + answer);
        
        // krun the program nad test it!
        // YEAH IT WORKS!!

 //         so this is exactly hpw im suppose to do it?
        		  // yeah i think that is what it's asking for ...
        		  // how about you syso the 'answer' value and test it?
        		  
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
         
         // for example the number 6.75 has a decimal point so that is type 'double' (not type 'int')
         // so let's say you have 12 dimes.  the calculation needed here would be:
         // 12 * 0.10 (since a dime is 0.10)
         
         // does this info help you get started?
         
         // so far your code asks the user for how many nickels, dimes and quarters.
         // that stored the user's answers
           
           // still not sure what to do?
           

	}
}

