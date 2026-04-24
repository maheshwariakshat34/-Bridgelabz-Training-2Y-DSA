class Node {
    int roll;
    Node left, right;

    Node(int item) {
        roll = item;
        left = right = null;
    }
}

public class StudentBST {
    Node root;

    void insert(int roll) {
        root = insertRec(root, roll);
    }

    Node insertRec(Node root, int roll) {
        if (root == null) {
            return new Node(roll);
        }
        if (roll < root.roll)
            root.left = insertRec(root.left, roll);
        else if (roll > root.roll)
            root.right = insertRec(root.right, roll);
        return root;
    }

    void delete(int roll) {
        root = deleteRec(root, roll);
    }

    Node deleteRec(Node root, int roll) {
        if (root == null) return root;

        if (roll < root.roll)
            root.left = deleteRec(root.left, roll);
        else if (roll > root.roll)
            root.right = deleteRec(root.right, roll);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            root.roll = minValue(root.right);
            root.right = deleteRec(root.right, root.roll);
        }
        return root;
    }

    int minValue(Node root) {
        int minv = root.roll;
        while (root.left != null) {
            minv = root.left.roll;
            root = root.left;
        }
        return minv;
    }

    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.roll + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        StudentBST tree = new StudentBST();
        
        int[] initialRolls = {15, 10, 20, 8, 12, 17, 25};
        for (int r : initialRolls) tree.insert(r);

        tree.delete(10);
        tree.insert(14);
        tree.insert(9);

        System.out.println("Final Tree (Inorder):");
        tree.inorder();
    }
}