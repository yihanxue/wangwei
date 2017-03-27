package Base;


import org.testng.annotations.BeforeSuite;

/**
 * Created by wangwei12 on 2017/2/21.
 * 暂时没有用到
 */
public class TestCaseBase {
    @BeforeSuite(alwaysRun = true)
    public void firstSetup(){
        System.out.println("SuiteSetup!!!");
    }
}
