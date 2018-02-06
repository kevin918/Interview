package leetcode;

/**
 * 懒汉写法
 * @author renkai
 *         created on 2018/2/6.
 */
public class Singleton {
    private static Singleton singleton;
    private Singleton(){}
    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
