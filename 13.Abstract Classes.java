import java.util.Scanner;

/*
 *Given a Book class and a Solution class, write a MyBook class that:
 *Inherits from Book
 *Has a parameterized constructor taking these parameters:title(string),author(string),price(int)
 *Implements the Book class' abstract display() method so it prints these lines:
 *Title: a space, and then the current instance's.
 *Author: a space, and then the current instance's.
 *Price: a space, and then the current instance's.
 */
 
abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book{
	private int price;
	
	MyBook(String title, String author,int price){
		super(title,author); //注意super和this的顺序
		this.price = price;
	}
	
	@Override //说明被标注的方法重载了父类的方法
	void display(){ //子类对父类的方法重写（外壳不变，内质重写）
		System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
	}
}
		
		

public class Solution {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}