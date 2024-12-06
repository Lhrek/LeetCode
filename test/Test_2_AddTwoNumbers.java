import org.junit.Test;

import static org.junit.Assert.*;

public class Test_2_AddTwoNumbers {

    private void assertLinkedListEquals(ListNode expected, ListNode actual) {
        ListNode p1 = expected;
        ListNode p2 = actual;
        while (p1 != null && p2 != null) {
            assertEquals("节点值不匹配", p1.val, p2.val);
            p1 = p1.next;
            p2 = p2.next;
        }
        // 如果退出循环后，一个链表还没结束而另一个结束了，那就不匹配
        assertNull("预期链表比实际链表更长", p1);
        assertNull("实际链表比预期链表更长", p2);
    }

    @Test
    public void test_link_to_int(){
        ListNode l1 = new ListNode(5, new ListNode(6, new ListNode(4)));
        assertEquals(465,AddTwoNumbers_2.listToInt(l1));
    }

    @Test
    public void test_int_to_link(){
        ListNode l1 = new ListNode(5, new ListNode(6, new ListNode(4)));
       assertLinkedListEquals(l1,AddTwoNumbers_2.intToList(465));
    }

    @Test
    public void test0() {
        ListNode l1 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode l2 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode expect = new ListNode(7, new ListNode(0, new ListNode(8)));
        assertLinkedListEquals(expect, AddTwoNumbers_2.addTwoNumbers(l1, l2));
    }
}
