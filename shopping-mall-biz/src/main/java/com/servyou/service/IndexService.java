package com.servyou.service;

import org.springframework.stereotype.Service;

/**
 * @author 冯立军
 * @version 1.0
 * @Date 2019/10/31
 */
@Service
public class IndexService {
    public String index() {
        return "welcome to shopping mall";
    }
}
