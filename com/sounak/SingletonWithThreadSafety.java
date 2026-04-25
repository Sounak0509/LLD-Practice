package com.sounak;

// Double-Checked Locking
public class SingletonWithThreadSafety {

    private static volatile SingletonWithThreadSafety instance;

    private SingletonWithThreadSafety() {

    }

    public static SingletonWithThreadSafety getInstance() {
        if (instance == null) {
            synchronized (SingletonWithThreadSafety.class) {
                if (instance == null) {
                    instance = new SingletonWithThreadSafety();
                }
            }
        }
        return instance;
    }
}
