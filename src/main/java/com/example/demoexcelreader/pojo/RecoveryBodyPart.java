package com.example.demoexcelreader.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @ClassName: b
 * @Description: TODO
 * @Author: zzl
 * @Date: 2024/6/20 10:24
 * @Version: 1.0
 */
@Data
public class RecoveryBodyPart {

    @Id
    private Long id;

    private Long acupunctureId;

    /**
     * 名称
     */
    private String name;

    /**
     * 拼音
     */
    private String pinyin;

    /**
     * 名称
     */
    private String Code;

    /**
     * 是否有左右两侧之分，0：否，默认，1：是
     */
    private Integer isTwoSide;

    /**
     * 父级id，最顶级为0
     */
    private Long parentId;
    /**
     * 祖级id
     */
    private Long rootId;


}
