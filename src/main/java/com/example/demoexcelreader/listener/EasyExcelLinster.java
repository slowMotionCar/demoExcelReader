package com.example.demoexcelreader.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.util.ListUtils;
import com.example.demoexcelreader.pojo.Acupuncture;
import com.example.demoexcelreader.service.AcupunctureService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: DemoDataListener
 * @Description: TODO
 * @Author: zzl
 * @Date: 2024/6/20 10:20
 * @Version: 1.0
 */

@Component
// 每次bean都是新的，不要单例
//@Scope("prototype")
public class EasyExcelLinster extends AnalysisEventListener<Map<Integer, String>> {

    List<Acupuncture> acupunctureList =  new ArrayList<Acupuncture>();

    @Autowired(required = true)
    AcupunctureService acupunctureService;


    @Override
    public void invoke(Map<Integer, String> acupunctureMap, AnalysisContext analysisContext) {
        acupunctureMap.forEach((k,v)->{
           if (v!=null){
//               System.out.println(v);
               Acupuncture acupuncture = new Acupuncture();
               acupuncture.setName(v);
               System.out.println(v);
               acupunctureList.add(acupuncture);
           }

        });
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
//        System.out.println(acupunctureList);
//        acupunctureService.batchSaveAcupuncture(acupunctureList);
//        System.out.println(acupunctureList);
    }}