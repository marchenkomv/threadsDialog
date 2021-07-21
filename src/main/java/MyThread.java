class MyThread extends Thread {

    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                System.out.println("Я поток " + Thread.currentThread().getName() + ". Всем привет!");
                Thread.sleep(2500);
            }
        } catch (InterruptedException err) {
            System.out.println("Ошибка при попытке вызова метода sleep для потока " + Thread.currentThread().getName());
        } finally {
            System.out.printf("Поток %s завершен\n", getName());
        }
    }
}