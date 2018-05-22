import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 5/21/18.
 */
public class AddTwoNumbersTest {



    @Test
    public void testAddTwoNumbers_tree_digits() throws Exception {
        ListNode two = new ListNode(2);
        ListNode four = new ListNode(4);
        ListNode three = new ListNode(3);
        two.next=four;
        four.next=three;

        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        ListNode four_ = new ListNode(4);

        five.next=six;
        six.next=four_;

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(two, five);
        assertEquals(7,result.val);
        assertEquals(0,result.next.val);
        assertEquals(8,result.next.next.val);
        assertEquals(null,result.next.next.next);

    }

    @Test
    public void testAddTwoNumbers_mixed_digits() throws Exception {
        ListNode two = new ListNode(2);
        ListNode four = new ListNode(4);
        two.next=four;

        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        ListNode four_ = new ListNode(4);

        five.next=six;
        six.next=four_;

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(two, five);
        assertEquals(7,result.val);
        assertEquals(0,result.next.val);
        assertEquals(5,result.next.next.val);
        assertEquals(null,result.next.next.next);

    }

    @Test
    public void testAddTwoNumbers_one_digit() throws Exception {
        ListNode four = new ListNode(4);
        ListNode three = new ListNode(3);


        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(four, three);
        assertEquals(7,result.val);
        assertEquals(null,result.next);

    }

    @Test
    public void testAddTwoNumbers_one_digit_carryover() throws Exception {
        ListNode nine = new ListNode(9);
        ListNode eight = new ListNode(8);


        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(nine, eight);
        assertEquals(7,result.val);
        assertEquals(1,result.next.val);
        assertEquals(null,result.next.next);

    }
}