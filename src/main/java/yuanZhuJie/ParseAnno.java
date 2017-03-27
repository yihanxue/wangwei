//package yuanZhuJie;
//
//import java.lang.annotation.Annotation;
//import java.lang.reflect.Method;
//
///**
// * Created by wangwei12 on 2017/2/22.
// */
//public class ParseAnno {
//    public static void main(String[] args){
//        try {
//            /*
//             * 1.使用类加载器加载类
//             * Class.forName("类名字符串") （注意：类名字符串必须是全称，包名+类名）
//             */
//
//            // getAnnotations()：返回该程序元素上存在的所有注解。
//            // isAnnotationPresent(annotation.class)：判断该程序元素上是否包含指定类型的注解
//            // getDeclaredAnnotations()：返回直接存在于此元素上的所有注释。与此接口中的其他方法不同，该方法将忽略继承的注释。
//
//
//
//            //2.判断类上是否存在注解，并获取类上面注解的实例
//            Class c=Class.forName("yuanZhuJie.annotest");  //package-class
//            if(c.isAnnotationPresent(Description.class)){
//                Description description=(Description) c.getAnnotation(Description.class);
//                System.out.println(description.desc());
//                System.out.println(description.author());
//                System.out.println(description.age());
//            }
//
//            //3.判断方法上是否存在注解，并获取方法上面注解的实例
//            Method[] ms=c.getMethods();
//            for(Method method:ms){
//                if(method.isAnnotationPresent(Description.class)){
//                    Description description=(Description) method.getAnnotation(Description.class);
//                    System.out.println(description.desc());
//                    System.out.println(description.author());
//                    System.out.println(description.age());
//                }
//            }
//
//            // 另一种获取方法上的注解的解析方法
//            for(Method method:ms){
//                Annotation[] as =method.getAnnotations();
//                for(Annotation annotation:as){
//                    if(annotation instanceof Description){
//                        System.out.println(((Description) annotation).desc());
//                        System.out.println(((Description) annotation).author());
//                        System.out.println(((Description) annotation).age());
//                    }
//                }
//
//            }
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
