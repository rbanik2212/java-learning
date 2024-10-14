package learning;

public class Main {
    public static void main(String[] args) {
//for "extending Thread"
//        for (int i = 0; i < 4; i++) {
//            MultiThreadLearning thing1 = new MultiThreadLearning(i);
//
//            thing1.start();
//        }
        /* for "implementing runnable" */
        for (int i = 0; i < 4; i++) {
            MultiThreading2Learning thing1 = new MultiThreading2Learning(i);
            Thread myThread = new Thread(thing1);

            myThread.start();
            try {
                myThread.join();
            } catch (InterruptedException e) {
            }
        }
//        MultiThreadLearning thing2 = new MultiThreadLearning(2);
//
//        thing2.start();
    }
}
