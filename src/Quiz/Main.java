package Quiz;

class MyFirstThread implements Runnable {
    static int next_tid=1;
    int tid;

    public MyFirstThread() {
        tid=next_tid++;
    }

    public void run() {
        System.out.println("I'm thread "+tid);
    }
}

class Main {
    public static void main(String[] args) {
        MyFirstThread t1 = new MyFirstThread();
        MyFirstThread t2 = new MyFirstThread();
        MyFirstThread t3 = new MyFirstThread();

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);

        System.out.println("Let's go!");
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("Done");
    }
}
