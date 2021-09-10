package Threads;

public class ThreadInstantiate {

    public static void main(String[] args) {

	Thread demo = new ThreadDemo();
	demo.start();
    }

}

class ThreadDemo extends Thread {

    public ThreadDemo() {

    }

    public void run() {
	for (int i = 0; i < 10; i++) {
	    System.out.println("Thread Name : " + Thread.currentThread().getName() + " - " + i);
	}

	try {
	    Thread.sleep(300);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

}
