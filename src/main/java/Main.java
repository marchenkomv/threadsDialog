public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = startThreads(4);
        Thread.sleep(15000);
        group.interrupt();
    }

    private static ThreadGroup startThreads(int threadsCount) {
        ThreadGroup group = new ThreadGroup("MyGroup");
        for (int i = 0; i < threadsCount; i++) {
            Thread thread = new MyThread(group, String.valueOf(i + 1));
            thread.start();
        }
        return group;
    }
}