package backtracking;

public class remove4 {
    Node remove(Node head, int n) {
        if(head == null) {
            return null;
        }
        if(n<0) {
            return head;
        }
        Node n1 = head, n2 = head;
        Node dummy = new Node(0);
        dummy.next = n2;

        while(n>0) {
            n1 = n1.next;
            if(n1 == null) {
                return head;
            }
            n--;
        }
        while(n1!=null) {
            n1 = n1.next;
            n2 = n2.next;
        }
        n2.next = n1;
        return dummy.next;
    }
}
