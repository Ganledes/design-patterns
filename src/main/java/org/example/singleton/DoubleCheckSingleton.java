package org.example.singleton;

/**
 * 使用双重检查实现单例模式，保证效率的同时保证了线程安全
 */
public class DoubleCheckSingleton {

    /**
     * <code>volatile</code>关键字防止指令重排序，并保证线程可见性
     */
    private static volatile DoubleCheckSingleton INSTANCE;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }

    public void method() {
    }

}
