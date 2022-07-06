package collection.list;

public class ImplimentationLinklist {
    Node head;

//   public void addNode(int data){
//        Node node = new Node(data);
//        if(head==null){
//            head = node;
//            return;
//        }
//
//        Node temp = head;
//        while (temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=node;
//
//    }

    // Insert node at the beginning

    public void insertAtBeginning(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;

    }

    //Insert node at middle if linked list is sorted:

    public void middleNode(int data) {
        Node temp = head;

        Node new_node = new Node(data);

        while ((temp.next.getData()) > (new_node.getData())) {
            temp = temp.next;

        }
        new_node.next = temp.next;
        temp.next = new_node;


    }

    public void showLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }




        }
    public static void main(String[] args){
        ImplimentationLinklist l = new ImplimentationLinklist();
        l.insertAtBeginning(10);
        ;
        l.insertAtBeginning(20);
        l.insertAtBeginning(30);
        l.middleNode(25);
        l.showLinkedList();


    }


    class Node {
        private int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }
}
