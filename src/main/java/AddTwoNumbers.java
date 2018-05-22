import java.util.*;

/**
 * Created by Mehari on 5/21/18.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers_(ListNode l1, ListNode l2) {

        int carry=0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(l1!=null || l2!=null) {
            int sum=0;
            if(l1==null){
                sum = carry + 0 + l2.val;
            }
            else if(l2==null){
                sum = carry + l1.val + 0;
            }
            else{
                sum=carry + l1.val + l2.val;
            }
            if (sum > 9) {
                sum = sum - 10;
                carry = 1;
            }else{
                carry=0;
            }
            result.add(sum);

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if(carry!=0){
            result.add(carry);
        }
        List<ListNode> lists= new ArrayList<ListNode>();

        for (Integer integer : result) {
            ListNode listNode = new ListNode(integer);
            lists.add(listNode);
        }


        for (int i = 0; i < lists.size()-1; i++) {
            lists.get(i).next=lists.get(i+1);
        }
        return lists.get(0);

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum=new ListNode(0);
        add(l1,l2,sum);
        return sum;
    }



    private void add(ListNode l1, ListNode l2, ListNode r){
        if(l1==null && l2==null){
            return;
        }
        int temp = (l1==null?0: l1.val) + (l2==null?0:l2.val);
        if(r==null){r= new ListNode(temp);
        }else{
            r.val+=temp;
        }

        if(r.val>9){
            r.val-=10;
            r.next= new ListNode(1);
        }else if((l1!=null && l1.next!=null) || (l2!=null && l2.next!=null)){
            r.next=new ListNode(0);
        }
        add(l1==null?l1:l1.next, l2==null?l2:l2.next,r.next);
    }




}
