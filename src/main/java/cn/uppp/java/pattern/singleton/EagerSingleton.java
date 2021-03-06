package cn.uppp.java.pattern.singleton;

/**
 * 饿汉式单例
 * 不会出现性能问题，但是应用启动会立即消耗内存资源
 */
public class EagerSingleton {
    private static EagerSingleton eagerSingleton = new EagerSingleton();
    private Integer id;
    private String name;

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return eagerSingleton;
    }
}
