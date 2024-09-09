public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(8);
        ll.append(7);
        ll.append(9);
        ll.append(4);
        ll.append(5);
        ll.append(3);
        ll.append(12);

//        ll.insert(2,
//                14);


//        System.out.println(ll.findKthFromEnd(2));

        ll.partitionList(4);

//        System.out.println(ll);
    }

}