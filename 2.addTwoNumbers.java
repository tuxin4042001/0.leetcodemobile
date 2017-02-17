//Answer
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return sentinel.next;
    }
}

//My solution
public ListNode addTwoNumbers(ListNode l1, ListNode l2){
	int valL1 = 0;
	int valL2 = 0;
	int carry = 0;
	int sum = 0;
	ListNode sum1 = new ListNode(0);
	ListNode currNodeSum = sum1;
	if(l1 = null) return l2;
	if(l2 = null) return l1;
	while(l1 != null || l2 != null){
		if(l1 != null){
			valL1 = l1.val;
			l1 = l1.next;
        }else{
        	valL1 = 0;
        }
        
        if(l2 != null){
        	valL2 = l2.val;
            l2 = l2.next;
        }else{
        	valL2 = 0;
        }
        
        sum = valL1 + valL2 + carry;
        carry = sum/10;
        sum = sum%10;
        
        currNodeSum.val = sum;
        currNodeSum = currNodeSum.next;
     }
     return sum1;
}
