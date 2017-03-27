package readExcelSheet;

import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by wangwei12 on 2017/3/7.
 */
public class ExcelDataReader {
    private static String currentTestSheet;
    private static String currentResultSheet;
    private static String currentClassName;

    private Map<String, Map<String, ContentRecord>> excelMap = new HashMap();

    public Map<String, Map<String, ContentRecord>> getExcelMap() {
        return this.excelMap;
    }

    public Iterator<Object[]> getTestData(Method method) {
        ArrayList list = new ArrayList();
        new ArrayList();
        currentTestSheet = "";
        currentResultSheet = "";
        currentClassName = "";
        //获取用例反射传过来的类名的包
        String className = method.getDeclaringClass().getName();
        //获取方法名
        String methodName = method.getName();

        System.out.println("test:className=" + className);
        System.out.println("test:methodName=" + methodName);

        String testCaseSheetName = "TestCase";
        String resultSheetName = "ExpectResult";
        String suffix = "";
        try {
            //通过自定义注解，获取注解值，在自动化例子中通过这个值区分sheet名
            Class e = Class.forName(className);
            Boolean isExist = Boolean.valueOf(e.isAnnotationPresent(SheetSuffix.class));
            if (isExist.booleanValue()) {
                SheetSuffix sheetSuffix = (SheetSuffix) e.getAnnotation(SheetSuffix.class);
                suffix = sheetSuffix.value();

                System.out.println("test:shffix="+suffix);

            }
        } catch (Exception var6) {
            System.out.println(var6.toString());
            return null;
        }

        if (suffix != null && !suffix.trim().equals("")) {
            testCaseSheetName = testCaseSheetName + "_" + suffix;
            resultSheetName = resultSheetName + "_" + suffix;
        }
        currentTestSheet = testCaseSheetName;
        currentResultSheet = resultSheetName;
        currentClassName = className;
        System.out.println("test:currentTestSheet="+currentTestSheet);
        System.out.println("test:currentResultSheet="+currentResultSheet);
        System.out.println("test:currentClassName"+className);

        //至此以上步骤都是设置我下面要读取要写的sheet标签名
        List idList;
        ExcelHelper excelHelper = new ExcelHelper();
        //根据sheet获取方法名
        idList = excelHelper.getIDbyMethodName(currentTestSheet, method.getName(), false);
        if(idList != null) {
            for(int i = 0; i < idList.size(); ++i) {
                String ID = (String)idList.get(i);
                String caseName = ((ContentRecord)((Map)this.excelMap.get(currentTestSheet)).get(ID)).get("CaseName");
                list.add(new Object[]{ID, caseName});
            }
        }

        return list.iterator();

       /*
        idList = this.excelHelper.getIDbyMethodName(IfContext.getCurrentTestSheet(), method.getName(), false);
        if(idList != null) {
            for(int i = 0; i < idList.size(); ++i) {
                String ID = (String)idList.get(i);
                String caseName = ((ContentRecord)((Map)this.excelMap.get(IfContext.getCurrentTestSheet())).get(ID)).get("CaseName");
                list.add(new Object[]{ID, caseName});
            }
        }
        return list.iterator();*/
    }
}
