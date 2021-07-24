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

		// ok here is where you were working.  let me look at it to refresh my memory...ok
		// so lets work on step 4.  it will print each character in "have a nice day" 
		// separately.  do you remember how to write a for loop?
		//does it start with for(int i =0; i<3; i++)  yes.  almost perfect!  let me
		// explain.  i made one fix.  but lets talk about how many times this loop
		// repeats.  if i starts at 0, counts up by 1 and keeps going while it is < 3,
		// how many times will it repeat?will it repeat 3 times?  correct.
		// now in this program we want it to repeat however many times there are
		// characters in the variable 'word'.  you set the variable to "have a nice day".
		// it turns out that word.length() will tell you how many characters are in there.
		// so how could you use word.length() in the for loop? when i do this {
		// would i put it in between those?
		//}
		// no.  it involves changing something in this part of the code:
		// for(int i =0; i<word.length(); i++) woulf i put it here then  good guess but no  need help?yea
		// so let's say word = "have a nice day", then when i = 0, we'll pull out the
		// letter 'h'; when i is 1, the letter 'a'; when i is 2 ... wtter? 
		// do you know?do u mean what letter is 3?so it would be v  yes! so now lets do
		// the code for step 4 below
	
		
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
		for(int i =0;i<word.length();i++) {
			System.out.println(word.charAt(i));	// good start.  we need to fix 2 things
						// first, a typo. let the computer help
			// better.  now this will keep printing the letter at index 2..
			// in "have a nice day", what letter is at index 2?would it be v  yep.
			// try it out and see what it does!
			// so how do we fix it so it prints out: h a v e  a n i c e d a y  you can try it
			// hmm. not right.  any other ideas?um i ran out ahha  ok what about using i inside
			// the charAt()/ohhh okay ill try that  it works!! do you understand?yes
			// ok i wanat to help miranda and i want to help you save your work
			// since class is almost over.
		}

// LET'S SAVE WORK AND CONTINUE HERE NEXT TIME okay, 	
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	}
}


