import java.util.Scanner;

/*
 *The height of a binary search tree is the number of edges between the tree's root and its furthest leaf. 
 *You are given a pointer,root, pointing to the root of a binary search tree.
 *Complete the getHeight function that returns the height of the binary search tree.
 */

//二叉查找树的特点：任一节点的左子树上的节点都比它小，右子树上的节点都比它大

class Node{ //定义链表节点类
    Node left,right; 
    int data;
    
    Node(int data){ 
        this.data=data;
        left=right=null;//将左右节点定义为空
    }
}

class Solution{
	public static int getHeight(Node root){
      return root == null ? -1 : 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }//取左右根最大值
    
    
public static Node insert(Node root,int data){//递归方法
        if(root==null){ //若没有根，返回一个新节点
            return new Node(data); 
        }
        else{
            Node cur;
            if(data<=root.data){ //若小
                cur=insert(root.left,data);//向二叉查找树左侧中插入一个数据
                root.left=cur; 
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;//返回当前数据为树根节点
        }
    }
public static void main(String args[]){ //读取data,置入root
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt(); //数据个数
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
    
    