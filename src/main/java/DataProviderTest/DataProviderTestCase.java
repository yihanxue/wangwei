package DataProviderTest;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by wangwei12 on 2017/3/6.
 * testng的dataProvider的用法：会调用@DataProvider(name = "creatDataList")的方法，
 * @Test使用dataProvider，会将自己的方法名传给@DataProvider
 * @DataProvider返回的数组会返回给@Test，二维数组中的每个一维数组都会传递给调用函数@Test作为参数使用，
 * 并且@Test会循环执行@Test标识的test method被执行的次数和object[][]包含的一维数组的个数是一致的，
 * 而@Test标识的函数的参数个数，也和object内一维数组内的元素数是一致的
 */
public class DataProviderTestCase {
    @Test(dataProvider="creatDataList",dataProviderClass=DataProviderTest.TestData.class)
    public void creatDataList1(String testdatas,String testdatas1) {
        System.out.println("指定名称，数据源名为方法名选择:"+testdatas+"和"+testdatas1);
        System.out.println("指定名称1，数据源名为方法名选择:"+testdatas+"和"+testdatas1);
        Assert.assertTrue(true);
    }

    @Test(dataProvider="creatDataList",dataProviderClass=DataProviderTest.TestData.class)
    public void testDataDP1(String testdatas) {
        System.out.println("指定名称2，数据源名为方法名选择:"+testdatas);
        System.out.println("指定名称3，数据源名为方法名选择:"+testdatas);
        Assert.assertTrue(true);
    }
}
