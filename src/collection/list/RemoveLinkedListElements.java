/**
 * Given the head of a linked list and an integer val, remove all the nodes of the
 * linked list that has Node.val == val, and return the new head.
 */

package collection.list;

public class RemoveLinkedListElements {

    Node head;

    public void removeValElement(Node head, int val) {
        Node current = head;
        Node pri = null;


        while (current != null) {


            if (current.getData() == val) {
                Node temp = current;
                //Node next = current.next;
                if (pri == null) {
                    head = current.next;
                    current = current.next;

                } else {
                    pri.next = current.next;
                    //current.next = null;
                    current = current.next;

                }
                temp.next = null;

            } else {
                pri = current;
                current = current.next;
            }

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
        RemoveLinkedListElements r = new RemoveLinkedListElements();
        r.addNode(10);
        r.addNode(20);
        r.addNode(30);
        r.addNode(40);

        r.showLinkedList();
        r.removeValElement(r.head, 20);
        r.showLinkedList();


    }


}


