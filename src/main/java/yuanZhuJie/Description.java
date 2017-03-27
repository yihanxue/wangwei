//package yuanZhuJie;
//
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
///**
// * Created by wangwei12 on 2017/2/22.
// */
//@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
//@Retention(RetentionPolicy.RUNTIME)   //运行时存在，可以通过反射读取
////@Retention(RetentionPolicy.CLASS)   //编译时会记录到class中，运行时忽略
////@Retention(RetentionPolicy.SOURCE)  //只在源码显示，编译时会丢失
//
//public @interface Description {
//    String desc();
//    String author() default  "haha";
//    int age() default 18;
//}
