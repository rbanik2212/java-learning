package learning;

public class MultiThreading2Learning implements Runnable {

    private int threadNum;

    public MultiThreading2Learning(int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " thread num: " + threadNum);
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}
