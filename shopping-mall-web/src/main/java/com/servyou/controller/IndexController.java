package com.servyou.controller;

import com.servyou.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 冯立军
 * @version 1.0
 * @Date 2019/10/31
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private IndexService indexService;
    @GetMapping("")
    public String index() {
        return indexService.index();
    }
}
