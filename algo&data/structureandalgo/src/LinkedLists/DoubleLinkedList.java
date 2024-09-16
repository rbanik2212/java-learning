package LinkedLists;

class Node {
    int value;
    Node next;
    Node prev;

    Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {

        String nextItem = this.next == null ? "null" : Integer.toString(this.next.value);
        String prevItem = this.prev == null ? "null" : Integer.toString(this.prev.value);

        String response = "LinkedLists.Node{" + "value=" + value + ", next=" + nextItem + ", prev=" + prevItem + '}';

        return response;
    }
}

public class DoubleLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public DoubleLinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        length = 1;
    }


    public void printList() {
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void append(int val) {
        Node newNode = new Node(val);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {

            /* next node after tail will be new node*/
            Node tmp = this.tail;
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;

            this.length++;

        }


    }

    public Node removeLast() {
        if (length == 0) {
            this.head = null;
            this.tail = null;
        } else {
            Node tmp = this.tail;
            this.tail = tmp.prev;
            this.tail.next = null;
            tmp.prev = null;
        }

        length--;
        return this.tail;
    }


    public void prepend(int val) {
        Node newNode = new Node(val);
        if (length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node tmp = this.head;
            newNode.next = tmp;
            tmp.prev = newNode;
            this.head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        } else if (length == 1) {
            this.head = null;
            this.tail = null;

        } else {
            Node tmp = this.head;
            this.head = this.head.next;
            tmp.next = null;
            this.head.prev = null;
        }
        return this.head;
    }


    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = this.head;
        if (index < length / 2) {

            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = this.tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }

        }
        return temp;
    }

    public boolean set(int index, int value) {
        boolean changed = false;

        if (index < 0 || index >= length) {
            return changed;
        } else {
            Node node = get(index);
            if (node != null) {

                node.value = value;
                changed = true;
            } else {
                return changed;
            }
        }
        return changed;

    }

    public boolean insert(int index, int value) {
        boolean changed = false;

        if (index < 0 || index >= length) {
            return changed;
        } else if (index == 0) {
            prepend(0);
            changed = true;
            return changed;
        } else {
            Node node = new Node(value);
            Node before = get(index - 1);
            Node after = before.next;

            before.next = node;
            node.prev = before;
            node.next = after;
            after.prev = node;
            return true;

        }

    }

    public Node remove(int index) {
        Node tmp = get(index);

        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        } else {
            Node curr = get(index);
            Node before = curr.prev;
            Node after = curr.next;


            before.next = after;
            after.prev = before;
            curr.next = null;
            curr.prev = null;
            return curr;
        }
    }

    @Override
    public String toString() {
        return "LinkedLists.DoubleLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }


    public static void main(String[] args) {

        DoubleLinkedList dll = new DoubleLinkedList(7);
        dll.append(8);
        System.out.println(dll);
        dll.append(9);
        dll.append(10);
        dll.append(11);
//        dll.prepend(13);
//        dll.removeLast();
        System.out.println(dll);

        dll.printList();
        dll.remove(1);
        dll.printList();
    }
}