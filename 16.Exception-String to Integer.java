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