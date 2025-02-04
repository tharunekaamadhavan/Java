
class Node {
    Node left;
    int data;
    Node right;

    Node (int d) {
        this.data = d;
        left = right = null;
    }
}
public class Tree {


    public static void main(String[] args) {
        Node root = new Node(40);

        root.left = new Node(25);
        root.right = new Node(57);
        root.left.left = new Node(4);
        root.left.right = new Node(30);
        root.right.left = new Node(44);
        root.right.right = new Node(59);
        root.left.right.right = new Node(32);
        root.right.left.right = new Node(47);
        root.right.right.right = new Node(61);
        System.out.println("Pre order : ");
        preorder(root);
        System.out.println();
        System.out.println("Post order : ");
        postorder(root);
        System.out.println();
        System.out.println("In order : ");
        inorder(root);
        int key = 20;
        boolean found = search(root, key);
        System.out.println("\nSearch for " + key + ": " + (found ? "Found" : "Not Found"));

        int leafCount = LeafCount(root);
        System.out.println("Number of leaf nodes: " + leafCount);

    }
    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if (root.data==key)
            return true;
        if (search(root.left,key))
            return true;
        if (search(root.right,key))
            return true;
        return false;

}
static int LeafCount(Node root){
        if(root==null){
            return 0;
        }
        if (root.left==null && root.right==null)
            return 1;
        return LeafCount(root.left)+LeafCount(root.right);
}
}
