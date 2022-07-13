package collection.list;

public class Node {
    private int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}