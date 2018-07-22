import java.util.Scanner;

/*
 *Given a base-10 integer,n,convert it to binary (base-2).
  Print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
 */
 
public class Solution{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		scan.close();
		
		int max=0;
		int count=0;
		
		while(n>0){
		 if(n%2!=0){
		 	 count++;
		 	 if(count>max){
		 	 	 max=count;
		 	 }
		 }else{
		 	 	 count = 0;
		 	 }
		 	 n = n/2;
		 }
		 System.out.println(max);
	}
}
		