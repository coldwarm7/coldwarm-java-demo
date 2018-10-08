package LinkedList;

import tree.Node;

/**
 * Create by coldwarm on 2018/9/21.
 * 从单链表里面找出倒数第K个数
 */

public class FindKFromList {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        //System.out.println(function(a,3).getValue());
        Node node = function_1(a);
        function_2(node);

    }

    //遍历单链表
    public static void function_2(Node node){
        while (node != null){
            System.out.println(node.getValue());
            node = node.next;
        }
    }
    /**
     * 反转单链表
     */

    public static Node function_1(Node node){
        if (node == null){
            return node;
        }
        Node prem = null;
        Node next = null;
        while (node != null){
            next = node.next;

            //node.setNext(prem);
            node.next = prem;

            prem = node;
            node = next;

        }
        return prem;
    }

    /**
     * 从单链表里面找出倒数第K个数
     * @param node
     * @param k
     * @return
     */
    public static Node function(Node node, int k){
        if (node == null || k <= 0){
            return null;
        }
        Node node1 = node;
        Node node2 = node;
        int count = 0;
        int index = k;
        while (node1!=null){
            node1 = node1.next;
            count++;
            if (k <= 1 && node1 != null){
                node2 = node2.next;
            }
            k--;
        }
        if (count < index){
            return null;
        }
        return node2;
    }
}
