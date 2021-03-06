package org.yuan.boot.shower.commons.utils;

import org.yuan.boot.webmvc.pojo.Result;

import static org.yuan.boot.shower.commons.utils.Results.Resulconstants.*;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 00:06
 */
public class Results extends org.yuan.boot.webmvc.utils.Results {
    public static Result existError(String message) {
        return Result.builder().code(EXIST_ENTITY_ERROR).message(message).build();
    }

    public static Result userError(String message) {
        return Result.builder().code(USER_ERROR).message(message).build();
    }

    public static Result deviceError(String message) {
        return Result.builder().code(DEVICE_ERROR).message(message).build();
    }

    public static Result deviceError(String message, Object data) {
        return Result.builder().code(DEVICE_ERROR).message(message).data(data).build();
    }

    public static Result wxError(String message) {
        return Result.builder().code(WX_ERROR).message(message).build();
    }

    public static Result wxError(String message, Object data) {
        return Result.builder().code(WX_ERROR).message(message).data(data).build();
    }

    public static class Resulconstants extends org.yuan.boot.webmvc.utils.Results.Resulconstants {
        public final static Integer EXIST_ENTITY_ERROR = 20001;
        /**
         * 用户操作错误编码
         */
        public final static Integer USER_ERROR = 300000;
        public final static Integer CHANGE_PASSWORD_USER_NOT_HAD = 300001;
        public final static Integer CHANGE_PASSWORD_USER_OLD_PWD_ERROR = 300002;
        /**
         * 设备错误
         */
        public final static Integer DEVICE_ERROR = 400000;
        /**
         * 微信错误
         */
        public final static Integer WX_ERROR = 500000;
    }

}