//each time only do the swap between the first two nodes, it won't affect 
//the nodes after the first two nodes
public ListNode swapPairs(ListNode head){
	ListNode start = new ListNode(0);
	ListNode currentNode = start;
	start.next = head;
	
	while(current.next != null && current.next.next !=null){
		ListNode first = current.next;
		ListNode second = current.next.next;
		first.next = second.next;
		current.next = second;
		current.next.next = first;
		current = current.next.next;
     }
     
     return start.next;
}