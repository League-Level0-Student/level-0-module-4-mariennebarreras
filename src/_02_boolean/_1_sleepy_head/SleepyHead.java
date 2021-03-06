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
		

        String day=JOptionPane.showInputDialog("What day is it?");
		
        
        if ( day.equalsIgnoreCase("Saturday")) {
        	isWeekend=true;
        }
		if(day.equalsIgnoreCase("Sunday")) {
			isWeekend=true;
		}
		
		// do you understand the code above?yes
		
		// let's see so far if this works.  wait!!!
		// i'll add a line of code here
		System.out.println(isWeekend);
		
		// If it is the weekend, tell the user they get to sleep in.
		// use an 'if' here and test the boolean variable 'isWeekend'
		// in the code above, you set 'isWeekend' to 'true' or 'false'
		// depending on the day that was entered...
		// so it woud be true  ... it depends on the day
		// the code start off assuming that you'll enter a weekday, so
		// then isWeekday = false
		// but then if you enter Saturday or Sunday, it changes to
		// isWeekend = true
		
		if (isWeekend == true) {
			// tell the user they get to sleep in.  using a print statement
			// need help?  you there Mariene?
			System.out.println("It is the weekend - yay! - you can sleep in");
		}
		
		// does this make sense?
		// wait o do inhave to put the weekdays and say its false??
		
		// you already have that code here
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
// have any questions?
//		yea, how do i tell the user to sleep in??
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
