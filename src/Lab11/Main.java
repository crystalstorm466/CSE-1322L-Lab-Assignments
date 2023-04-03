package Lab11;

import java.util.Random;

class Baby implements Runnable {
    private int time;
    private String name;

    public Baby(String name) {
        this.name = name;
        Random rand = new Random();
        this.time = rand.nextInt(5000);
    }

    public void run() {
        System.out.println("My name is " + this.name + " I am going to sleep for " + time +"ms");
        try {
            Thread.sleep(this.time);
        } catch (InterruptedException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
        System.out.println("My name is " + this.name + ", I am awake, feed me!!!");
    }
}

class Main {
    public static void main( String args[])  {
        Thread t1 = new Thread(new Baby("Noah")); 
        Thread t2 = new Thread(new Baby("Olivia"));
        Thread t3 = new Thread(new Baby("Emma"));
        Thread t4 = new Thread(new Baby("Amelia"));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}