package ziDingYiZhuJie;

/**
 * Created by wangwei12 on 2017/2/22.
 */
public @interface Description { //使用@interface关键字自定义注解

    //成员以无参数无异常方式声明
    String desc();
    /* String desc(int a);
       String desc() throws Exception;
       都是错误的声明方式
     */

    String author();
    //String  author() default "";合法的声明

    //可以用default为成员指定一个默认值
    int  age()  default 18;

     /*
     * 如果声明：Map map(); 则会报错：
     * Invalid type Map for the annotation attribute Description.map;
     * only primitive type, String, Class, annotation, enumeration
     * are permitted or 1-dimensional arrays thereof
     *
     * 只有原始类型和String, Class, annotation, enumeration才可以
     */
}
