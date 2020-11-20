package com.michael.leetcode;

/*
面试题 02.03. 删除中间节点
实现一种算法，删除单向链表中间的某个节点（即不是第一个或最后一个节点），假定你只能访问该节点。

 示例：
 输入：单向链表a->b->c->d->e->f中的节点c
结果：不返回任何数据，但该链表变为a->b->d->e->f

*/

import org.junit.jupiter.api.Test;
/*思路
传统 思路 需要知道 前置节点  来删除当前节点
新思路 把我变成你  然后杀了你   经典 经典
 */
public class Solution02_03 {
    public void deleteNode(ListNode node) {
       node.val = node.next.val;
       node.next = node.next.next;
    }

    @Test
    public void test(){
        ListNode start = new ListNode(99);
        start.val = -1;
        for (int i = 0; i < 10; i++) {
            ListNode next = new ListNode(i);
            next.next = start;
            start = next;
        }

        ListNode current = start;
        ListNode previous = start;
        ListNode node = new ListNode(3);

        while (current.val!=node.val){
            previous = current;
            current = current.next;
        }

        previous.next = current.next;

        return;

    }


}

 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
