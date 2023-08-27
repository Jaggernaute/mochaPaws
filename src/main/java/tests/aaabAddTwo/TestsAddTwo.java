
package tests.aaabAddTwo;

import com.jaggernaute.mochaPaws.aaabAddTwo.AddTwo;
import org.junit.Test;

public class TestsAddTwo {
    @Test
    public void testAddTwoNumbers() {
        AddTwo.ListNode l1 = new AddTwo.ListNode(2, new AddTwo.ListNode(4, new AddTwo.ListNode(3)));
        AddTwo.ListNode l2 = new AddTwo.ListNode(5, new AddTwo.ListNode(6, new AddTwo.ListNode(4)));

        AddTwo.ListNode expected = new AddTwo.ListNode(7, new AddTwo.ListNode(0, new AddTwo.ListNode(8)));
        AddTwo.ListNode actual = new AddTwo().addTwoNumbers(l1, l2);

        while (expected != null) {
            assert expected.val == actual.val;
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    public void testAddTwoNumbers2() {
        AddTwo.ListNode l1 = new AddTwo.ListNode(0);
        AddTwo.ListNode l2 = new AddTwo.ListNode(0);

        AddTwo.ListNode expected = new AddTwo.ListNode(0);
        AddTwo.ListNode actual = new AddTwo().addTwoNumbers(l1, l2);

        while (expected != null) {
            assert expected.val == actual.val;
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    public void testAddTwoNumbers3() {
        AddTwo.ListNode l1 = new AddTwo.ListNode(9, new AddTwo.ListNode(9, new AddTwo.ListNode(9, new AddTwo.ListNode(9, new AddTwo.ListNode(9, new AddTwo.ListNode(9, new AddTwo.ListNode(9)))))));
        AddTwo.ListNode l2 = new AddTwo.ListNode(9, new AddTwo.ListNode(9, new AddTwo.ListNode(9, new AddTwo.ListNode(9))));

        AddTwo.ListNode expected = new AddTwo.ListNode(8, new AddTwo.ListNode(9, new AddTwo.ListNode(9, new AddTwo.ListNode(9, new AddTwo.ListNode(0, new AddTwo.ListNode(0, new AddTwo.ListNode(0, new AddTwo.ListNode(1))))))));
        AddTwo.ListNode actual = new AddTwo().addTwoNumbers(l1, l2);

        while (expected != null) {
            assert expected.val == actual.val;
            expected = expected.next;
            actual = actual.next;
        }
    }
}
