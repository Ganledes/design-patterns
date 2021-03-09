package org.example.singleton;

/**
 * 使用静态内部类实现单例模式，类加载时是线程安全的，保证只有一个对象被创建
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }

    private static class StaticInnerClassSingletonInstance {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return StaticInnerClassSingletonInstance.INSTANCE;
    }

    public void method() {
    }

}
