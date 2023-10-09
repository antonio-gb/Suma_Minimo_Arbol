package Estructura_2_Parcial;

import java.math.*;;

public  class minTree {
    public static void main (String[] args){
    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(4);
    Node e = new Node(5);
    Node f = new Node(6);

    a.left = b;
    a.right = c;
    b.left = d;
    b.right= e;
    c.right = f;

    //minTree2(a);
    int tr=0;
    int br=0;
    tr= sumaTree(a);
    br = minTree2(a);
    System.out.println(tr);
    System.out.println(br);

    }
/* 
    public static Integer minTree2(Node node){
        if(node == null){
            return Integer.MAX_VALUE;
        }
       int bus = Math.min(node.left, node.right);
        return Math.min(node.value, bus);
    }

    public static int sumTree(Node node){
        if(node == null){
            return 0;
        }else{
        return(node.value + node.right + node.left);
        }
    }*/

    public static int sumaTree(Node node) {
	
        if(node == null){
            return 0;
        }
        
        return node.value + sumaTree(node.left) + sumaTree(node.right);
    }
    
    public static int minTree2(Node node) {
    
        if(node == null) {
            return Integer.MAX_VALUE; 
        }
    
        return Math.min(Math.min(node.value,node.left.value), node.right.value);
    }
}
