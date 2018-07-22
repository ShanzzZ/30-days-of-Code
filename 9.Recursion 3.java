import java.util.Scanner;

/*
 *Write a factorial function that takes a positive integer, N as a parameter
 *Prints the result of N! (N factorial).
 */
 
public class Solution{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		scan.close();
		System.out.println(factorial(N)); 
	}
		
	private static int factorial(int N){
		if(N <=1) return 1;  //和system.out.print区别：方法有否返回值（void)
			
		else
			return factorial(N-1)*N;
	}
}
			
