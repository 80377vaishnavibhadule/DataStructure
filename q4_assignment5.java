package dsa;

public class q4_assignment5 {

    static TreeNode root;

    q4_assignment5() {
        root = null;
    }

    class TreeNode {
        int key;
        TreeNode left, right;

        public TreeNode(int item) {
            key = item;
            left = right = null;
        }
    }
    static int countNonLeafNodes(TreeNode node) {
        if (node == null || (node.left == null && node.right == null))
            return 0;

       
        int leftCount = countNonLeafNodes(node.left);
        int rightCount = countNonLeafNodes(node.right);

        
        return 1 + leftCount + rightCount;
    }

    public static void main(String[] args) {
   

        q4_assignment5 tree = new q4_assignment5();
        tree.root = new TreeNode(50);
        tree.root.left = new TreeNode(30);
        tree.root.right = new TreeNode(70);
        tree.root.left.left = new TreeNode(20);
        tree.root.left.right = new TreeNode(40);
        tree.root.right.left = new TreeNode(60);
        tree.root.right.right = new TreeNode(80);

        
        int nonLeafCount = countNonLeafNodes(root);

        System.out.println("Number of non-leaf nodes: " + nonLeafCount);
    }
}
