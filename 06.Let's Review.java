import java.util.Scanner;

/*
 *Given a string,S, of length N that is indexed from 0 to N
 *Print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line.
 */
public class Solution{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		scan.nextLine();
		
		for(int i=0;i<T;i++){  //读取多行文字			
		String S = scan.nextLine(); 		
		char[] charArray = S.toCharArray(); //返回一个字符数组，它存放了所有字符		
		
		for(int j = 0; j<charArray.length; j++){
			if(j%2 == 0){
				System.out.print(charArray[j]); //不需要println换下一行
			}
		}
		
		System.out.print(" ");
			
		for(int j = 0; j<charArray.length; j++){ //并行的循环不需保证变量名的不同
			if(j%2 != 0){
				System.out.print(charArray[j]);
			}
		}
		
		System.out.println();
		
		}
		scan.close();   //注意括号的作用范围 
	}
}
					
			
	
