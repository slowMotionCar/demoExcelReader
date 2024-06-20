package com.example.demoexcelreader.service;

import com.example.demoexcelreader.pojo.Acupuncture;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: acupunctureService
 * @Description: TODO
 * @Author: zzl
 * @Date: 2024/6/20 14:10
 * @Version: 1.0
 */

@Service
public interface AcupunctureService {

    void batchSaveAcupuncture(List<Acupuncture> acupunctureList);
}
