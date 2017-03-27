package readExcelSheet;

import org.testng.annotations.Test;

/**
 * Created by wangwei12 on 2017/3/6.
 */
@SheetSuffix("api_m")
public class DataProviderTestCase {
    @Test(dataProvider="creatDataList",dataProviderClass=readExcelSheet.TestData.class)
    public void AppBannerList(String testdatas) {
        System.out.println("指定名称，数据源名为方法名选择:"+testdatas);
        System.out.println("指定名称1，数据源名为方法名选择:"+testdatas);
    }

   /* @Test(dataProvider="creatDataList",dataProviderClass=DataProviderTest.TestData.class)
    public void testDataDP1(String testdatas) {
        System.out.println("指定名称，数据源名为方法名选择:"+testdatas);
        System.out.println("指定名称1，数据源名为方法名选择:"+testdatas);
    }*/
}
