package learning;

public class MultiThreadLearning extends Thread {
    private int threadNum;
    public MultiThreadLearning(int threadNum){
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
