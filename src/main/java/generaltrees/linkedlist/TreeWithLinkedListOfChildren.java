package generaltrees.linkedlist;

import generaltrees.queues.*;

/** A general tree */
public class TreeWithLinkedListOfChildren {
    private TreeNode root;

    private class TreeNode {
        int elem;
        TreeNode leftChild;
        public TreeNode rightSibling;

        TreeNode(int elem) {
            this.elem = elem;
            // leftChild and rightSibling are null by default
        }
    }

    public int numLevels() {
        return numLevels(root);
    }

    public int numNodes() {
        return numNodes(root);
    }

    public int numLeaves() {
        return numLeaves(root);
    }

    public void printPreorder() {
        printPreorder(root);
    }

    /** Print the values in the tree level by level (top to bottom, left to right)
     *
     */
    public void printByLevel() {
        Queue queue = new ArrayQueue(100);
        queue.enqueue(root);

        while(!queue.empty()) {
            // FILL IN CODE

        }
    }


    public StringBuilder serialize() {
        return serialize(root);
    }

    /** Compute the number of levels in the tree with the given root
     *
     * @param node root of the tree
     * @return number of levels
     */
    private int numLevels(TreeNode node) {
        int maxNumLevels = 0;
        // FILL IN CODE


        return maxNumLevels;
    }

    /**
     * Count the number of nodes
     * @param node root of the tree
     * @return number of nodes in the tree with the given root
     */
    private int numNodes(TreeNode node) {
        int num = 0;
        // FILL IN CODE

        return num;
    }

    /**
     * Count the number of leaves
     * @param node root of the tree
     * @return number of leaves in the tree with the given root
     */
    private int numLeaves(TreeNode node) {
        int numLeaves = 0;
        // FILL IN CODE

        return numLeaves;
    }

    /**
     * Print the values in the nodes of the tree using preorder traversal
     * @param node root of the tree
     */
    private void printPreorder(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.elem + " ");
        TreeNode curr = node.leftChild;
        while (curr != null)  {
            printPreorder(curr);
            curr = curr.rightSibling;
        }
    }

    private StringBuilder serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        // FILL IN CODE: return a string builder representing the tree
        // traverse using preorder, print ) whenever the node has no more children

        return sb;
    }


    /**
     * Creates a new tree:
              10
       2      15     18
     5   6         0  3  7
     */
    public void createTree() {
        root = new TreeNode(10);
        TreeNode node2 = new TreeNode(2);
        root.leftChild = node2;

        TreeNode node15 = new TreeNode(15);
        node2.rightSibling = node15;

        TreeNode node18 = new TreeNode(18);
        node15.rightSibling = node18;

        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        node2.leftChild = node5;
        node5.rightSibling = node6;

        TreeNode node0 = new TreeNode(0);
        TreeNode node3 = new TreeNode(3);
        TreeNode node7 = new TreeNode(7);

        node18.leftChild = node0;
        node0.rightSibling = node3;
        node3.rightSibling = node7;
    }
}

