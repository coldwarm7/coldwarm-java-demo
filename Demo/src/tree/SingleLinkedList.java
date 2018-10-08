package tree;

import javax.net.ssl.CertPathTrustManagerParameters;
import java.util.Collections;

/**
 * Create by coldwarm on 2018/9/19.
 * java实现单链表
 */

public class SingleLinkedList {
    private Node head;
    private Node current;
    private int size;

    public SingleLinkedList(){
        head = current =new Node(null);  //初始时令head和current都是头指针，即下一结点为头结点，即数据域为空。换句话来讲，单链表的头指针只是个指针，不含数据
        size=0;
    }

    public  void add(Object object){
        Node newNode = new Node(object);
        current = head.next;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.next = null;
        size++;
    }

    public void insert(int i,Object object){
        Node newNode = new Node(object);
        Node prve = head;
        current = head.next;
        int j = 0;
        while (current != null && j < i){
            prve = current;
            current = current.next;
            j++;
        }
        newNode.next = current;
        prve.next = newNode;
        size++;
    }

    public void delete(int i){
        Node prev = head;
        current = head.next;
        int j = 0;
        while (current != null&&j<i){
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
        size--;
    }

    //反转单链表
    public Node fanzhuan(Node node){
        if (node == null)
            return node;
        Node pre = node; //上一节点
        Node cur = node.next;  //当前节点
        Node temp; //临时节点，用于保存当前节点的下一节点
        while (cur != null){
            temp = cur.next;
            cur.setNext(pre);//改变当前节点的指针

            //指针向下移动
            pre = cur;
            cur = temp;
        }
        head.setNext(null);
        return pre;
    }
}
