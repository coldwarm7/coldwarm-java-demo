package tree;

/**
 * Create by coldwarm on 2018/9/19.
 */

public class BinaryTreeByMyself {
    private class Node{
        private Node left;
        private Node right;
        private int data;

        public Node(int data){
            this.data = data;
        }
    }

    private Node root;
    public BinaryTreeByMyself(){
        root = null;
    }

    public void createTree(Node node , int data){
        if (root == null){
            root = new Node(data);
        }else{
            if (data > node.data){
                if (node.right == null){
                    node.right = new Node(data);
                }else {
                    createTree(node.right,data);
                }
            }else {
                if (node.left == null){
                    node.left = new Node(data);
                }else {
                    createTree(node.left,data);
                }
            }
        }
    }

    //二叉树的先序遍历
    public void pre(Node node){
        if (node!= null) {  //*
            System.out.println(node.data);
            pre(node.left);
            pre(node.right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};

        BinaryTreeByMyself tree = new BinaryTreeByMyself();

        for (int i=0; i <arr.length;i++){
            tree.createTree(tree.root,arr[i]);
        }
        tree.pre(tree.root);
        System.out.println("树的深度= " + tree.getHeight(tree.root));
    }

    //找出树的深度
    public int getHeight(Node node) {
        if (node == null) {
            return 0;
        } else {
            int left = getHeight(root.left);
            int right = getHeight(root.right);

            return (left>right)?(left+1):(right+1);
        }
    }

    //二叉树的节点数
    public int getNodeCOunt(Node node){
        if (node == null){
            return -1;
        }else{
            return getNodeCOunt(node.left) + getNodeCOunt(node.right)+1;
        }
    }
}
