package ae.graphs;


import java.util.ArrayList;
import java.util.List;

/**
 *  AncestralTree have ancestor property pointing to their youngest ancestor.Root will have null as its ancestor.
 *  Find the youngest ancestor of 2 decedents.
 *  Decedent can be its own ancestor
 *    A
 *   /
 *  B
 *  the youngest common ancestor for A and B is A.
 *
 *  Example tree:
 *
 *                                      A
 *                                  /       \
 *                                B          C
 *                             /    \       /  \
 *                           D       E     F    G
 *                         /  \
 *                       H      I
 *
 */

public class YoungestCommonAncestor {
    public static AncestralTree getYoungestCommonAncestor(
            AncestralTree topAncestor, AncestralTree descendantOne, AncestralTree descendantTwo) {

        // descendant one -- E
        // descendant two --  I

        // first iterate the ancestor for descendant one :: while descendantOne has ancestor -- add to list
        // now descendant two :: if descendant two currentnode :: is one of the node in list of descendant one
        // return currentNode of descendant two

        // else return ancestor Node


        List<AncestralTree> list = new ArrayList<>();

        AncestralTree currentNode = descendantOne;

        while (currentNode != null) {
            list.add (currentNode);
            currentNode = currentNode.ancestor;
        }

        currentNode = descendantTwo;
        while (currentNode != null) {
            if (list.contains(currentNode)) {
                return currentNode;
            } else {
                currentNode = currentNode.ancestor;
            }
        }

        return topAncestor; // Replace this line
    }

    static class AncestralTree {
        public char name;
        public AncestralTree ancestor;

        AncestralTree(char name) {
            this.name = name;
            this.ancestor = null;
        }

        // This method is for testing only.
        void addAsAncestor(AncestralTree[] descendants) {
            for (AncestralTree descendant : descendants) {
                descendant.ancestor = this;
            }
        }
    }
}
