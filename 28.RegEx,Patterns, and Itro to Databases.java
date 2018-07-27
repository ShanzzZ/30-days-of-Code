import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Regex可以用于很多类型的文本处理，如匹配、搜索、提取、替换和分析结构化内容

/*
 *Database table, Emails, which has the attributes First Name and Email ID.
 *Given N rows of data simulating the Emails table 
 *Print an alphabetically-ordered list of people whose email address ends in @gamil.com.
 */
 
public class Solution {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	
    String emailRegEx = "@gmail\\.com";// "\."匹配"."
    Pattern pattern = Pattern.compile(emailRegEx);//创建正则表达式
    
    ArrayList<String> list = new ArrayList<>();
        
	for (int i = 0; i < N; i++) {
            String name = scan.next();
            String email = scan.next();
            Matcher matcher = pattern.matcher(email);//一次性匹配字符
            
            if (matcher.find()) {//对字符串进行匹配,匹配到的字符串可以在任何位置
            	list.add(name); //在list中加入name
            }
    }
            
            Collections.sort(list);//按自然顺序排序
            
            for (String name : list){//遍历list
            System.out.println(name);
        }
    }
}