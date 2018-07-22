import java.util.Scanner;

/*
 *Given n names and phone numbers
 *Given an unknown number of names to query your phone book
 *For each name queried, print "name=phoneNumber" on a new line.
 *If an entry for name is not found, print Not found instead.
 */
public class Solution{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        HashMap<String, Integer> phoneBook = new HashMap<String,Integer>(); 
        
        
        for(int i= 0; i<n;i++){
            String name = scan.next();
            int phone = scan.nextInt();    
            phoneBook.put(name,phone); //使用Hashmap存储name和phone
        }
        
        while (scan.hasNext()){
            String s = scan.next();
            if(phoneBook.containsKey(s)){  //如果phoneBook集合中包含指定的键名name
                int phone = phoneBook.get(s); //get()方法：返回s对应的phone
                System.out.println(s+"="+phone);
            }
            else 
                System.out.println("Not found");
        }
        scan.close();
    }
}
            
			
		
		
		