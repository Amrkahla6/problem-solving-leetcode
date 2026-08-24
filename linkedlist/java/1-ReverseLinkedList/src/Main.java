import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void  main(String[] args) {

      ListNode list = new ListNode(1);
      list.next = new ListNode(2);
      list.next.next = new ListNode(3);
      list.next.next.next = new ListNode(4);
      list.next.next.next.next = new ListNode(5);

      list.printList();

      // Solution 1: Recursive
      ListNode reversed = reverseList(list);
      System.out.print("Recursive : ");
      reversed.printList();

      // Re-build list for second solution
      ListNode list2 = new ListNode(1);
      list2.next = new ListNode(2);
      list2.next.next = new ListNode(3);
      list2.next.next.next = new ListNode(4);
      list2.next.next.next.next = new ListNode(5);

      // Solution 2: Iterative
      ListNode reversed2 = reverseListIterative(list2);
      System.out.print("Iterative : ");
      reversed2.printList();
    }


    // Solution 1 - Recursive
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);
        head.next.next = head;

        head.next = null;

        return newHead;
    }

    // Solution 2 - Iterative (three pointers)
    public static ListNode reverseListIterative(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next; // save next
            current.next = prev;         // reverse pointer
            prev = current;              // move prev forward
            current = next;              // move current forward
        }

        return prev; // prev is the new head
    }
}
