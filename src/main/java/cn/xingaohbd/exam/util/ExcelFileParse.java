package cn.xingaohbd.exam.util;

import cn.xingaohbd.exam.model.Classify;
import cn.xingaohbd.exam.model.QuesBank;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelFileParse {

    public static List<QuesBank> parse(File fo) throws IOException {
        List<QuesBank> list = new ArrayList<QuesBank>();
        XSSFWorkbook workbook = null;
        //创建Excel，读取文件内容
        workbook = new XSSFWorkbook(FileUtils.openInputStream(fo));

        int size = workbook.getNumberOfSheets();
        for (int j = 0; j < size; j++) {

            //获取第一个工作表
            XSSFSheet sheet = workbook.getSheetAt(j);

            //获取sheet中第一行行号
            int firstRowNum = sheet.getFirstRowNum();
            //获取sheet中最后一行行号
            int lastRowNum = sheet.getLastRowNum();

            try {
                //循环插入数据
                for (int i = firstRowNum + 1; i <= lastRowNum; i++) {
                    XSSFRow row = sheet.getRow(i);

                    QuesBank quesBank = new QuesBank();

                    XSSFCell quesName = row.getCell(0);//题目
                    if (quesName != null) {
                        quesName.setCellType(CellType.STRING);
                        quesBank.setQuesName(quesName.getStringCellValue());
                    }

                    XSSFCell selectA = row.getCell(1);//选项1
                    if (selectA != null) {
                        selectA.setCellType(CellType.STRING);
                        quesBank.setSelectA(selectA.getStringCellValue());
                    }

                    XSSFCell selectB = row.getCell(2);//选项2
                    if (selectB != null) {
                        selectB.setCellType(CellType.STRING);
                        quesBank.setSelectB(selectB.getStringCellValue());
                    }

                    XSSFCell selectC = row.getCell(3);//选项3
                    if (selectC != null) {
                        selectC.setCellType(CellType.STRING);
                        quesBank.setSelectC(selectC.getStringCellValue());
                    }

                    XSSFCell selectD = row.getCell(4);//选项4
                    if (selectD != null) {
                        selectD.setCellType(CellType.STRING);
                        quesBank.setSelectD(selectD.getStringCellValue());
                    }

                    XSSFCell answer = row.getCell(5);//答案
                    if (answer != null) {
                        answer.setCellType(CellType.STRING);
                        quesBank.setAnswer(answer.getStringCellValue());
                    }

                    XSSFCell analysis = row.getCell(6);//解析
                    if (analysis != null) {
                        analysis.setCellType(CellType.STRING);
                        quesBank.setAnalysis(analysis.getStringCellValue());
                    }

                    XSSFCell quesTypeStatus = row.getCell(7);//题目所属类别(单选1、多选2、填空3、判断4)
                    if (quesTypeStatus != null) {
                        quesTypeStatus.setCellType(CellType.STRING);
                        quesBank.setQuesTypeStatus(new Integer(quesTypeStatus.getStringCellValue()));
                    }

                    XSSFCell classifyId = row.getCell(8);//题目类型(java1，测试2)
                    if (classifyId != null) {
                        classifyId.setCellType(CellType.STRING);
                        quesBank.setClassifyId(new Integer(classifyId.getStringCellValue()));
                    }

                    list.add(quesBank);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            } finally {
                workbook.close();
            }
        }
        return list;
    }

}
