package dsa;



public class q3_assignment5 {

	class TreeNode {
	    int key;
	    TreeNode left, right;

	    public TreeNode(int item) {
	        key = item;
	        left = right = null;
	    }
	}
    static TreeNode root;

    q3_assignment5() {
        root = null;
    }

    
    static int countLeafNodes(TreeNode node) {
        if (node == null)
            return 0;

        
        if (node.left == null && node.right == null)
            return 1;

        
        int leftCount = countLeafNodes(node.left);
        int rightCount = countLeafNodes(node.right);

      
        return leftCount + rightCount;
    }

    public static void main(String[] args) {
     
    	q3_assignment5 tree = new q3_assignment5();
    	q3_assignment5.root = new TreeNode(50);
        tree.root.left = new TreeNode(30);
        tree.root.right = new TreeNode(70);
        tree.root.left.left = new TreeNode(20);
        tree.root.left.right = new TreeNode(40);
        tree.root.right.left = new TreeNode(60);
        tree.root.right.right = new TreeNode(80);

       
        int leafCount = countLeafNodes(root);

        System.out.println("Number of leaf nodes: " + leafCount);
    }
}
