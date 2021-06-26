package _03_char._2_string_methods;


public class StringMethods {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to contain a minimum of 3 characters
		String word = "have a nice day";  // I created a String variable named 'word'.  you give it
		// a value of your choice.  strings need to be inside double quotes.
		// so it can be like a message yes okay nice message :0
		
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt  any idea what code this is suggesting you do?
		// it should print out the 3rd character which is what  in "have a nice day"?
		// if i were to print it out would it be JOptionPane??  you could But it
		// says print to the console which means use System.out.println()
		// ohhh okayy got it  let's first try printing out the whole string...
		// so in the parenthesis i put my message?  put the name of the string
		// that contains the message  good.  now let's try doing step 2
		// let me explain the HINT.  strings have lots of methods that can be applied
		// to them.  to use one of the string methods, you say the name of the
		// string variable followed by a dot . and then the method name.  let me show you
		// word.charAt()  like that ... try it in line 24
		// so i put word.charAt() inside the parenthesis? yes
		// i put in my message there??  no.  let me see if i can bring up some instructions
		System.out.println(word.charAt(2));	// it needs an 'index' which is
					// some number between 0 and 1 less than the length of the string.
			// let's experiment.  change the word index to the value 0 and run the program
		// see how that is the first letter in your message?  try a different value now
		// good.  what do you think will get printed if you change the value to 2? it
		//would change to v try it!
		// good.  now a challenge question: what will happen if you change the value
		// to 100?
		// im assuming there will be no letter  let's try it!  yikes!
		// it's called a StringIndexOutOfBoundsException.  a mouthful.  basically
		// an error that causes the program to crash.  let's put the index back
		// to a valid value and move on to step 3
		
		
		// 3. Print the length of your String to the console.
		//    HINT: .length()
		// is it System,out.println yeah  you need to apply that method to the string
		// take a look at how you did that in line 26 as an example
		// so do i put it like word.lenghth()  yes
		
		System.out.println(word.length());		// are there 15 letters in your message?
		                                          // no theres 12 there's a reason it
		// printed 15 instead.  any thoughts why?  look at the message
		// would it be because of "" these?  good guess but no.  another idea?
		// another guess would be because of the word, word?  sorry i don't understand.
		// but that's not it.  want me to explain?yes please spaces are included.
		// how many spaces are there? 3 so 3+12 = 15 oh okay i understand now
// LET'S SAVE WORK AND CONTINUE HERE NEXT TIME okay, 
		
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops

		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	}
}


