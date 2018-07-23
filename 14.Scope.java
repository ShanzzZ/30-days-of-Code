import java util.Scanner;

/*
 *Writing the following:
 *A class constructor that takes an array of integers as a parameter and saves it to the elements instance variable.
 *A computeDifference method that finds the maximum absolute difference between any 2 numbers in N and stores it in the maximumDifference instance variable.
 */
 
class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
  	Difference(int[] elements){ //方法是独立的，不可用Solution中的对象n或a
  		this.elements = elements;
  	}
  	
  	void computeDifference(){
        int max = 0; //此处不可直接写maximumDifference，否则将不进入遍历直接输出0
        
  		for(int i=0;i<elements.length;i++){ 
  			for(int j=0;j<element.length;j++){
  				int diff = Math.abs(elements[i] - elements[j]);
  			    
  			if(diff>max)
  				max = diff;
  			}
  		}
  		maximumDifference = max;
  	}
}


public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a); //获取difference方法中的数组

        difference.computeDifference();//获取compute方法中的遍历方法

        System.out.print(difference.maximumDifference);
    }
}