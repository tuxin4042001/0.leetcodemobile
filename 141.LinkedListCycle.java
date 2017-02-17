//Answer
public boolean hasCycle(ListNode head) {
        if(head==null) return false;
		ListNode walker = head;
		ListNode runner = head;
		while(runner.next!=null && runner.next.next!=null) {
			walker = walker.next;
			runner = runner.next.next;
			if(walker==runner) return true;
		}
		return false;
    }
    
//my solution
public boolean hasCycle(ListNode head){
	if(head == null){
		return false;
    }
    ListNode slow = head;
    ListNode fast = head;
    while(fast.next.next != null){
    	fast = fast.next.next;
        slow = slow.next;
        if(fast == slow){
        	return true;
        }
    }
    return false;
}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head){
	if(head == null){
		return false;
    }
    ListNode slow = head;
    ListNode fast = head;
    while(fast.next.next != null){
    	fast = fast.next.next;
        slow = slow.next;
        if(fast == slow){
        	return true;
        }
    }
    return false;
}
}