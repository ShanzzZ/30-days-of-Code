import java.util.Scanner;

/*
 *Given the expected and actual return dates for a library book, create a program that calculates the fine (if any).
 */
 
public class Solution {
		
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int D =scan.nextInt();
        int M =scan.nextInt();
        int Y =scan.nextInt();
        
        int D2 =scan.nextInt();
        int M2 =scan.nextInt();
        int Y2 =scan.nextInt();
        
        int fine = 0;
        
        if(Y>Y2)
        	fine = 10000;
        	else if(Y2==Y){
        		if(M>M2)
        			fine = 500 * (M-M2);
        	else if (M2==M && D>D2)
        		fine = 15 *(D-D2);
        	}
        System.out.println(fine);
    }
}