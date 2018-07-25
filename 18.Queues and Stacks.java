import java.util.LinkedList;
import java util.Scanner;

/*Determine if a given string is a palindrome.*/
public class Solution {
    private LinkedList stack; //collection that based on LIFO
    private LinkedList queue; //FIFO

    public Solution() { //生成空的链表,将linkedlist作为接口
        this.stack = new LinkedList(); 
        this.queue = new LinkedList();
    }

    private char popCharacter() { //正序
        return (char) this.stack.pop(); //取出栈顶元素，并将该元素从栈中删除
    }

    private void pushCharacter(char c) { 
        this.stack.push(c); //将元素推入栈中
    }

    private char dequeueCharacter() { //倒叙
        return (char) this.queue.remove(0);//移除并返回队列头部的元素
    }

    private void enqueueCharacter(char c) {
        this.queue.addLast(c); //将元素添加到链表的最后
    }

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        char[] s = input.toCharArray(); 

        Solution p = new Solution();

        for (char c : s) { //遍历s中的字符
            p.pushCharacter(c); //针对每一个字符，执行pushCharacter方法
            p.enqueueCharacter(c); //针对每一个字符，执行enqueueCharacter方法
        }

        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
        //若不是互文，输出"not a palindrome."
    }
}