package com.example.demoexcelreader.mapper;

import com.baomidou.mybatisplus.annotation.TableName;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @ClassName: RecoveryBodyPartMapper
 * @Description: TODO
 * @Author: zzl
 * @Date: 2024/6/20 14:18
 * @Version: 1.0
 */
@TableName("t_recovery_body_part_blank")
public interface RecoveryBodyPartBlankMapper {
    @Select("insert into name from t_recovery_body_part_blank ")
    String selectById(int i);
}
