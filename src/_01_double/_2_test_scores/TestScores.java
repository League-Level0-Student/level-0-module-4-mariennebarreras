package _01_double._2_test_scores;

import javax.swing.JOptionPane;
// was this finished?yea  do you want us to review it?  or go on to next program?just go on
public class TestScores {

	public static void main(String[] args) {
		// ask user for test score, then give a response like maybe "you got an A" or "you got a b"
		// do i put it right here  yes.  want to look at ChangeCalculator to see
		// how to ask user for something?yes  do you hear me when I talk?no my adio dosent work
		// ooh ok.  so i suggest you copy a few lines of code from ChangeCalc and then
		// modify the code
	// want to copy some code?yes go ahead	
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
		// questions? what am i supposw to do next??  you could have it print
		// out whether you got an 'A', 'B' or 'C', for example.  does that make sense?yes
		// so am i suppose to print it put right below the if statement?  yes
		//like on line 52?yes try that and run it like put in an 95 and see that
		// it prints 'A' and run again with an 85 to see it doesn't print anything...
		// what do i put for the print?  it's up to you.  you could congratulate
		// someone for getting a good grade, for example!
		//like that?  yes.  maybe add "you got an A" okay  try running it
		// try again with a number in the 80s
		// do i start me next if statement on line 61? no line 60, but first lets
		// run this and see that it does NOT print congrats when the number is < 90
		// make sense?yes
		// ok now we'll work on 'B' test grades which are in range 80 to 89, i'll
		// show you some code...

		// lets say in is 85, then line 62, in >= 90 is false, right?yes
		// so it goes to the else on line 66, ok.  now it does line 70 ...
		// is in >= 70, in other words is 85 >= 70?no  are you sure?umm i dont know
		// the number 85 is bigger than the number 70  so it printed "You tried your best"
		
		// i will fix the code for you and then save your work
		if(in >= 90) {
			System.out.print("You got and A,congrats!!");
		}
		else {	// the code ONLY comes here if "in >= 90" is FALSE, meaning in is less than 90
			// so down here we just need to check in >= 80 ... does that make sense?yes
			// okay, try righting code here so am just suppose to put if 80 false??
			// no let me show you
	
			if (in >= 80) {
				System.out.print("You got a B.Good Job!");
			}
			else {	// if get here that means in is NOT >= 80. 
		         if (in >=70 ) {
		        	  System.out.print("You got a C.You tried your best");
		          }		
			}
		}
			// run it and test it out.  then try to use my code example to
			// test in >= 70, a 'C'
			// while you're doing that i'm going to help miranda a bit okay

	}
	// do you remember what you were working on?i think i finished this on right??
	// ok lets see sleepyhead.  did you start or finish that/
 
          // hi marienne i'm back hey i just finshed the 70 score one  good
          // i see you tested it with the test score 70... lets see
          // if a test in the 90's still works properly.  run the program with
          // 95 for example ...  do you see that it printed the stuff about an A
          // BUT also stuff about a C.  we need to fix that, right?yes
          // ok.  i will move the code to a place that only happens if the test
          // is < 90 and the test is < 80.  where do you think that might be?  any thoughts? 
          // are u asking me like what line were you pu that info?  yes i will be
          // moving the code that is currently at lines 76-78.  what line do you think
          // i should move it to? 78  no.  another guess? 77  it has to do with "else"
          // so let me review a bit:
 /*         
          if (something here is true) {
        	  do the code inside here
          }
          else {
        	  do the code inside here ..this happens only when the 'if' above it is false
          }
   */  
          // so line 64?  yes that's better  lets try it i'll move the code and
          // then you run it
	}    // so do i run it now?  yeah, run it a few times, try 95, 85, 75 okay
// we'll need to fix that.  now try 75  good.  so just one problem.  when you
// put in a B score, it also thought it was a C score.  i'll show you the problem.
          
