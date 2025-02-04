class Node {
    Node left;
    int data;
    Node right;

    Node(int d) {
        this.data = d;
        left = right = null;
    }
}

public class BinarySearchTree {

    Node delete(Node root, int d) {
        if (root == null)
            return null;

        if (d > root.data)
            root.right = delete(root.right, d);
        else if (d < root.data)
            root.left = delete(root.left, d);
        else {
            // Case 1: No child or one child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 2: Two children, get the inorder successor (smallest in right subtree)
            root.data = findMin(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    int findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    // Helper method to print in-order traversal (for testing)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        System.out.println("Original BST:");
        bst.inorder(root);
        System.out.println();

        root = bst.delete(root, 50);

        System.out.println("BST after deleting 50:");
        bst.inorder(root);
        System.out.println();
    }
}
