package com.sounak;

public class BillPughSingleton {

    // Step 1: Private constructor
    // Prevents anyone from doing "new Singleton()" from outside this class.
    // Without this, the pattern breaks — anyone could create multiple instances.
    private BillPughSingleton() {}

    // Step 2: The Holder class
    // This is a private static INNER class — completely separate from Singleton.
    // The JVM does NOT load this class when Singleton is loaded.
    // It only loads Holder when it is first actively used (i.e., getInstance() is called).
    private static class Holder {

        // Step 3: The actual instance
        // Created exactly once — when Holder is first loaded by the JVM.
        // "final" ensures the reference never changes after assignment.
        // The JVM's class initialization lock (<clinit>) guarantees this runs
        // in a thread-safe way — no synchronized keyword needed from us.
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // Step 4: Public access point
    // This is the only way to get the Singleton instance.
    // First call → triggers Holder class loading → INSTANCE is created.
    // All subsequent calls → Holder already loaded → INSTANCE returned directly.
    // No locking, no null checks, zero overhead after first call.
    public static BillPughSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
