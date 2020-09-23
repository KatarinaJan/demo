package com.gaj.exception;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * 信息栈 printStackTrace
 * logback配合Slf4j的log.error(ExceptionUtil.getMessage(e));将异常信息写入到文件
 *
 * @Project: demo
 * @Describe: 异常工具类
 * @Author: Jan
 * @Date: 2020-09-02 23:54
 */
public class ExceptionUtil {

    public static String getMessage(Exception e) {
        StringWriter sw = null;
        PrintWriter pw = null;
        try {
            sw = new StringWriter();
            pw = new PrintWriter(sw);
            // 将出错的栈信息输出到printWriter中
            e.printStackTrace(pw);
            pw.flush();
            sw.flush();
        } finally {
            if (null != sw) {
                try {
                    sw.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            if (null != pw) {
                try {
                    pw.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        return sw.toString();
    }
}
