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
		
		int max=0; //最大连续个数
		int count=0; //累计专用
		
		while(n>0){
		 if(n%2!=0){
		 	 count++; //若不可被整除，累计一次
		 	 if(count>max){ 
		 	 	 max=count; //将最大连续存在max中
		 	 }
		 }else{
		 	 	 count = 0; //若可被整除，则之前累计的次数归零（最近一次累计已存储在max中，不会丢失）
		 	 }
		 	 n = n/2;
		 }
		 System.out.println(max);
	}
}
		
