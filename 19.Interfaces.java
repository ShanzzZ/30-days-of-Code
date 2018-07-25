import java.util.Scanner;

/*
 *Complete the implementation of Calculator class, which implements the AdvancedArithmetic interface. 
 *The implementation for the divisorSum(n) method must return the sum of all divisors of n.
 */

interface AdvancedArithmetic{ //为防止两个类有相同方法，产生二义性，使用interface
   int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic { //实现接口，只有方法声明没有定义
    public int divisorSum(int n) {
    	int sum = 0;
    	for(int i=1; i<=n;i++){
    		if(n%i==0) sum += i;
    	}
        return sum;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        //获得myCalculator对象所实现的第一个接口的实体名称
        System.out.println(sum);
    }
}