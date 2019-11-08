package com.servyou.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author 冯立军
 * @version 1.0
 * @Date 2019/11/8
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BrandReq {

    @ApiModelProperty(value = "品牌名称", required = true, dataType = "string")
    @NotBlank(message = "品牌名称不能为空")
    private String name;

    @ApiModelProperty(value = "品牌首字母", dataType = "string")
    private String firstLetter;

    @ApiModelProperty(value = "品牌LOGO", required = true, dataType = "string")
    @NotBlank(message = "品牌LOGO不能为空")
    private String logo;

    @ApiModelProperty(value = "品牌专区大图", dataType = "string")
    private String bigPic;

    @ApiModelProperty(value = "品牌故事", dataType = "string")
    private String brandStory;

    @ApiModelProperty(value = "排序", dataType = "integer")
    private Integer sort;

    @ApiModelProperty(value = "是否显示", dataType = "integer")
    private Integer showStatus;

    @ApiModelProperty(value = "品牌制造商", dataType = "integer")
    private Integer factoryStatus;

}
