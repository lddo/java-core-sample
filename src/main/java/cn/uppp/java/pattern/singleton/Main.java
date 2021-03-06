package cn.uppp.java.pattern.singleton;

import cn.uppp.java.utils.ThreadUtils;

public class Main {
    public static void main(String[] args) {
        ThreadUtils.concurrentExecutor(() -> {
            // 懒汉式
//            LazySingleton instance = LazySingleton.getInstance();
            // 饿汉式
            EagerSingleton instance = EagerSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " -> " + instance);
        }, 50);
    }
}
