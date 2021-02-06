package _02_boolean._1_sleepy_head;	
                                      
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend=false;	// give this variable the where do i put the value of the variable??
			// you can modify line 16 to give the variable an initial value.  try it.  good!
		
		// up here, lets assume its normally a weekday. so what value
		// should isWeekend be here?
		
		
		// Write code to ask the user what day it is.
// use this as an example - change it to ask user the day
	// good!	String nickels=JOptionPane.showInputDialog("how many nickels do you have?");
        String day=JOptionPane.showInputDialog("What day is it?");
		// Set the boolean isWeekend based on the value they enter
        // now write code to see if day is Saturday or Sunday try starting code and
        // then I'll help with details...okay, does it go like this?
        // is it the if statment?? yes.  and the word if is followed by 
        // a test condition in parentheses  can you try putting that in?
        // i forgot how it goes, if it is saturday or sunday? right, i'll do one of these days
        // any question so far?nope  ok now Sunday ... I'm going to put in a symbol for the
        // word "or" ...now you add code to test for Sunday...go ahead
        // good. there are different ways to have this work.  i think i'll take out the "or"
        // for now.  I'll explain later.
        // now I want you to add code to set the boolean 'isWeekend' to true o ahead
        //wait where do i put that code???  inside the if's curly braces  fix the spelling
        // i fixed the spelling.  now give the variable the value 'true'
        // no.  isWeekend is of type boolean, meaning it can only be given the value
        // true or false, not Saturday.  good.  now where does the semicolon go? good!
        // now do the same idea for Sunday on line 42 good.  now we need to deal
        // with weekdays so ....
        
        if ( day.equalsIgnoreCase("Saturday")) {
        	isWeekend=true;
        }
		if(day.equalsIgnoreCase("Sunday")) {
			isWeekend=true;
		}
		
		// let's see so far if this works.  wait!!!
		// i'll add a line of code here
		System.out.println(isWeekend);
		
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam

		
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/
/*
		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		
*/		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		
		
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that sh
		// i fixed the
	}

	// now try a weekday!  good it works so far!  questions? nope  ok lets save work
	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
	}	
}
