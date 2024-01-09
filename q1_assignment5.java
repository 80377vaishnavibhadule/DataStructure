package dsa;

class TreeNode {
    int key;
    TreeNode left, right;

    public TreeNode(int item) {
        key = item;
        left = right = null;
    }
}

public class q1_assignment5 {
    TreeNode root;

    public q1_assignment5() {
        root = null;
    }

    public TreeNode insertIntoBST(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }

        if (key < root.key) {
            root.left = insertIntoBST(root.left, key);
        } else if (key > root.key) {
            root.right = insertIntoBST(root.right, key);
        }

        return root;
    }

    public void printInOrder(TreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.key + " ");
            printInOrder(root.right);
        }
    }

       public static void main(String[] args) {
        q1_assignment5 tree = new q1_assignment5();

        tree.root = tree.insertIntoBST(tree.root, 50);
        tree.insertIntoBST(tree.root, 30);
        tree.insertIntoBST(tree.root, 70);
        tree.insertIntoBST(tree.root, 20);
        tree.insertIntoBST(tree.root, 40);
        tree.insertIntoBST(tree.root, 60);
        tree.insertIntoBST(tree.root, 80);

        System.out.println("In-order traversal of the BST:");
        tree.printInOrder(tree.root);
    }
}
