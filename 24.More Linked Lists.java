import java.util.Scanner;

/*
 *removeDuplicates function: deletes any duplicate nodes from the list and returns the head of the updated list.
 */
 
class Node{ //1.定义字节
	int data;
	Node next;
	
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{
	public static Node removeDuplicates(Node head) {//4.删除重复
		Node curr = head;
		while (curr != null && curr.next != null) { //序号
		while (curr.next != null && curr.data == curr.next.data) { //序号对应的数据
				curr.next = curr.next.next;
		}
		curr = curr.next;
		}
		return head;
    }
    
    public static  Node insert(Node head,int data)//3.录入数据
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)//5.输出方法
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])//2.读取
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              
              head=removeDuplicates(head);
              display(head);

       }
    }
	