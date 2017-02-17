//Answer
public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
}

//My solution
public ListNode removeElement(ListNode head, int val){
	if(head == null) return null;
	ListNode currentNode = head;
	if(head.val == val) return head.next;
	while(currentNode.next != null){
		if(currentNode.next.val == val){
			currentNode.next = currentNode.next.next;
        }
        currentNode = currentNode.next;
     }
     return head;
}