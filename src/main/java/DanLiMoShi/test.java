package DanLiMoShi;
/**
 * Created by wangwei12 on 2017/3/17.
 */

public class test {
    private Service service;
    private String excelDataReader;

    public String test1() {
        Service.getInstance1().getExcelDataReader();
        System.out.println(Service.getInstance1().getExcelDataReader());
        return "test";
    }

    public static void main(String args[]) {
        test t = new test();
        t.test1();

        //非静态字段不能从静态上下文引用
        //excelDataReader = Service.getInstance1().getExcelDataReader();
        //因为是单例模式，无法单独创建这个对象，只能通过类调用
        //Service s = new Service();

    }
}

