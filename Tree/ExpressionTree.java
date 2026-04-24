class Node {
    String val;
    Node left, right;

    Node(String val) {
        this.val = val;
        left = right = null;
    }
}

public class ExpressionTree {

    void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.val + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void inorder(Node node) {
        if (node == null) return;
        if (isOperator(node.val)) System.out.print("( ");
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
        if (isOperator(node.val)) System.out.print(") ");
    }

    void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val + " ");
    }

    boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    public static void main(String[] args) {
        ExpressionTree tree = new ExpressionTree();

        Node root = new Node("-");
        root.left = new Node("+");
        root.right = new Node("e");
        
        root.left.left = new Node("*");
        root.left.right = new Node("/");
        
        root.left.left.left = new Node("a");
        root.left.left.right = new Node("b");
        
        root.left.right.left = new Node("c");
        root.left.right.right = new Node("d");

        System.out.println("Preorder (Prefix):");
        tree.preorder(root);

        System.out.println("\n\nInorder (Infix):");
        tree.inorder(root);

        System.out.println("\n\nPostorder (Postfix):");
        tree.postorder(root);
    }
}