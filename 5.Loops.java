import java.util.Scanner;

/*
 *Given an integer,n,print its first 10 multiples. 
 *Each multiple n*i (where 1<=i<=10) should be printed on a new line as: n x i = result.
 */
 
public class Solution {
        public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        scan.close();
        
        for(int i=1;i<11;i++){
            
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
		