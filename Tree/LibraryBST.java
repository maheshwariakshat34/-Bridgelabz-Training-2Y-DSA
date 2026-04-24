class Node {
    int isbn;
    Node left, right;

    public Node(int item) {
        isbn = item;
        left = right = null;
    }
}

public class LibraryBST {
    Node root;

    // Logic for part (a)
    Node insert(Node root, int isbn) {
        if (root == null) {
            return new Node(isbn);
        }
        if (isbn < root.isbn)
            root.left = insert(root.left, isbn);
        else if (isbn > root.isbn)
            root.right = insert(root.right, isbn);
        return root;
    }

    // Logic for part (c)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.isbn + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        LibraryBST tree = new LibraryBST();
        int[] isbns = {50, 30, 70, 20, 40, 60, 80, 10, 25};

        for (int id : isbns) {
            tree.root = tree.insert(tree.root, id);
        }

        System.out.println("Inorder Traversal (Sorted ISBNs):");
        tree.inorder(tree.root); 
        // Output: 10 20 25 30 40 50 60 70 80
    }
}