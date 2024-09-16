package Stacks;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}

public class Stack {
    private Node top;
    private int height;

    public Stack(int value) {
        Node newNode = new Node(value);
        this.top = newNode;
        height = 1;
    }

    public void getHeight() {
        System.out.printf("current height is %d\n", this.height);
    }

    public void getTop() {
        System.out.printf("current top os %d\n", this.top.value);
    }

    public void printStack() {
        Node tmp = this.top;
        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }

    }


    public void push(int value) {
        Node newNode = new Node(value);

        if (this.height == 0) {
            this.top = newNode;
        } else {
            newNode.next = this.top;
            this.top = newNode;

        }
        height++;
    }

    public Node pop() {
        if (this.height == 0) {
            return null;
        } else {
            Node tmp = this.top;
            this.top = this.top.next;
            tmp.next = null;
            height--;
            return tmp;
        }

    }

}
