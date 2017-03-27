package codeZhuJie;

/**
 * Created by wangwei12 on 2017/2/22.
 * @Deprecated设置run()方法不可用，
 * 在test类中使用该方法会提示该方法已经被Deprecated，
 * 如果要忽略该提示，可以在引用run方法的那个方法上面加上@SuppressWarnings("deprecation")忽略该警告
 */
public interface Animal {
    @Deprecated
    public void run();
    public void fly();
    public void sing();
}
