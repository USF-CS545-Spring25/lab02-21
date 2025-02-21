package generaltrees;

import generaltrees.array.TreeWithArrayOfChildren;
import generaltrees.linkedlist.TreeWithLinkedListOfChildren;

public class Main {
    public static void main(String[] args) {
        // First, test a tree that stores children in an array:
        TreeWithArrayOfChildren tree1 = new TreeWithArrayOfChildren();
        tree1.createTree();
        tree1.printPreorder();
        System.out.println();
        System.out.println(tree1.numNodes());
        // System.out.println(tree1.numLevels());
        // System.out.println(tree1.numLeaves());

        // Second, test a tree that stores children in a linked list:
        /*
        TreeWithLinkedListOfChildren tree2 = new TreeWithLinkedListOfChildren();
        tree2.createTree();
        tree2.printPreorder();
        System.out.println();
        System.out.println(tree2.numNodes());
        // System.out.println(tree2.numLevels());
        // System.out.println(tree2.numLeaves());
        */
    }
}
