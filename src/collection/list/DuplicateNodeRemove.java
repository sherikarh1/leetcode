/**
 Given the head of a sorted linked list, delete all duplicates such that
 each element appears only once.Return the linked list sorted as well.

 */

package collection.list;

public class DuplicateNodeRemove {
    Node head;

    public void removeDuploicate() {
        Node current = head;


        while (current != null) {

            while (current.next != null && current.getData() == current.next.getData()) {
                Node next = current.next;

                current.next = current.next.next;
                next.next = null;

            }
            current = current.next;

        }

    }

    public void addNode(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;


    }

    public void showLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DuplicateNodeRemove d = new DuplicateNodeRemove();
        d.addNode(10);
        d.addNode(20);
        d.addNode(20);
        d.addNode(30);
        d.addNode(40);
        d.addNode(40);

        d.showLinkedList();
        d.removeDuploicate();
        d.showLinkedList();
    }
}
