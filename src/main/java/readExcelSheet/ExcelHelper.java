package readExcelSheet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Created by wangwei12 on 2017/3/7.
 */
public class ExcelHelper {
    private Workbook wookbook;
    private Sheet sheet;

    private String getCellvalue(Cell cell) {
        String value = "NULL";

        try {
            cell.setCellType(1);
            value = cell.getStringCellValue();
            return value;
        } catch (Exception var4) {
            return value;
        }
    }

    public List<String> getIDbyMethodName(String sheetName, String methodName, boolean bool) {
        //获取指定的sheet页
        this.sheet = this.wookbook.getSheet(sheetName);
        if(this.sheet == null) {
            System.out.println("sheet is null");
            return null;
        } else {
            ArrayList idList = new ArrayList();
            //获取第一行
            Row myRow = this.sheet.getRow(0);
            int index = 0;
            int runIndex = 0;
            Iterator caseID = myRow.iterator();

            Cell i;
            //获取列名为CaseName的列ID
            while(caseID.hasNext()) {
                i = (Cell)caseID.next();
                if(this.getCellvalue(i).equalsIgnoreCase("CaseName")) {
                    index = i.getColumnIndex();
                    System.out.println("test:index="+index);
                    break;
                }
            }

            caseID = myRow.iterator();

            //获取列名为IsRun的列ID
            while(caseID.hasNext()) {
                i = (Cell)caseID.next();
                if(this.getCellvalue(i).equalsIgnoreCase("IsRun")) {
                    runIndex = i.getColumnIndex();
                    System.out.println("test:runIndex="+runIndex);
                    break;
                }
            }

            int var12;
            String var13;
            if(bool) {
                for(var12 = 1; (myRow = this.sheet.getRow(var12)) != null; ++var12) {
                    var13 = this.getCellvalue(myRow.getCell(index));
                    if(var13.contains("_")) {
                        String[] strArry = var13.split("_");
                        if(strArry[0].trim().equalsIgnoreCase(methodName) && this.getCellvalue(myRow.getCell(runIndex)).equalsIgnoreCase("Y")) {
                            String caseID1 = this.getCellvalue(myRow.getCell(0));
                            idList.add(caseID1);
                        }
                    }
                }
            } else {
                //直接从第二行开始读取，第一行是getRow(0)
                for(var12 = 1; (myRow = this.sheet.getRow(var12)) != null; ++var12) {
                    //循环读取和测试用例方法名相同的单元格，且是否执行设置为Y的记录
                    if(this.getCellvalue(myRow.getCell(index)).trim().equalsIgnoreCase(methodName) && this.getCellvalue(myRow.getCell(runIndex)).equalsIgnoreCase("Y")) {
                        var13 = this.getCellvalue(myRow.getCell(0));
                        System.out.println("test:svar13="+var13);
                        idList.add(var13);
                    }
                }
            }

            return idList;
        }
    }
}
