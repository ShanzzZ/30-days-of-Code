import java.util.Scanner;

/*
 *Write a single generic function printArray
 *The function must print each element of its generic array parameter on a new line.
 */
 
class Printer <T> { //确定泛型T
	public <T> void printArray(T[] array){ //<T>声明此为泛型方法，小括号指明泛型T的具体类型
		for(T element : array){
		System.out.println(element);
	}
}


public class Generics {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }
        
        Printer<Integer> intPrinter = new Printer<Integer>();//调用泛型
        //传入的实参类型需与泛型的类型参数类型相同，即为Integer.
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );//调用方法
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
        //返回一个 Method 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明方法
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    } 
}