package com.example.demoexcelreader.service.Impl;

import com.example.demoexcelreader.mapper.RecoveryBodyPartBlankMapper;
import com.example.demoexcelreader.pojo.Acupuncture;
import com.example.demoexcelreader.service.AcupunctureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: AcupunctureServiceImpl
 * @Description: TODO
 * @Author: zzl
 * @Date: 2024/6/20 14:11
 * @Version: 1.0
 */
@Service
public class AcupunctureServiceImpl implements AcupunctureService {

    @Resource
    RecoveryBodyPartBlankMapper recoveryBodyPartBlankMapper;

    @Override
    public void batchSaveAcupuncture(List<Acupuncture> acupunctureList) {
//        String s = recoveryBodyPartBlankMapper.selectById(1117);
//        recoveryBodyPartBlankMapper.
        System.out.println(acupunctureList);
//        System.out.println(s);
//        System.out.println(acupunctureList);
    }
}
