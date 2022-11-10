package org.example.javaAdvanced.regular_expressions_and_Data_API.task4;

public class DaemonThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());


    }
}
