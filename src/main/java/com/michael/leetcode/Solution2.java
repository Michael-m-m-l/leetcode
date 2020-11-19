package com.michael.leetcode;
/*
2 两数相加
给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

 示例：
 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
*/

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Stack;

class ListNode2 {
       int val;
       ListNode2 next;

       ListNode2() {
       }

       ListNode2(int val) {
           this.val = val;
       }

       ListNode2(int val, ListNode2 next) {
           this.val = val;
           this.next = next;
       }
   }

public class Solution2 {
    public ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
        String num1 = "";
        String num2 = "";
        while (l1 != null) {
            num1 = l1.val+num1;
            l1 = l1.next;
        }

        while (l2!=null){
            num2 = l2.val+num2;
            l2 = l2.next;
        }

        BigDecimal a = new BigDecimal(num1);
        BigDecimal b = new BigDecimal(num2);

        BigDecimal c = a.add(b);
        BigDecimal val = c.divideAndRemainder(BigDecimal.TEN)[1];
        Stack<Integer> stack = new Stack();
        stack.push(val.intValue());
        while(c.compareTo(BigDecimal.TEN)>=0){
            c = c.divide(BigDecimal.TEN);
            BigDecimal aa = c.divideAndRemainder(BigDecimal.TEN)[1];
            stack.push(aa.intValue());
        }
        ListNode2 header = new ListNode2(stack.pop());
        while (!stack.isEmpty()){
            header = new ListNode2(stack.pop(), header);
        }

        return header;
    }

    @Test
    public void test(){
        ListNode2 head = new ListNode2(2);
        ListNode2 node1 = new ListNode2(4, head);
        ListNode2 node2 = new ListNode2(9, node1);

        ListNode2 node3 = new ListNode2(5);
        ListNode2 node4 = new ListNode2(6, node3);
        ListNode2 node5 = new ListNode2(4, node4);
        ListNode2 node6 = new ListNode2(9, node5);
        addTwoNumbers(node2,node6);

    }
}

class Solution2_1 {
    public ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
        String num1 = "";
        String num2 = "";
        while (l1 != null) {
            num1 = l1.val+num1;
            l1 = l1.next;
        }

        while (l2!=null){
            num2 = l2.val+num2;
            l2 = l2.next;
        }

        BigDecimal a = new BigDecimal(num1);
        BigDecimal b = new BigDecimal(num2);
        BigDecimal c = a.add(b);
        BigDecimal val = c.divideAndRemainder(BigDecimal.TEN)[1];
        ListNode2 start = new ListNode2();
        start.val = val.intValue();
        while(c.compareTo(BigDecimal.TEN)>=0){
            c = c.divide(BigDecimal.TEN);
            BigDecimal aa = c.divideAndRemainder(BigDecimal.TEN)[1];
            ListNode2 next = new ListNode2(aa.intValue(),start);
            start = next;
        }
        return start;
    }
}
