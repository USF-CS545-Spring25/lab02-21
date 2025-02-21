package generaltrees.array;

import generaltrees.queues.*;

public class TreeWithArrayOfChildren {
    private TreeNode root;

    private class TreeNode {
        int elem;
        TreeNode[] children;
        TreeNode(int elem) {
            this.elem = elem;
        }
    }

    public void printPreorder() {
        printPreorder(root);
    }

    public StringBuilder serialize() {
        return serialize(root);
    }

    public int numNodes() {
        return numNodes(root);
    }

    public int numLevels() {
        return numLevels(root);
    }

    public int numLeaves() {
        return numLeaves(root);
    }

    /**
     * Print nodes top to bottom, left to right
     */
    public void printByLevel() {
        Queue queue = new ArrayQueue(100);
        if (root == null)
            return;
        queue.enqueue(root);
        while (!queue.empty()) {
            TreeNode curr = (TreeNode) queue.dequeue();
            // FILL IN CODE

        }
        System.out.println();

        // What to make it a bit more interesting? Print the level of each node too.
    }

    private void printPreorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.elem + " ");
            if (root.children != null) {
                for (int i = 0; i < root.children.length; i++) {
                    printPreorder(root.children[i]);
                }
            }
        }
    }

    /** Serialize a given tree. Use Preorder.
     * Append "(" to the string when done handling the children of the node)
     * @param root root of the tree
     * @return string representing the tree
     */
    private StringBuilder serialize(TreeNode root) {
        StringBuilder sb  = new StringBuilder();
        if (root != null) {
            sb.append(root.elem + " ");
            if (root.children != null) {
                for (int i = 0; i < root.children.length; i++) {
                    sb.append(serialize(root.children[i]));
                }
            }
            sb.append(")");
        }
        return sb;
    }

    private int numNodes(TreeNode root) {
        // FILL IN CODE: add a base case and a recursive case - compute the number of nodes recursively

        return 0;
    }

    private int numLeaves(TreeNode root) {
        // FILL IN CODE: compute the number of leaves recursively
        // Consider using the provided isLeaf method

        return 0;
    }

    // Helper method to check if the node is a leaf (no children)
    private boolean isLeaf(TreeNode root) {
        if (root.children == null)
            return true;
        for (TreeNode child: root.children) {
            // array of children exists, but all references are null
            if (child != null)
                return false;
        }
        return true;
    }

    private int numLevels(TreeNode root) {
        // FILL IN CODE: compute the number of levels recursively

        return 0;
    }

    /**
                   5
         1         15        22
     80   20             8   9    17
                                 0   6
     */
    public void createTree() {
        TreeNode t1 = new TreeNode(5);
        t1.children = new TreeNode[3];
        t1.children[0] = new TreeNode(1);
        t1.children[1] = new TreeNode(15);
        t1.children[2] = new TreeNode(22);
        t1.children[0].children = new TreeNode[2];
        t1.children[0].children[0] = new TreeNode(80);
        t1.children[0].children[1] = new TreeNode(20);
        t1.children[2].children = new TreeNode[3];
        t1.children[2].children[0] = new TreeNode(8);
        t1.children[2].children[1] = new TreeNode(9);
        t1.children[2].children[2] = new TreeNode(17);
        t1.children[2].children[2].children = new TreeNode[2];
        t1.children[2].children[2].children[0] = new TreeNode(0);
        t1.children[2].children[2].children[1] = new TreeNode(6);
        root = t1;

    }
}
