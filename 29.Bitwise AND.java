import java.util.Scanner;

/*
 *Given set S. Find two integers, A and B (where A<B), from set S 
 *The value of A&B is the maximum possible and also less than a given integer K
 */
 
class Solution{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=0; i<T; i++){
			int A = scan.nextInt();
			int K = scan.nextInt();
		
		int max = 0;
		
		for(int j=1; j<A-1; j++){
			for(int l=j+1; l<A; l++){
				int temp = j&l;
			if(temp>max && temp<K)
				max = temp;
			}
		}
		
		System.out.println(max);
		}//注意括号位置
	}
}
				
			
		
		
			
		
	