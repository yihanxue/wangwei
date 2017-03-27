package AutomaticTest.ccdai;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by wangwei12 on 2017/2/22.
 * 读取testng.xml配置的参数值
 */
public class IMsgCenterService {
    @Parameters({"parameter1","parameter2"})
    @Test(groups="parameter")
    public void parameter(String para1,int para2){
        System.out.println("parameter1="+para1);
        System.out.println("parameter2="+para2);
        Assert.assertTrue(true);
    }



}
