package com.servyou.dao.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author lining on 2018/7/9.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
