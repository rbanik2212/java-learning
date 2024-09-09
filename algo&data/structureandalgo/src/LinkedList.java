//class Node {
//    int value;
//    Node next;
//
//    Node(int value) {
//        this.value = value;
//    }
//
//    @Override
//    public String toString() {
//        return "Node{" +
//                "value=" + value +
//                ", next=" + next +
//                '}';
//    }
//}

public class LinkedList {
    int length;
    Node head;
    Node tail;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }


    public void append(int value) {
        Node temp = new Node(value);

        if (length == 0) {
            this.head = temp;
            this.tail = temp;
        } else {
            this.tail.next = temp;
            this.tail = temp;
        }
        length++;

    }

    public Node removeLast() {
        Node pre = this.head;
        Node temp = this.head;

        if (this.length == 0) {
            return null;
        }
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;

        }

        this.tail = pre;
        this.tail.next = null;
        this.length--;

        if (length == 0) {
            this.head = null;
            this.tail = null;
        }


        return temp;
    }


    public void prepend(int value) {
        Node temp = new Node(value);

        if (this.length == 0) {
            this.head = temp;
            this.tail = temp;
        } else {
            temp.next = this.head;
            this.head = temp;

        }
        length++;
    }

    public Node removeFirst() {
        if (this.length == 0) {
            return null;
        }
        Node tmp = this.head;
        this.head = this.head.next;
        tmp.next = null;

        this.length--;

        if (this.length == 0) {
            this.tail = null;
        }

        return tmp;

    }


    public Node get(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }
        ;
        Node tmp = this.head;
        int i = 0;
        while (i <= index) {
            tmp = tmp.next;
            i++;
        }

        return tmp;

    }


    public boolean set(int index, int value) {

        Node tmp = get(index);

        if (tmp != null) {
            tmp.value = value;
            return true;

        }
        return false;
    }


    public void insert(int index, int value) {
        Node newNode = new Node(value);
        if (index < 0 || index > this.length) {
            System.out.println("incorret index");
        } else if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        }
        Node tmp = this.head;
        Node pre = this.head;

        for (int i = 0; i <= index; i++) {
            pre = tmp;
            tmp = tmp.next;
        }

        pre.next = newNode;
        newNode.next = tmp;
        this.length++;
        System.out.println(pre);


    }


    public Node remove(int index) {
        if (index < 0 || index > this.length) {
            System.out.println("incorret index");
            return null;
        }
        if (index == 0) {
            removeFirst();
        }
        if (index == this.length - 1) {
            removeLast();
        }
        Node nodeRemove = get(index);
        Node tmp = get(index - 1);

        tmp.next = nodeRemove.next;
        nodeRemove.next = null;
        length--;
        return tmp;
    }


    public void reverse() {
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;

        Node before = null;
        Node after = temp.next;

        for (int i = 0; i < this.length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

    }

    /*
     * You are required to
     * use Floyd's cycle-finding algorithm (also known as the "tortoise and the hare" algorithm)
     *  to detect the loop.
     * */
    public Node findMiddleNode() {
        Node slow = this.head;
        Node fast = this.head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }


    public Node hasLoop() {
        Node slow = this.head;
        Node fast = this.head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow.equals(fast)) {
                System.out.println("Found Node");
                return slow;
            }
        }
        return null;

    }

    public Node findKthFromEnd(int k) {
        Node slow = this.head;
        Node fast = this.head;

        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }


    public void partitionList(int x) {
        // Step 1: Check for an empty list.
        // If the list is empty, there is nothing
        // to partition, so we exit the method.
        if (head == null) return;

        // Step 2: Create two dummy nodes.
        // These dummy nodes act as placeholders
        // to simplify list manipulation.
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);

        // Step 3: Initialize pointers for new lists.
        // 'prev1' and 'prev2' will track the end nodes of
        // the two lists that are being created.
        Node prev1 = dummy1;
        Node prev2 = dummy2;

        // Step 4: Start with the head of the original list.
        Node current = head;

        // Step 5: Iterate through the original list.
        while (current != null) {
            System.out.println("Start");
            System.out.println("dummy1 " + dummy1);
            System.out.println("prev1 " + prev1);
            System.out.println("dummy2 " + dummy2);
            System.out.println("prev2 " + prev2 + "\n");
            // Step 6: Compare current node value with 'x'.
            // Nodes are partitioned based on their value
            // being less than or greater than/equal to 'x'.

            // Step 6.1: If value is less than 'x',
            // add node to the first list.
            if (current.value < x) {
                prev1.next = current;  // Link node to the end of the first list.
                prev1 = current;       // Update the end pointer of the first list.
            } else {
                // Step 6.2: If value is greater or equal,
                // add node to the second list.
                prev2.next = current;  // Link node to the end of the second list.
                prev2 = current;       // Update the end pointer of the second list.
            }

            // Move to the next node in the original list.
            current = current.next;
            System.out.println("End");
            System.out.println("dummy1 " + dummy1);
            System.out.println("prev1 " + prev1);
            System.out.println("dummy2 " + dummy2);
            System.out.println("prev2 " + prev2 + "\n");
            System.out.println( "---------------------------" );
        }

        // Step 7: Terminate the second list.
        // This prevents cycles in the list.
        prev2.next = null;

        System.out.println("dummy1 " + dummy1);
        System.out.println("prev1 " + prev1);
        System.out.println("dummy2 " + dummy2);
        System.out.println("prev2 " + prev2 + "\n");
        System.out.println( "---------------------------" );

        // Step 8: Connect the two lists.
        // The first list is followed by the second list.
        prev1.next = dummy2.next;

        System.out.println("dummy1 " + dummy1);
        System.out.println("prev1 " + prev1);
        System.out.println("dummy2 " + dummy2);
        System.out.println("prev2 " + prev2 + "\n");
        System.out.println( "---------------------------" );

        // Step 9: Update the head of the original list.
        // The head now points to the start of the first list.
        this.head = dummy1.next;

        System.out.println("dummy1 " + dummy1);
        System.out.println("prev1 " + prev1);
        System.out.println("dummy2 " + dummy2);
        System.out.println("prev2 " + prev2 + "\n");
        System.out.println("HEAD " + head);
        System.out.println( "---------------------------" );
    }


    @Override
    public String toString() {
        return "LinkedList{" +
                "length=" + length +
                ", head=" + head +
                ", tail=" + tail +
                '}';
    }
}
