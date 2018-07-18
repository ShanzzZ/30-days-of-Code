import java.util.Scanner;

public class HelloWorld {
	
/*
 * 
 Save a line of input to a variable.
 Print Hello, World. on a single line.
 Print the value of your variable on a second line.
 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);   //Create a scanner to get input
		
		String S = scan.nextLine();  //Get the input and name as S
		
		scan.close(); //Close the scanner after we finished
		
		System.out.println("Hello World."); 
		System.out.println(S); //Print the output
	}

}
