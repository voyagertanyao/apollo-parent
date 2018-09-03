package com.voyager.core.tree;

import com.voyager.common.utils.tree.TraversalUtils;
import com.voyager.model.tree.Node;
import com.voyager.model.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class NodeTest {

    public static Node root;

    static {
        root = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");
        Node h = new Node("H");
        Node i = new Node("I");
        Node j = new Node("J");
        Node k = new Node("K");

        root.setLeftChild(b);
        root.setRightChild(c);

        b.setLeftChild(d);
        b.setRightChild(e);

        d.setLeftChild(h);

        h.setRightChild(k);

        c.setLeftChild(f);
        c.setRightChild(g);

        f.setLeftChild(i);

        g.setRightChild(j);
    }

    public static void main(String[] args) {

        //TraversalUtils.preTraversal(root);
        //TraversalUtils.inTraversal(root);
        //TraversalUtils.afterTraversal(null);

        //TraversalUtils.afterTraversalRecursion(root);
        //TraversalUtils.inTraversalRecursion(root);
        //TraversalUtils.preTraversalRecursion(root);
        String nameStr = new String("ABCD#E###F##G#HIJ####");
        char[] names = nameStr.toCharArray();
        List<Tree> nodes = new ArrayList<>();
        for(char name : names) {
            nodes.add(new Tree(String.valueOf(name)));
        }
        Node root = TraversalUtils.generateBiTreePro(nodes, new Tree("#"));

        TraversalUtils.preTraversal(root);
    }
}
