import java.util.Scanner;

/*
 *Read a string,S,and print its integer value; 
 *If S cannot be converted to an integer, print:Bad String.
 */
	
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        try { //检查异常
            int i = Integer.parseInt(s); 
            System.out.println(i);
        } catch (NumberFormatException e) { //若有异常，执行catch内方法
            System.out.println("Bad String");
        }
    }
}

//为什么不用if条件判断：
//try是捕获异常的，即异常并不是我们能预先知道的，所以不能用if条件来判断
//异常是需要在程序的运行中进行捕获的
//此外，if…else…属于程序结构中的分支结构；try…catch…属于顺序结构
