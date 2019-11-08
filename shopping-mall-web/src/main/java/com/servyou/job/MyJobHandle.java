package com.servyou.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;

/**
 * @author 冯立军
 * @version 1.0
 * @Date 2019/11/1
 */
//@JobHandler(value="myJob")
//@Component
public class MyJobHandle extends IJobHandler {
    @Override
    public ReturnT<String> execute(String s) throws Exception {
        System.out.println("XXL-Job传递的参数是："+s);
        return SUCCESS;
    }
}
