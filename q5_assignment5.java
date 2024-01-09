package dsa;


public class q5_assignment5 {

	class TreeNode {
	    int key;
	    TreeNode left, right;

	    public TreeNode(int item) {
	        key = item;
	        left = right = null;
	    }
	}
	
    static TreeNode root;

    q5_assignment5() {
        root = null;
    }

    // Function to return the level/depth of a given node in a BST
    static int getNodeDepth(TreeNode root, int key) {
        return getNodeDepthHelper(root, key, 1);
    }

    private static int getNodeDepthHelper(TreeNode node, int key, int depth) {
        if (node == null)
            return -1; // Node not found

        if (node.key == key)
            return depth;

        if (key < node.key)
            return getNodeDepthHelper(node.left, key, depth + 1);

        return getNodeDepthHelper(node.right, key, depth + 1);
    }

    public static void main(String[] args) {

        q5_assignment5 tree = new q5_assignment5();
        tree.root = new TreeNode(50);
        tree.root.left = new TreeNode(30);
        tree.root.right = new TreeNode(70);
        tree.root.left.left = new TreeNode(20);
        tree.root.left.right = new TreeNode(40);
        tree.root.right.left = new TreeNode(60);
        tree.root.right.right = new TreeNode(80);

        int depth = getNodeDepth(root, 60);

        if (depth != -1)
            System.out.println("Depth of node with key 60: " + depth);
        else
            System.out.println("Node not found in the BST.");
    }
}
