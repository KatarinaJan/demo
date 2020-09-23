package com.gaj.util;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Project: demo
 * @Describe: 统一返回结果集
 * @Author: Jan
 * @Date: 2020-09-02 21:53
 */
@Data
@ApiModel(value = "统一返回结果集")
public class R<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "返回码：成功=0，失败=1")
    private Integer code;

    @ApiModelProperty(value = "返回信息")
    private String message;

    @ApiModelProperty(value = "数据")
    private T data;

    public static <T> R<T> restResult(T data, Integer code, String msg) {
        R<T> apiResult = new R<>();
        apiResult.setData(data);
        apiResult.setCode(code);
        apiResult.setMessage(msg);
        return apiResult;
    }

    public static <T> R<T> ok() {
        return restResult(null, Constants.SUCCESS, Constants.MSG_SUCCESS);
    }

    public static <T> R<T> ok(T data) {
        return restResult(data, Constants.SUCCESS, Constants.MSG_SUCCESS);
    }

    public static <T> R<T> ok(T data, String message) {
        return restResult(data, Constants.SUCCESS, message);
    }

    public static <T> R<T> failed() {
        return restResult(null, Constants.FAIL, Constants.MSG_FAIL);
    }

    public static <T> R<T> failed(String message) {
        return restResult(null, Constants.FAIL, message);
    }

    public static <T> R<T> failed(T data) {
        return restResult(data, Constants.FAIL, Constants.MSG_FAIL);
    }

    public static <T> R<T> failed(T data, String message) {
        return restResult(data, Constants.FAIL, message);
    }

}
