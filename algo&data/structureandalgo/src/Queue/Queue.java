package Queue;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}

public class Queue {
    private Node first;
    private Node last;
    private int length;

    public Queue(int value) {
        Node newNode = new Node(value);
        this.first = newNode;
        this.last = newNode;
        length = 1;
    }

    public void printQueue() {
        Node tmp = first;

        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = last.next;
        }
        length++;
    }

    public Node dequeue(){
        Node tmp = null;
        if(length == 0){
            return null;
        }
        else if( length == 1) {
            first = null;
            last = null;
        }
        else {
            tmp = first;
            first = first.next;
            tmp.next = null;
        }
        length--;
        return tmp;
    }


}
