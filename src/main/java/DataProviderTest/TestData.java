package DataProviderTest;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

/**
 * Created by wangwei12 on 2017/3/6.
 */
public class TestData {
    @DataProvider(name = "creatDataList")
    public static Object[][] creatDataList(Method method) {
        System.out.println("========"+method.getName());
        return new Object[][]{
                {"dataprovider1-1","dataprovider1-2"},{"dataprovider2-1","dataprovider2-2"}
        };
    }

    @DataProvider(name = "creatDataSingle")
    public static Object[][] creatDataSingle() {
        System.out.println("========");
        return new Object[][]{
                {"dataprovider3-1"},{"dataprovider3-2"}
        };
    }
}
