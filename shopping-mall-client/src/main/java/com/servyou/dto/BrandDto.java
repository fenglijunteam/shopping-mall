package com.servyou.dto;

import lombok.Data;

/**
 * @author 冯立军
 * @version 1.0
 * @Date 2019/11/8
 */
@Data
public class BrandDto  {
    private String name;
    private String firstLetter;
    private Integer sort;
    private Integer factoryStatus;
    private Integer showStatus;
    private Long productCount;
    private Long productCommentCount;
    private String logo;
    private String bigPic;

}
