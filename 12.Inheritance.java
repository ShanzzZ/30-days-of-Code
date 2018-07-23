import java.util.Scanner;

/*
 *Given two classes, Person and Student.
 *Person is the base class and Student is the derived class. 
 *Student inherits all the properties of Person.
 *Student class has 4 parameters: firstName(string),lastName(string),id(int), scores(integer array)
 *Char calculate() method: calculates a Student's average and returns the grade character
 */

class Person { //父类，含有打印名字+id的方法
	protected String firstName; //protected保护子类，使子类可以使用它修饰的成员
	protected String lastName;
	protected int idNumber;
	
	Person(String firstName, String lastName, int identification){ //初始化属性值，以便子类引用
		this.firstName = firstName; //“此name为protected成员变量同名的参数"，使用它来消除变量引用的歧义
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	public void printPerson(){ //方法的具体实现
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person { //子类，含有计算成绩的方法
	private int[] testScores;
	
	Student(String firstName, String lastName, int identification, int[] testScores){
		super(firstName, lastName, identification); //指向离自己最近的一个父类对象
		this.testScores = testScores;
	}
	
	char calculate(){
		int total = 0;
		
		for(int testScore: testScores)
			total += testScore;
		
		int avg = total / testScores.length;
		
		if(avg>=90 && avg <=100) return 'O';
		if(avg>=80 && avg <90) return 'E';
		if(avg>=70 && avg <=80) return 'A';
		if(avg>=55 && avg <70) return 'P';
		if(avg>=40 && avg <55) return 'D';
		return 'T'; //若其他，直接return
	}
}
		
		
	
class Solution { //读取数据，打印结果
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores); //创造一个Student
        s.printPerson(); //引用父类的方法，打印名字+id
        System.out.println("Grade: " + s.calculate()); //引用子类的方法，打印成绩
    }
}	

	
	
	
				
			
		
		
