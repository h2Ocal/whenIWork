package com.whenIWork.utilities;

public class BrowserUtil {

    public static void sleep(int second) {
        second *= 1000;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("Something is wrong with Thread.sleep() method");
        }
    }

}
