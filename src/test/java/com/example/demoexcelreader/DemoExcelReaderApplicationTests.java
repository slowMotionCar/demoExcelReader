package com.example.demoexcelreader;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.example.demoexcelreader.listener.EasyExcelLinster;
import com.example.demoexcelreader.pojo.Acupuncture;
import com.example.demoexcelreader.service.AcupunctureService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@Controller
class DemoExcelReaderApplicationTests {

    @Resource
    private EasyExcelLinster easyExcelLinster;

    @Test
    void contextLoads() {
    }


    @Test
    void readExcel() {
        //准备文件路径
        String fileName = "D:/testRead.xlsx";
        EasyExcel.read(fileName, easyExcelLinster).sheet().doRead();
//        ExcelReader excelReader = EasyExcel.read(fileName).build();
//        EasyExcelLinster easyExcelLinster = new EasyExcelLinster();
//        excelReader.read(easyExcelLinster);
    }


}
