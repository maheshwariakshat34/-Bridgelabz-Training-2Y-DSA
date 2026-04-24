class Node {
    String name;
    Node left, right;

    Node(String item) {
        name = item;
        left = right = null;
    }
}

public class FileSystemTraversal {
    Node root;

    void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.name + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.name + " ");
        inorder(node.right);
    }

    void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.name + " ");
    }

    public static void main(String[] args) {
        FileSystemTraversal tree = new FileSystemTraversal();
        
        tree.root = new Node("root");
        tree.root.left = new Node("home");
        tree.root.right = new Node("var");
        
        tree.root.left.left = new Node("user");
        tree.root.left.right = new Node("docs");
        
        tree.root.right.right = new Node("log");
        
        tree.root.left.left.left = new Node("config");

        System.out.println("Preorder Traversal:");
        tree.preorder(tree.root);

        System.out.println("\n\nInorder Traversal:");
        tree.inorder(tree.root);

        System.out.println("\n\nPostorder Traversal:");
        tree.postorder(tree.root);
    }
}