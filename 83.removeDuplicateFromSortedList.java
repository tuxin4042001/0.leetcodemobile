public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
}

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;
         
         while(list != null) {
        	 if (list.next == null) {
        		 break;
        	 }
        	 if (list.val == list.next.val) {
        		 list.next = list.next.next;
        	 } else {
        		 list = list.next;
        	 }
         }         
         return head;
    }
}

public ListNode deleteDuplicates(ListNode head){
	ListNode start = new ListNode(0);
	start.next = head;
	if(head == null || head.next == null){
		return head;
    }
	while(head.next != null){
		if(head.val == head.next.val){
			head.next = head.next.next;
        }else{
        	head = head.next;
        }
}
     return start.next;
}

