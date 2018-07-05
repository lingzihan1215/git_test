package com.zz;

public class JstackTest {
    public static void main(String[] args) {
        TestThread myThread = new TestThread();
        myThread.start();
    }

    static class TestThread extends Thread {

        @Override
        public void run() {
            while (true) {
                System.out.println(Thread.currentThread().getName() + "--- write some...");
            }
        }
    }
}
