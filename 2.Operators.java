import java.util.Scanner;

/*
 *
 Given the meal price, tip percent, tax percent
 Find and print the meal's total cost
 */
	
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
		//Math.ceil向上取整，Math.floor向下取整，Math.round四舍五入，注意语句前标记想要的数据类型int
	
	System.out.println("The total meal cost is "+totalCost+" dollars.");
	}
}

        
