import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 *Visit each level of a tree's nodes from left to right, top to bottom.
 *You are given a pointer,root, pointing to the root of a binary search tree.
 *Complete the levelOrder function:prints the level-order traversal of the binary search tree
 */
 
class Node {//定义
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {
    public static void levelOrder(Node root) {
    	Queue <Node> q = new LinkedList<>(); //建立一个queue
    	q.add(root);//先放入根节点
    	
    	while(!q.isEmpty()){
    	Node curr = q.remove();//去掉根节点（删除第一个元素）
            System.out.print(curr.data + " ");
            
            if (curr.left != null) q.add(curr.left);//进入下一层添加新节点
            if (curr.right != null) q.add(curr.right);
        }
    }
    	

    
public static Node insert(Node root,int data){//递归
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){//读取数据
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}