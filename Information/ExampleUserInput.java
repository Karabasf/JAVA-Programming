import java.io.*;
import java.util.*;

//Class to illustrate some examples on how to read data input from the console.
public class ExampleUserInput {
	public static void main(String[] args) throws IOException {
		//Declare basic variable
		String userInput;			//The string userInput which is used to save the user data
		
		
		/*The first option to read user data is to use the BufferedReader class. This class can also be used will reading .txt files 
		 * (this will be presented during a later stage of the crash course). The BufferedReader class requires certain input, 
		 * this can either be an InputStreamReader object (needs to be done when one wants to read user input from the console) or a string, indicating the 
		 * location of the txt file which need to be read.
		 */
		
		//Create the BufferedReader class to Buffer which stores the user input data so that it can be assigned later on
		BufferedReader ConsoleReader= new BufferedReader(new InputStreamReader(System.in));
		
		//Display the header which prompts the user to enter something
		System.out.println("Demonstration of the BufferedReader class. Please enter something");
		
		//Read the user data by means of a method in the BufferedReader. Then assign it to a string input such that it can be displayed later on.
		userInput = ConsoleReader.readLine();
		
		//Display the user input in a certain manner
		
		System.out.println("The user input for the BufferedReader was: " + userInput);
		
		/*A newer method is by using the scanner object. This object does not require parsing (so per example, when an user inserts a number, the scanner class 
		 * can automatically parse the string into a double (or an integer)
		 * 
		 * More information about the scanner class can be found here: http://www.java-made-easy.com/java-scanner.html
		 */
		
		//Create a scanner object so that it can be used to "scan" the user input. Note that this does not save user input data like the BufferedReader does
		Scanner ConsoleScan = new Scanner(System.in);
		
		//Display header
		System.out.println("\nDemonstration of the Scanner class. Please enter something");
		
		//Scan the user input. Note that the method nextLine() returns a string, just like the method of readLine() of a Buffered Reader
		userInput = ConsoleScan.nextLine();
		
		//Display the user input
		System.out.println("The user input for the Scanner class was: " + userInput);
		
		/*Conclusion
		 * It really depends what you are favoring in using. Both methods have their pros and cons. In general the Scanner class
		 * can be used to parse primitive data types. Also, scanner scans the whole line (or character, depending on your specified
		 * options) 
		 * 
		 * On the other hand, BufferedReader reads character after character (also depending on your options) and when it encounters
		 * a line break, it returns a string of stored characters. (which is called a stream and hence the names BufferedReader and InputStreamReader) 
		 * 
		 * Note that regardless the assignments, both methods are equally valid in using them.
		 */
	}

}
