package codeZhuJie;

/**
 * Created by wangwei12 on 2017/2/22.
 */
public class Bird implements Animal {

    @Override
    public void run() {
        System.out.println("I can run");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void sing() {
        System.out.println("I can sing");
    }
}
