
// Refrence : https://www.youtube.com/watch?v=jY-EUKXYT20

package collection.list;

public class ReversedListDemo {
    private Node head;

    public void reversed(){
        Node next = null;
        Node previous = null;
        Node current = head;


        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
        if (previous != null)
            head = previous;


    }

    public void addNode(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;

    }

    public void showLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ReversedListDemo r = new ReversedListDemo();

        r.addNode(10);
        r.addNode(20);
        r.addNode(30);
        r.addNode(40);
        r.showLinkedList();
        r.reversed();
        r.showLinkedList();

    }
}

