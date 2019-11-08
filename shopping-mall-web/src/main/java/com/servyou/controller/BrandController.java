package com.servyou.controller;

import com.github.pagehelper.PageInfo;
import com.servyou.dto.BrandDto;
import com.servyou.dto.RichResult;
import com.servyou.req.BrandReq;
import com.servyou.service.BrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author 冯立军
 * @version 1.0
 * @Date 2019/11/7
 */
@RestController
@RequestMapping("/brands")
@Api(tags = "品牌管理")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @PostMapping()
    @ApiOperation(value = "添加品牌", notes = "添加品牌")
    public RichResult<Integer> create(@Valid @RequestBody BrandReq req) {

        return RichResult.success(brandService.createBrand(req));
    }

    @GetMapping()
    @ApiOperation(value = "分页查询品牌", notes = "分页查询品牌")
    public RichResult<PageInfo<BrandDto>> page(@RequestParam Integer currentPage,
                                               @RequestParam Integer pageSize,
                                               @RequestParam(value = "name",required = false) String name) {
        return RichResult.success(brandService.page(name,currentPage,pageSize));
    }
}
