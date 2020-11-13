package com.michael.leetcode;

/*
面试题 02.03. 删除中间节点
实现一种算法，删除单向链表中间的某个节点（即不是第一个或最后一个节点），假定你只能访问该节点。

 示例：
 输入：单向链表a->b->c->d->e->f中的节点c
结果：不返回任何数据，但该链表变为a->b->d->e->f

*/

import org.junit.jupiter.api.Test;

public class Solution02_03 {
    public void deleteNode(ListNode node) {

    }

    public ListNode add(int x,ListNode start) {
        ListNode node = new ListNode(x);
        start.next = node;
        return node;
    }


    public ListNode test(){
        ListNode start = new ListNode(3);
        ListNode node1 = add(4,start);
        ListNode node2 = add(5,node1);
        ListNode node3 = add(6,node2);
        ListNode node4= add(7,node3);
        return start;
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
