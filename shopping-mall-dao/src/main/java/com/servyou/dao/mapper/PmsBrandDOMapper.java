package com.servyou.dao.mapper;

import com.servyou.dao.config.MyMapper;
import com.servyou.dao.entity.PmsBrandDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsBrandDOMapper extends MyMapper<PmsBrandDO> {
    List<PmsBrandDO> getList(@Param("name") String name);
}