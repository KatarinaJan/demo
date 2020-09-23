package com.gaj.exception;

import com.gaj.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * printStackTrace 打印信息栈
 * getMessage 打印单条错误信息
 *
 * @Project: demo
 * @Describe: 全局异常处理类
 * @Author: Jan
 * @Date: 2020-09-02 22:39
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler<T> {

    /**
     * 全局异常处理
     * @param e 全局异常
     * @return 失败
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R<T> error(Exception e) {
//        e.printStackTrace();
//        log.error(e.getMessage());
        log.error(ExceptionUtil.getMessage(e));
        return R.failed();
    }

    /**
     * 特定异常处理
     */
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public R<T> error(ArithmeticException e) {
//        e.printStackTrace();
//        log.error(e.getMessage());
        log.error(ExceptionUtil.getMessage(e));
        return R.failed("<异常>除数为0");
    }

    /**
     * 特定异常处理
     */
    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public R<T> error(NullPointerException e) {
//        e.printStackTrace();
//        log.error(e.getMessage());
        log.error(ExceptionUtil.getMessage(e));
        return R.failed("<异常>空指针");
    }

    /**
     * 自定义异常处理
     */
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public R<T> error(CustomException e) {
//        e.printStackTrace();
//        log.error(e.getMessage());
        log.error(ExceptionUtil.getMessage(e));
        return R.failed("<自定义异常>" + e.getCode() + e.getMessage());
    }

}
