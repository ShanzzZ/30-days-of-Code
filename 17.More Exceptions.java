import java.util.Scanner;

/*
 *Write a Calculator class with a single method: int power(int,int).
 *The power method takes two integers, n and p, and returns the integer result of n^p.
 *If either is negative, the method throws an exception with the message: n and p should be non-negative.
 */
 
class Calculator{
	public int power(int n,int p)throws Exception{ //表示该方法可能会抛出异常，本身不处理异常
		if(n<0||p<0)
			throw new Exception("n and p should be non-negative"); //将异常封装为异常对象，然后抛出
		return (int) Math.pow(n,p);
	}
}


class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}