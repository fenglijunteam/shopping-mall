package com.servyou.dto;

import com.servyou.common.enums.IErrorCode;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 冯立军
 * @version 1.0
 * @Date 2019/11/1
 */
@Data
@AllArgsConstructor
public class RichResult<T> {
    private int status;

    private T data;

    private String internalErrorCode = "0";
    private String msg = "success";

    public RichResult(T data) {
        this();
        this.setStatus(200);
        this.data = data;
    }

    public RichResult() {
    }

    public RichResult(String msg) {
        this.setStatus(500);
        this.msg = msg;

    }

    public RichResult(int status,String msg, T data) {
        this.setStatus(status);
        this.msg = msg;
        this.data = data;


    }
    public static <T> RichResult<T> success(T data) {
        return new RichResult<T>(data);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     */
    public static <T> RichResult<T> failed(IErrorCode errorCode) {
        return new RichResult<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }

}
