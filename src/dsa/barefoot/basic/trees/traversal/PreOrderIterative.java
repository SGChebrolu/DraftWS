package dsa.barefoot.basic.trees.traversal;

import dsa.barefoot.basic.trees.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderIterative {

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.getPreFilledTree();
        preOrderIterativeTraversal(treeNode).forEach(System.out::println);
    }

    private static List<Integer> preOrderIterativeTraversal(TreeNode root) {
        // TC - O(n) , SC - O(n)

        List<Integer> output = new ArrayList<>();
        if (root == null) return output;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop(); //Root
            output.add(root.val);

            if (root.right != null) { //RightNode
                stack.push(root.right);
            }

            if (root.left != null) { //LeftNode
                stack.push(root.left);
            }
        }
        return output;
    }
}
