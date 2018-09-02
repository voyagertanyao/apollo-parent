package com.voyager.common.utils.tree;

import com.voyager.model.tree.Node;

import java.util.Stack;

public class TraversalUtils {

    /**
     * 前序遍历
     * @param root
     */
    public static void preTraversal(Node root) {
        Stack<Node> stack = new Stack<Node>();
        if (root == null) {
            System.out.println("root Node is empty");
            return;
        }

        stack.push(root);

        while(!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.println("Node : " + current.getName());
            if (current.getRightChild() != null) {
                stack.push(current.getRightChild());
            }
            if (current.getLeftChild() != null) {
                stack.push(current.getLeftChild());
            }
        }
    }

    /**
     * 中序遍历
     * @param root
     */
    public static void inTraversal(Node root) {
        Stack<Node> stack = new Stack<Node>();
        if (root == null) {
            System.out.println("root Node is empty");
            return;
        }

        Node current = root;

        while( current != null ||!stack.isEmpty()) {

            if (current != null) {
                stack.push(current);
                current = current.getLeftChild();
            } else {
                current = stack.pop();
                System.out.println("Node : " + current.getName());
                current = current.getRightChild();
            }
        }
    }

    /**
     * 后序遍历
     * @param root
     */
    public static void afterTraversal(Node root) {
        Stack<Node> stack = new Stack<Node>();
        Stack<Node> stackTraversal = new Stack<Node>();
        if (root == null) {
            System.out.println("root Node is empty");
            return;
        }

        stack.push(root);

        while(!stack.isEmpty()) {
            Node current = stack.pop();
            stackTraversal.push(current);
            if (current.getLeftChild() != null) {
                stack.push(current.getLeftChild());
            }
            if (current.getRightChild() != null) {
                stack.push(current.getRightChild());
            }
        }
        while(!stackTraversal.isEmpty()) {
            System.out.println("Node : " + stackTraversal.pop().getName());
        }
    }

    /**
     * 前序遍历-递归
     * @param node
     */
    public static void preTraversalRecursion(Node node) {
        if ( node == null) {
            return;
        }

        System.out.println("Node : " + node.getName());
        preTraversalRecursion(node.getLeftChild());
        preTraversalRecursion(node.getRightChild());
    }

    /**
     * 中序遍历-递归
     * @param node
     */
    public static void inTraversalRecursion(Node node) {
        if ( node == null) {
            return;
        }

        inTraversalRecursion(node.getLeftChild());
        System.out.println("Node : " + node.getName());
        inTraversalRecursion(node.getRightChild());
    }

    /**
     * 后序遍历-递归
     * @param node
     */
    public static void afterTraversalRecursion(Node node) {
        if ( node == null) {
            return;
        }

        afterTraversalRecursion(node.getLeftChild());
        afterTraversalRecursion(node.getRightChild());
        System.out.println("Node : " + node.getName());
    }
}
