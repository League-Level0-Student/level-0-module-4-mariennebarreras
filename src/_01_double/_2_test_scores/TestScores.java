package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		// ask user for test score, then give a response like maybe "you got an A" or "you got a b"
		// do i put it right here  yes.  want to look at ChangeCalculator to see
		// how to ask user for something?yes  do you hear me when I talk?no my adio dosent work
		// ooh ok.  so i suggest you copy a few lines of code from ChangeCalc and then
		// modify the code
		
		// Ask the user hfor a test score ... go ahead and modify ...
		String test=JOptionPane.showInputDialog("What is your test score?");
		
		// good.  now the instructions say save it to type 'double"
		// just to reveiw, type 'int' is a whole number whereas type 'double' has
		// decimal point.  questions so far?
		// so i am going to replace input and put double?  no.  you will
		// need to change line 24 below.  it is turning the String from line 15 into
		// an 'int' but we want to turn it into a 'double'.  

		// Convert their answer to an double.   Hint: Integer.parseInt() 
		// good start.  i'll fix a bit.  there's still a problem to fix.  any
		// idea why still a compiler error on line 27? yes, it says nickels   yes!  fix it.
		// am i suppose to put like a decimal score for the test?
		// yes, when you run the program.  but we can't run it until we fix compiler
		// errors... how to fix this one?... so do i say what the test score is
		// that's not the problem.  want a hint?yes  there is no variable in this
		// program called "nickels".  remember we copied this from another program.
		// what is the name of the String that we want to convert to double here?
		double in=Double.parseDouble(test);	// yeah!  run it  good it works so far
		System.out.println(in);		// 'in' has stored the number of nickels
		
		//then give a response like maybe "you got an A" or "you got a b"
		// let's tst if the score is >= 90
		// so do i just put 90  remember how to use an "if"?um no not really
		// if (some test condition is true) {
		//	do this code
		// }
		// look familiar?yea  try writing that code using a test condition that
		// checks if the user's score is >= 90
		// what line do i put my if statement  right below this comment...ok
		// class is almost over  can I help you and save your work?yes
		if(in >= 90) {
			// next time we can work on print statements here, ok?okayy
		}

	}

}
