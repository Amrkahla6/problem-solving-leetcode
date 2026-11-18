public class ListNode {
    int val;
    ListNode next;

    ListNode(){}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void printList() {
        for(ListNode current = this; current != null; current = current.next) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
        }

        System.out.println(" -> null");
    }
}
