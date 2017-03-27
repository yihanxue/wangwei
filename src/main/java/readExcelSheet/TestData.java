package readExcelSheet;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;
import java.util.Iterator;

/**
 * Created by wangwei12 on 2017/3/6.
 */
public class TestData {

    @DataProvider(name = "creatDataList")
    public static Iterator<Object[]> creatDataList(Method method) {
        ExcelDataReader excelDataReader=new ExcelDataReader();

        System.out.println("========"+method.getName());
        return excelDataReader.getTestData(method);
    }

   /* @DataProvider(name = "creatDataSingle")
    public static Object[][] creatDataSingle() {
        System.out.println("========");
        return new Object[][]{
                {"dataprovider2-1"},{"dataprovider2-2"}
        };
    }*/
}
