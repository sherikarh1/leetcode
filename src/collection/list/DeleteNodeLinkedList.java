/**
 * Write a function to delete a node in a singly-linked list.
 * You will not be given access to the head of the list,
 * instead you will be given access to the node to be deleted directly.
 *
 * Solution :
 * 1: in this problem, we have only value of node but the head, so we dont know
 * about the privious element, we have address of only nexr element.
 * 2: so simply we just copy next element in the node given(current node), ssp
    in this way we copy all next node in their privious amd delete last node
 *
 *
 */

package collection.list;

public class DeleteNodeLinkedList {
    Node head ;


    public void deleteNode(Node node){
        Node temp = node;
        if(temp==null){
            return;
        }else {
            temp.setData(temp.next.getData());
            temp.next = temp.next.next;
        }


    }
    public Node addNode(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return node;
        }
        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        return node;

    }
    public void showLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DeleteNodeLinkedList d =new DeleteNodeLinkedList();
        Node d1 = d.addNode(10);
        Node d2 = d.addNode(20);
        Node d3 = d.addNode(30);
        Node d4 = d.addNode(40);
        d.showLinkedList();

        d.deleteNode(d2);

        d.showLinkedList();



    }
}

