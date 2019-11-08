package com.servyou.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.servyou.common.utils.BeanCopyUtil;
import com.servyou.common.utils.PinYinUtils;
import com.servyou.dao.entity.PmsBrandDO;
import com.servyou.dao.mapper.PmsBrandDOMapper;
import com.servyou.dto.BrandDto;
import com.servyou.req.BrandReq;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author 冯立军
 * @version 1.0
 * @Date 2019/11/8
 */
@Service
public class BrandService {

    @Autowired
    private PmsBrandDOMapper pmsBrandDOMapper;

    /**
     * 创建品牌
     * @param req
     * @return
     */
    public int createBrand(BrandReq req) {
        if (StringUtils.isBlank(req.getFirstLetter())) {
            req.setFirstLetter(PinYinUtils.getHanziInitials(req.getName()));
        }
        PmsBrandDO pmsBrandDO = BeanCopyUtil.objConvert(req, PmsBrandDO.class);
        return pmsBrandDOMapper.insertSelective(pmsBrandDO);
    }

    /**
     * 分页查询品牌管理
     * @param currentPage
     * @param pageSize
     * @return
     */
    public PageInfo<BrandDto> page(String name, Integer currentPage,Integer pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        Page<PmsBrandDO> list = (Page<PmsBrandDO>) pmsBrandDOMapper.getList(name);
        return new PageInfo<>(BeanCopyUtil.convertPage(list,BrandDto.class));
    }
}
