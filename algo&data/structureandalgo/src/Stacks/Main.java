package Stacks;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(4);

        stack.push(5);
        stack.push(6);
        stack.push(7);

//        stack.getHeight();
//        stack.getTop();
//        stack.printStack();
        stack.pop();
        stack.printStack();



    }
}
