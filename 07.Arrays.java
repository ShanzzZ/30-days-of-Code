import java.util.Scanner;

/*
 *Given an array,A, of N integers
 *Print A's elements in reverse order as a single line of space-separated numbers.
 */
 
 public class Solution{
 	 public static void main(String[] args){
 	 	 Scanner scan = new Scanner(System.in);
 	 	 int N = scan.nextInt();

 	 	 int[]A = new int[N];
 	 	 
 	 	 for(int i=0; i<N; i++){
 	 	 	 A[i]=scan.nextInt();
 	 	 }
 	 	 
 	 	 for(int j = N-1; j>=0;j--){
 	 	 	 System.out.print(A[j]);
 	 	 	 System.out.print(" ");
 	 	 }
 	 	 scan.close();
 	 }
 }
 	 	 	 
 	 	 
 	 	 
