package demo.sword_offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 *
 * @author Administrator
 */
public class _从未到头打印链表 {

    public static void main(String[] args) {
        Stack<Integer> sk = new Stack<>();
        LinkedList<Integer> lis2 = new LinkedList<>();
        sk.push(1);
        sk.push(2);
        sk.push(3);
        sk.push(4);
        System.out.println(sk);
        sk.pop();
        System.out.println(sk);

        while (!sk.isEmpty()) {
            lis2.add(sk.pop());
        }
        System.out.println("s:" + lis2);

    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> sk = new Stack<>();
        while (listNode.next != null) {
            sk.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        while (!sk.isEmpty()) {
            list2.add(sk.pop());
        }
        return list2;
    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
