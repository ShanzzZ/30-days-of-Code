import java util.Scanner;

/*
 *Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.
 */
 public class Solution{
  	  public static void main(String[]args){
  	  	  Scanner scan = new Scanner(System.in);
  	  	  
  	  	  int[][]A = new int[6][6];
  	  	  
  	  	  for(int i=0; i<6; i++){  	  
  	  	  	  for(int j=0; j<6; j++){
  	  	  	  	  A[i][j] = scan.nextInt();//读取数组
  	  	  	  }
  	  	  }
  	  	  
  	  	  int max=-9 * 7;
  	  	  for(int i=0; i<6; i++){  	  
  	  	  	  for(int j=0; j<6; j++){
  	  	  	  	  if(i+2<6 && j+2<6){
  	  	  	  int sum = A[i][j]+A[i][j+1]+A[i][j+2]+A[i+1][j]+A[i+1][j+1]+A[i+1][j+2]+A[i+2][j]+A[i+2][j+1]+A[i+2][j+2];
  	  	  	  //计算9个A[i][j]的合计
  	  	  	  if(sum>max)
  	  	  	  	  max = sum;
  	  	  	  	  }
  	  	  	  }
  	  	  }
  	  	  System.out.println(max);
  	  	  
  	  }
  }
  