package com.gaj.exception;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 触发条件：需要手动throw异常
 * Example 1：
 *          try {
 *               int a = 10/0;
 *          }catch(Exception e) {
 *               throw new CustomException(20001,"出现自定义异常");
 *          }
 *
 * Example 2：
 *         List<String> list = null;
 *         try{
 *             if (list.equals("a")) {
 *                return 1;
 *             }
 *             return 2;
 *         } catch (Exception e) {
 *             throw new CustomException(2001, "我是异常！");
 *         }
 * @Project: demo
 * @Describe: 自定义异常类 需要继承某一异常类
 * @Author: Jan
 * @Date: 2020-09-02 22:57
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "自定义异常类", description = "手动抛出该异常类生效")
public class CustomException extends RuntimeException {

    @ApiModelProperty(value = "状态码")
    private Integer code;

    @ApiModelProperty(value = "信息")
    private String message;

    @Override
    public String toString() {
        return "CustomException{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
