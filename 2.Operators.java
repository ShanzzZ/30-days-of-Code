import java.util.Scanner;
import java.math.*;

public class Solution{
	public static void main(String[]args){
	Scanner scan = new Scanner(System.in);
	double mealCost = scan.nextDouble();
	int tipPercent = scan.nextInt();
	int taxPercent = scan.nextInt();
	
	scan.close();
	
	double tip = mealCost*tipPercent/100;
    double tax = mealCost*taxPercent/100;
        
    int total_cost = (int) Math.round(mealCost + tip + tax);
	
	System.out.println("The total meal cost is "+totalCost+" dollars.");
	}
}

        