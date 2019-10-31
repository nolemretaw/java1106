package com.lanou.SingletonPattern.LazySingleton;

/**
 * @Author: HuTingrong
 * @Description:
 * @Date: Created in 10:58 2019/10/31
 * @Modified By:
 *
 * 双重校验锁 懒汉单例
 *
 * JDK 版本：JDK1.5 起
 *
 * 是否 Lazy 初始化：是
 *
 * 是否多线程安全：是
 *
 * 实现难度：较复杂
 *
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 *
 */
public class DCL_LazySinglton {
    //使用了volatile关键字后，重排序被禁止，
    // 所有的写（write）操作都将发生在读（read）操作之前。
    private volatile static DCL_LazySinglton instance;
    private DCL_LazySinglton (){}
    public static DCL_LazySinglton getInstance(){
        if (instance == null){//若已初始化过就不再加锁
            synchronized (DCL_LazySinglton.class){
                if (instance == null){
                    instance = new DCL_LazySinglton();
                }
            }
        }
        return instance;
    }
}
