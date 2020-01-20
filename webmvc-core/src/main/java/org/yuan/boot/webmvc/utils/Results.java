package org.yuan.boot.webmvc.utils;

import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-19 20:43
 */
public class Results {
    public final static Integer OK_CODE = 200;
    public static final String OK_MESSAGE = "操作成功";
    public final static Integer SYSTEM_ERROR_CODE = 1000;
    public final static String SYSTEM_ERROR_MESSAGE = "系统错误";
    public final static Integer DATA_PARAMS_ERROR_CODE = 2000;
    public final static String DATA_PARAMS_ERROR_MESSAGE = "参数错误";
    public final static Integer DATA_RESULT_ERROR_CODE = 3000;
    public final static String DATA_RESULT_ERROR_MESSAGE = "结果错误";

    public static Result ok() {
        return Result.builder().code(OK_CODE).message(OK_MESSAGE).build();
    }

    public static Result ok(String message) {
        return Result.builder().code(OK_CODE).message(message).build();
    }

    public static Result ok(String message, Object data) {
        return Result.builder().code(OK_CODE).message(message).data(data).build();
    }

    public static Result data(Object data) {
        return Result.builder().code(OK_CODE).message(OK_MESSAGE).data(data).build();
    }

    public static Result error(Integer code, String message) {
        return Result.builder().code(code).message(message).build();
    }

    public static Result error(Integer code, String message, Object data) {
        return Result.builder().code(code).message(message).data(data).build();
    }

    public static Result systemError() {
        return Result.builder().code(SYSTEM_ERROR_CODE).message(SYSTEM_ERROR_MESSAGE).build();
    }

    public static Result dataParamsError() {
        return Result.builder().code(DATA_PARAMS_ERROR_CODE).message(DATA_PARAMS_ERROR_MESSAGE).build();
    }

    public static Result dataParamsError(Object data) {
        return Result.builder().code(DATA_PARAMS_ERROR_CODE).message(DATA_PARAMS_ERROR_MESSAGE).data(data).build();
    }

    public static Result dataParamsError(String message) {
        return Result.builder().code(DATA_PARAMS_ERROR_CODE).message(message).build();
    }

    public static Result dataParamsError(String message, Object data) {
        return Result.builder().code(DATA_PARAMS_ERROR_CODE).message(message).data(data).build();
    }

    public static Result dataResultError() {
        return Result.builder().code(DATA_RESULT_ERROR_CODE).message(DATA_RESULT_ERROR_MESSAGE).build();
    }

    public static Result dataResultError(Object data) {
        return Result.builder().code(DATA_RESULT_ERROR_CODE).message(DATA_RESULT_ERROR_MESSAGE).data(data).build();
    }

    public static Result dataResultError(String message) {
        return Result.builder().code(DATA_RESULT_ERROR_CODE).message(message).build();
    }

    public static Result dataResultError(String message, Object data) {
        return Result.builder().code(DATA_RESULT_ERROR_CODE).message(message).data(data).build();
    }
}