package com.michael.leetcode;


import org.junit.jupiter.api.Test;

class LinkNode {
    int val;
    LinkNode next;

    LinkNode() {

    }

    LinkNode(int val) {
        this.val = val;
    }

    LinkNode(int val, LinkNode next) {
        this.val = val;
        this.next = next;
    }
}

// 链表操作
public class LinkOperate {

    // 链表头部添加节点
    LinkNode addHeader(LinkNode start) {
        for (int i = 0; i < 10; i++) {
            LinkNode next = new LinkNode(i);
            next.next = start;
            start = next;
        }
        return start;
    }

    // 链表尾部添加节点 使用递归 但是会丢失头节点
    LinkNode addFooter(LinkNode link) {
        if (link.next != null) {
            link = link.next;
            addFooter(link);
        } else {
            link.next = new LinkNode(99);
        }
        return link;
    }

    // 链表第n个节点处新增节点
    LinkNode addMiddle(LinkNode link, int value, int index) {

        return link;
    }

    @Test
    public void test() {
        LinkNode start = new LinkNode(-99);
        start = addHeader(start);
        LinkNode linkNode = addFooter(start);
        start.next = linkNode;
        System.out.println("");
    }
}
