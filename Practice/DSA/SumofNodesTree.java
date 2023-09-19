package DSA;
import java.util.*;
public class SumofNodesTree {

    //Represent the node of binary tree
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            //Assign data to the new node, set left and right children to null
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Represent the root of binary tree
    public Node root;

    public SumofNodesTree(){
        root = null;
    }

    //calculateSum() will calculate the sum of all the nodes present in the binary tree
    public int calculateSum(Node temp){
        Queue<Node> nodesToProcess = new ArrayDeque<>();
        nodesToProcess.add(temp);

        int sum = 0;
        while (!nodesToProcess.isEmpty()) {
            Node node = nodesToProcess.poll();

            sum += node.data;

            if (node.left != null) nodesToProcess.add(node.left);
            if (node.right != null) nodesToProcess.add(node.right);
        }

        return sum;
        }


    public static void main(String[] args) {

        SumofNodesTree bt = new SumofNodesTree();
        //Add nodes to the binary tree
        bt.root = new Node(5);
        bt.root.left = new Node(2);
        bt.root.right = new Node(9);
        bt.root.left.left = new Node(1);
        bt.root.right.left = new Node(8);
        bt.root.right.right = new Node(6);

        //Display the sum of all the nodes in the given binary tree
        System.out.println("Sum of all nodes of binary tree: " + bt.calculateSum(bt.root));
    }
}
