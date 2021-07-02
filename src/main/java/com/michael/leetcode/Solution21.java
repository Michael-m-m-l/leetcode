package com.michael.leetcode;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class Solution21 {
    public ListNode21 mergeTwoLists(ListNode21 l1, ListNode21 l2) {
        while (l2 != null) {
            ListNode21 node = l1;
            ListNode21 per = null;
            while (node != null) {
                if (node.val < l2.val) {
                    if (per == null) {
                        l2.next = node;
                        return per;
                    } else {
                        per.next = l2;
                        l2.next = node;
                    }
                }
                per = node;
                node = node.next;
            }
            l2 = l2.next;
        }

        return l1;
    }

    @Test
    public void test() {
        ListNode21 l1 = new ListNode21(8);
        ListNode21 l11 = new ListNode21(4, l1);
        ListNode21 l111 = new ListNode21(2, l11);
        ListNode21 l2 = new ListNode21(10);
        ListNode21 l22 = new ListNode21(5,l2);
        ListNode21 l222 = new ListNode21(0,l22);


//        ListNode21 node21 = mergeTwoLists(l111, l222);
        ListNode21 node2 = l111;
        ListNode21 per = null;

        while (node2 != null) {
            if (node2.val > l2.val) {
                if (per == null) {
                    l2.next = node2;
                    l111 = l2;

                } else {
                    per.next = l2;
                    l2.next = node2;
                }
            break;
            }
            per = node2;
            node2 = node2.next;

        }

        log.info("sdsdsd",l111);
    }
}

class ListNode21{
    int val;
    ListNode21 next;
    ListNode21() {}
    ListNode21(int val) { this.val = val; }
    ListNode21(int val, ListNode21 next) { this.val = val; this.next = next; }
}
