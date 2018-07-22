import java.util.Scanner;

/* 
 *Write a Person class with an instance variable, age, and a constructor that takes an integer,intialAge, as a parameter. 
 *If initialAge is negative, it should be set to 0, print:Age is not valid, setting age to 0. 
 *Write the following instance methods:
 *yearPasses() should increase the  instance variable by .
 *amIOld() should perform the following conditional actions:
 *If age <13, print:You are young..
 *If age >=13 and <18, print:You are a teenager.
 *Otherwise, print:You are old.
 */

public class Person {
    private int age;	
  
	public Person(int initialAge) {
        if(initialAge<0) {
            System.out.println("Age is not valid, setting age to 0.");
            age=0;
        }
        else age=initialAge;
 
	}

	public void amIOld() {
  		
        if(age<13)
        System.out.println("You are young.");
        else if(age<18)
            System.out.println("You are a teenager.");
        else System.out.println("You are old.");
	}

	public void yearPasses() {
        age++;
  		
	}	    		
	    		
	public static void main(String[] args) { //static静态方法，可以直接使用“类名.方法名”调用
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
		
