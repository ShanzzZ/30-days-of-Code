import java.util.Scanner;

/*
 *Create a new Node (pass data as the Node constructor argument)
 *Insert it at the tail of the linked list referenced by the head parameter. 
 *Once the new node is added, return the reference to the head node.
 */

class Node { //定义链表的节点类
	int data; 
	Node next; 
	
	Node(int d) { 
        data = d;
        next = null; 
    }
}

class Solution { 
    public static Node insert(Node head, int data) { 
        if (head == null) //若没有头节点，制作一个，用来存储data
        	head = new Node(data); 
        else {
            Node curr = head; //若有，当前节点为头节点
            
            while (curr.next != null) //若有下一个节点，盯住下一个（若没有说明读取数据结束，退出即可）
            	curr = curr.next;
            curr.next = new Node(data); 
        }
        return head;
    }
    
    
    public static void display(Node head) { //输出方法
        Node start = head; //函数互相独立，不可直接使用head调用
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next; 
        }
    }

    public static void main(String args[]) { //读取数据
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt(); 

        while(N-- > 0) { //确保下一个N存在
            int ele = sc.nextInt(); //将数据储存在ele中
            head = insert(head,ele); //head为头节点，不断将单个ele放入头节点
        }
        display(head); //引用display方法打印head
        sc.close();
    }
}
	