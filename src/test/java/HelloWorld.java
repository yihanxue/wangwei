/**
 * Created by wangwei12 on 2017/3/8.
 */
public class HelloWorld  extends  Object{
    //测试局部变量
    /*public void test(){
        int i=1;
        System.out.println(i);
    }*/

    //测试实例变量
    public  int  name;

    public void test(){
        System.out.println(name);
    }

    public HelloWorld(){

    }
    public static final String DEPARTMENT="MOBILE TEST";

    public static void main(String args[]){
        wiretest1  test =new wiretest1();
        test.test();






        System.out.println(DEPARTMENT);
        System.out.println(DEPARTMENT);
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.test();

        /*
        1、声明：声明一个对象，包括对象名称和对象类型。  Person  xiaoding
        2、实例化：使用关键字new来创建一个对象。         new
        3、初始化：使用new创建对象时，会调用构造方法初始化对象。  Person("xiaoling");
        */
        /*Person  xiaoding  = new Person("xiaoding");//调用了构造方法
        System.out.println(xiaoding.getName());
        xiaoding.setAge(15);
        xiaoding.setName("xiaoding");
        System.out.println(xiaoding.getName());
        int age = xiaoding.getAge();
        System.out.println("xiaoding's age is "+age);
        System.out.println(xiaoding.speak());


        Person  person  = new Person();
        System.out.println(xiaoding.speak());

        ArrayList idList = new ArrayList();

*/
        SubClass sc = new SubClass();
        SubClass sc2 = new SubClass(200);
/*
        String  a="abc";
        String  b="abc";
        System.out.println(a==b);
        String c =new String("abc");
        String d =new String("abc");
        System.out.println(a==d);
        System.out.println(c==d);*/
    }




}


class SuperClass {
    private int n;
    SuperClass(){
        System.out.println("SuperClass的无参构造器");
    }
    SuperClass(int n) {
        System.out.println("SuperClass的有参构造器");
        this.n = n;
    }
}


class SubClass extends SuperClass{
    private int n;

    SubClass(){
        //super(300);
        System.out.println("SubClass的无参构造器");
    }

    public SubClass(int n){
        System.out.println("SubClass的有参构造器");
        this.n = n;
    }
}



class OverloadTest {
    public void OloadTest(){
        System.out.println("测试重载");
    }

    public void OloadTest(int a,int b){
        System.out.println("测试重载");
    }

    /*public String OloadTest(int a,int b){
        System.out.println("测试重载");
        return "test";
    }*/

   /* public void OloadTest(String b,int a){
        System.out.println("测试重载");
    }*/
    public void OloadTest(int a,String b){
        System.out.println("测试重载");
    }
    public void OloadTest(String a,int b){
        System.out.println("测试重载");
    }
}


