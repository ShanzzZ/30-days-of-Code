import java.util.Scanner;

public class HelloWorld {
	
/*
 * save a line of input from stdin to a variable, print Hello, World. on a single line, and finally print the value of your variable on a second line.
 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);   //Create a scanner to get input
		
		String S = scan.nextLine();  //Get the input and name as S
		
		scan.close(); //Close the scanner after we finished
		
		System.out.println("Hello World."); 
		System.out.println(S); //Print the output
	}

}
