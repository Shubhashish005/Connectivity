package com.shubh.designPattern.singletonDesignPattern.singleton_threadSafe;

public class SingleTonThreadSafe {

    private static SingleTonThreadSafe INSTANCE;

    private SingleTonThreadSafe() {
    }

    public static SingleTonThreadSafe getInstance() {
        if (INSTANCE == null) {
            synchronized (SingleTonThreadSafe.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new SingleTonThreadSafe();
                }
            }
        }
        return INSTANCE;
    }
}
