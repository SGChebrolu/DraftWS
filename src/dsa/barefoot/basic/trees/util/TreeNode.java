package dsa.barefoot.basic.trees.util;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public static TreeNode getPreFilledTree(){
        return new TreeNode
                (1,
                        new TreeNode
                                (2,
                                        new TreeNode(3),
                                        new TreeNode(4,new TreeNode(5),new TreeNode(6))
                                ),
                        new TreeNode(7)
                );
    }
}
