class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; // Initially previous node is null
        ListNode current = head; // Start from the head of the list
        
        while (current != null) {
            ListNode next = current.next; // Store next node
            current.next = prev; // Reverse the pointer
            prev = current; // Move prev to current
            current = next; // Move to next node
        }
        
        return prev; // Prev becomes the new head
    }
}
