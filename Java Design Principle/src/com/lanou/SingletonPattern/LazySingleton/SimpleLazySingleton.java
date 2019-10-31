package com.lanou.SingletonPattern.LazySingleton;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 10:42 2019/10/31
 * @Modified By:
 *
 * 线程安全式懒汉单例
 *
 * 是否 Lazy 初始化：是
 *
 * 是否多线程安全：是
 *
 * 实现难度：易
 *
 * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，
 * 效率很低，99% 情况下不需要同步。
 *
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）
 *
 */
public class SimpleLazySingleton {
    private static SimpleLazySingleton instance;
    private SimpleLazySingleton(){};

    //此锁只在第一次初始化时使用
    public static synchronized SimpleLazySingleton getInstance(){
        if (instance == null){
            instance = new SimpleLazySingleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
