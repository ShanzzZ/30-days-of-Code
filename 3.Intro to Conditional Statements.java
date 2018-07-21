import java.util.Scanner;
/*
 *Given an integer, , perform the following conditional actions:
 *If  is odd, print Weird
 *If  is even and in the inclusive range of  to , print Not Weird
 *If  is even and in the inclusive range of  to , print Weird
 *If  is even and greater than , print Not Weird
 */

public class Solution{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		scan.close();
		
		if (n%2 ==0){
			if (n<6)
			System.out.println("Not Weird");
		    else if (n<21)
			System.out.println("Weird");
		    else 
		    System.out.println("Not Weired");
		}
		else
			System.out.println("Weird");
	}
}
