package com.voyager.common.utils.tree;

import com.voyager.model.tree.Node;

import java.util.List;
import java.util.Stack;

public class TraversalUtils {

    /**
     * 前序遍历
     * @param root
     */
    public static <T> void preTraversal(Node<T> root) {
        Stack<Node<T>> stack = new Stack<>();
        if (root == null) {
            System.out.println("root Node is empty");
            return;
        }

        stack.push(root);

        while(!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.println("Node : " + (T)current.getValue());
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
    public static <T> void inTraversal(Node<T> root) {
        Stack<Node<T>> stack = new Stack<Node<T>>();
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
                System.out.println("Node : " + (T)current.getValue());
                current = current.getRightChild();
            }
        }
    }

    /**
     * 后序遍历
     * @param root
     */
    public static <T> void afterTraversal(Node<T> root) {
        Stack<Node<T>> stack = new Stack<Node<T>>();
        Stack<Node<T>> stackTraversal = new Stack<Node<T>>();
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
            System.out.println("Node : " + (T)stackTraversal.pop().getValue().toString());
        }
    }

    /**
     * 前序遍历-递归
     * @param node
     */
    public static <T> void preTraversalRecursion(Node<T> node) {
        if ( node == null) {
            return;
        }

        System.out.println("Node : " + (T)node.getValue().toString());
        preTraversalRecursion(node.getLeftChild());
        preTraversalRecursion(node.getRightChild());
    }

    /**
     * 中序遍历-递归
     * @param node
     */
    public static <T> void inTraversalRecursion(Node<T> node) {
        if ( node == null) {
            return;
        }

        inTraversalRecursion(node.getLeftChild());
        System.out.println("Node : " + (T)node.getValue().toString());
        inTraversalRecursion(node.getRightChild());
    }

    /**
     * 后序遍历-递归
     * @param node
     */
    public static <T >void afterTraversalRecursion(Node<T> node) {
        if ( node == null) {
            return;
        }

        afterTraversalRecursion(node.getLeftChild());
        afterTraversalRecursion(node.getRightChild());
        System.out.println("Node : " + (T)node.getValue().toString());
    }

    /**
     * 构造二叉树-前序
     * @param elements
     * @return
     */
    public static <T> Node<T> generateBiTreePro(List<T> elements, T value) {

        Node<T> node = new Node<T>(value);

        if (elements != null && elements.size() > 0) {
            node = new Node<T>();
            node.setValue(elements.remove(0));
            if ( (node.getValue()).equals(value)) {
                return node;
            }
            node.setLeftChild(generateBiTreePro(elements, value));
            node.setRightChild(generateBiTreePro(elements, value));
        }

        return node;
    }

}
