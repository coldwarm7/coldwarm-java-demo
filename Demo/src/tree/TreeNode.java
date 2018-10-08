package tree;

/**
 * Create by coldwarm on 2018/9/19.
 * 通过中序和先序或者中序和后序我们就可以确定一颗二叉树
 */

public class TreeNode {
    private TreeNode lefTreeNode;
    private TreeNode rightTreeNode;

    private int value;

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(10);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(35);

        treeNode1.setLefTreeNode(treeNode2);
        treeNode1.setRightTreeNode(treeNode3);
        treeNode3.setLefTreeNode(treeNode4);
        treeNode3.setRightTreeNode(treeNode5);

        preTraverseBTree(treeNode1);
    }

    //递归  先序
    public static void preTraverseBTree(TreeNode rootTreeNode){
        if (rootTreeNode != null){

            //访问根节点
            System.out.println(rootTreeNode.getValue());

            //访问左节点
            preTraverseBTree(rootTreeNode.getLefTreeNode());

            //访问右节点
            preTraverseBTree(rootTreeNode.getRightTreeNode());
        }
    }

    public TreeNode(int value){
        this.value = value;
    }

    public TreeNode getLefTreeNode() {
        return lefTreeNode;
    }

    public void setLefTreeNode(TreeNode lefTreeNode) {
        this.lefTreeNode = lefTreeNode;
    }

    public TreeNode getRightTreeNode() {
        return rightTreeNode;
    }

    public void setRightTreeNode(TreeNode rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}

