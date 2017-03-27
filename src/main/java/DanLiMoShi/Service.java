package DanLiMoShi;

/**
 * Created by wangwei12 on 2017/3/17.
 * 单例模式，在系统中这个是唯一的实例
 * 单例模式的要点有三个；一是某个类只能有一个实例；二是它必须自行创建这个实例；三是它必须自行向整个系统提供这个实例
 * 从具体实现角度来说，就是以下三点：
 * 一是单例模式的类只提供私有的构造函数，
 * 二是类定义中含有一个该类的静态私有对象，
 * 三是该类提供了一个静态的公有的函数用于创建或获取它本身的静态私有对象
 */
public class Service {
    //二是类定义中含有一个该类的静态私有对象，
    private static Service instance;

    private  String  excelDataReader;

    //一是单例模式的类只提供私有的构造函数
    private Service() {
    }

    //三是该类提供了一个静态的公有的函数用于创建或获取它本身的静态私有对象
    public static Service getInstance1() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }
    public String getExcelDataReader() {
        return "test";
    }

    public void init() throws Exception {
        this.excelDataReader=new String("dafadf");
        }

}
