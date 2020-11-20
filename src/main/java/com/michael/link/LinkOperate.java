
package com.michael.link;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

class LinkNode {
    int val;
    LinkNode next;

    LinkNode(int val) {
        this.val = val;
    }
}

// 链表操作
@Slf4j
public class LinkOperate {

    /**
     * 链表头部添加节点
     *
     * @param start
     * @return
     */
    LinkNode addHeader(LinkNode start) {
        for (int i = 0; i < 10; i++) {
            LinkNode next = new LinkNode(i);
            next.next = start;
            start = next;
        }
        return start;
    }

    /**
     * 链表尾部添加节点
     * 使用递归 但是会丢失头节点 需要返回后重新修改start 节点的引用
     *
     * @param link
     * @return
     */
    LinkNode addFooter(LinkNode link) {
        if (link.next != null) {
            link = link.next;
            addFooter(link);
        } else {
            link.next = new LinkNode(99);
        }
        return link;
    }

    /**
     * 删除链表的中间节点
     * 思路  我把我变成你 然后干掉你
     *
     * @param current
     * @return
     */
    void deleteNodeNotEndAndFirst(LinkNode current) {
        current.val = current.next.val;
        current.next = current.next.next;
    }

    /**
     * 删除链表中的任意node
     * @param start
     * @param delete
     */
    void deleteNode(LinkNode start, LinkNode delete) {
        LinkNode current = start;
        LinkNode provious = start;
        while (current.val != delete.val) {
            current = current.next;
            provious = current;
        }

        if (current.val == start.val) {
            start.val = start.next.val;
            start.next = start.next.next;
        } else {
            provious.next = current.next;
        }
    }

    @Test
    public void test() {
        LinkNode start = new LinkNode(-99);
        start = addHeader(start);
        LinkNode linkNode = addFooter(start);
        start.next = linkNode;
        log.info("" + start.val);
    }
}
