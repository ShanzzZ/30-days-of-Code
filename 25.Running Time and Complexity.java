import java.util.Scanner;

/*A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. 
 *Given a number,n, determine and print whether it's Prime or Not prime.
 */
 
public class Solution {
	public static boolean isPrime(int a){
	for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) { 
                return false;
            }
    }
    return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
        for(int i=0;i<T;i++){
        	int n = scan.nextInt();       	
        	
        	if (n >= 2 && isPrime(n))
                System.out.println("Prime");
            else System.out.println("Not prime");
        }
        scan.close();
    }
}