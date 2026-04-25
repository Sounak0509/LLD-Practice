package com.sounak;

public class SingletonWithoutThreadSafety {
    private static SingletonWithoutThreadSafety instance;

    private SingletonWithoutThreadSafety() {

    }

    public static SingletonWithoutThreadSafety getInstance() {
        if (instance == null) {
            instance = new SingletonWithoutThreadSafety();
        }

        return instance;
    }
}
