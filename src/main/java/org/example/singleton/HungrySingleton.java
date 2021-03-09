package org.example.singleton;

/**
 * 饿汉式单例模式，类加载时即实例化对象，不使用对象时可能造成内存浪费，酌情使用
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }

    public void method() {
    }

}
