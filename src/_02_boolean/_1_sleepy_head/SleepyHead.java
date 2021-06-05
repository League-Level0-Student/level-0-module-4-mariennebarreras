// yay! i'm going to check in on Miranda and come back in a bit

// you started this, but need to finish.  ok.  look it over and
// let me know if you have questions okay

package _02_boolean._1_sleepy_head;	
                                      
import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

// can i help you?
		
		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend=false;	// give this variable the where do i put the value of the variable??
			// you can modify line 16 to give the variable an initial value.  try it.  good!
		
		// up here, lets assume its normally a weekday. so what value
		// should isWeekend be here?
		
/*
        String day=JOptionPane.showInputDialog("What day is it?");
		
        
        if ( day.equalsIgnoreCase("Saturday")) {
        	isWeekend=true;
        }
		if(day.equalsIgnoreCase("Sunday")) {
			isWeekend=true;
		}  
		
		// questions?
		
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
		else {
			// if we get here it means "isWeekend" is NOT true ... so it must be false
			// make sense?yess  ok next time you can work on STAR STUDENT code below.
			// lets save your work.  but first i'm checking in with miranda.  one moment okayy
			// i'm back.  i'll help you save work
			System.out.print("Its not the weekend-get out of bed!");
		}
		// good this works.  let me show you another version that works - using 'else' ...
		
		if (isWeekend ==false ) {
			System.out.print("Its not the weekend-get out of bed!");
		}
// have any questions?
//		yea, how do i tell the user to sleep in??  look at lines 48 thru 52 for an example
		
		// hi mariene.  stuck?  are you stuck?  keep going - try some code and then we'll fix if needed
		//my thing was glitching
*/
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		//what do i put for the code
		// ok, first lets review some stuff.  do you understand
		// the data type 'boolean'?no not really.  it can only
		// have the value 'true' or 'false'
		// and when you write code using 'if', it has a test condition
		// that evaluates to 'true' or 'false'.  so let's say
		// the user enters a score of 100, what value should your
		// code give to the variable 'passedExam'?a percentage
		// good guess, but no.  'passedExam' is of type 'boolean'
		// so you can't give it a percentage value.so would it be either
		//true or false yes.  so if the user got 100, what value
		// should you give 'passedExam'? yes, so true.  yep!!
		// what if the user got 65 on the exam?  no, false
		// good.  so now let's work on the code below.  here is
		// the set of steps:
		// ask the user for their test score
		// read it in
		// if the score is >= 70, set passedExam to true, else set to false
		// and system out print either congrats or better luck next time,
		// as appropriate.
		// questions so far? for the first step, do i ask the user
		//like in JOptionpane....?yes, lets review how to do that.
		// let's go back to TestScores.jave because you had to
		// read in test scores...
		
		// Write code to ask the user what percentage they scored in their last exam
		String test=JOptionPane.showInputDialog("What is your test score?");
		int in=Integer.parseInt(test);
		if (in>=70) {
			System.out.print("Congrats");
					// do a new line of code
			//like the samething i did there?? no, i'll show you
			passedExam = true;
		}
		else {	// this happens when the 'if' above it is false
			System.out.print("better luck next time");
			passedExam =false;
		}
		/*
		if (in<70) {		// did you want to include 70 here??nope fix it
			System.out.print("better luck next time");
			passedExam =false;
		}
		*/
		//so it like the same thing YES ohh okay i get it
		// great!  lets save work for today
		// it works!!  let me show you another way that works
		
		// good.  now i'm going to comment out some old code
		// above so we can test just this section
		// after we try it out, i'll help you save your work
		
		// now how do we handle things if the score is < 70?that wouldnt be true
		// how do you write the code?i guess the same way?  ok try that
		//were do i put it  where do you think?maybe line 110  ok try it
		//do i put it the same way  i want you to try it and then i'll
		// comment oh okay
		
		
		// good.  just a little review.  do you understand the
		// difference between the 2 numeric data types 'int' and 'double'?
		//no  ok.  'int' is a whole number.  'double' has a decimal point
		// example:  I can store 90 in an int, I can store 90.5 in a double
		// questions?
		//nope got t  you have a choice here.  do you want the user
		// to enter only whole numbers for test score or do you want
		// to allow numbers with decimal points?
		//um, just whole numbers.  fine so lets change line 103.  i'll 
		// show you
		// good.  now i know this is confusing, but JOptionPane
		// returns a 'String' and we have to turn that into a number
		// want to go back to TestScores.java and find code that
		// does this . then copy it?yea
		
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
// i think you didn't do this section yet.  it's a bit confusing!  First do you
		// remember Robot code?  if not i'll help you with code inside method
		// drawRedSquare below.  want help with that?yes please one moment 
		
		// ok now we will ask the user what color they want.  strangely we'll
		// only draw if they pick red!!!
		// miranda needs help saving her work okay
		
		String color = JOptionPane.showInputDialog("What color do you want?");
// LET's FINISH THIS NEXT CLASS, OK?okay, can u help me save this
		boolean isRed = true;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		
		
		boolean isSquare = true;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that sh
		// i fixed the
		
		// ok.  now we're learning here how to use boolean (true/false) variables.
		// we should only draw the square if the user wants a square shape and a
		// red color.  for now, i'l// questions?? nopel say yes to both.  meaning...ok?yes
		
		
		// now we'll test that isRed and isSquare are both true
		if (isRed == true && isSquare == true)	
			drawRedSquare();   
	}

	// now try a weekday!  good it works so far!  questions? nope  ok lets save work
	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method.  can you write code to make a square?
		
		// here is some sample code to help:
		/*
		rob.penDown();
		rob.move(100);
		rob.turn(90);
		 * 
		 */
		rob.setPenColor(Color.RED);
		rob.penDown();
		 rob.move (200);
		 rob.turn (90);
		 rob.move (200);
		 rob.turn (90);
		rob.move (200);
		 rob.turn (90);
		rob.move (200);
		
		//would that make a square?? ok!  uncomment the code and add semicolons where needed
		//like  that?  good.  let's just test this part for now by calling the
		// method.  let me show you.
	}	
}
