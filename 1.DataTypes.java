import java.util.Scanner;

public class Solution{
	public static void main (String[]args){
		int i=4;
		double d=4.0;
		String s="HackerRank "; //Don't forget the space
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		double b = scan.nextDouble();
		scan.nextLine(); 以上两行的方法会读取下一个int型/double型，但是焦点不会移动到下一行，仍然处在这一行上
		String c = scan.nextLine();
		
		scan.close();
		
		System.out.println(i+a);
		System.out.println(d+b);
		System.out.println(s+c);
	}
}