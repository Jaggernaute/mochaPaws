package com.jaggernaute.mochaPaws.aaabAddTwo;

public class AddTwo {
    public static class ListNode {
        public int val;
        public ListNode next;
        ListNode() {}
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode result = new ListNode();
            ListNode resultHead = result;
            int carry = 0;

            while (l1 != null || l2 != null) {
                int sum = carry;

                if (l1 != null) {
                    sum += l1.val;
                }

                if (l2 != null) {
                    sum += l2.val;
                }

                carry = sum / 10;
                result.next = new ListNode(sum % 10);
                result = result.next;

                if (l1 != null) {
                    l1 = l1.next;
                }

                if (l2 != null) {
                    l2 = l2.next;
                }

            }

            if (carry > 0) {
                result.next = new ListNode(carry);
            }

            return resultHead.next;
    }
}