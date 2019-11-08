package com.servyou.aop;

import com.servyou.common.enums.ResultCode;
import com.servyou.dto.RichResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;

/**
 * @author 冯立军
 * @version 1.0
 * @Date 2019/11/8
 */
@ControllerAdvice
public class ExceptionHandlerConfig {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public RichResult handleException(Exception e) {
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        response.setStatus(500);

        return RichResult.failed(ResultCode.FAILED);
    }
}
