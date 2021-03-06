package org.yuan.boot.webmvc.exception.handler;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.yuan.boot.webmvc.exception.ResultException;
import org.yuan.boot.webmvc.exception.ResultRuntimeException;
import org.yuan.boot.webmvc.pojo.Result;
import org.yuan.boot.webmvc.utils.Results;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuanez
 * @create: 2020-01-13 13:52
 **/
@RestControllerAdvice
@ControllerAdvice
@Log4j2
public class GlobalExceptionHandler {
    @ExceptionHandler(ResultException.class)
    public Result resultExceptionHandler(ResultException e) {
        return e.getResult();
    }

    @ExceptionHandler(ResultRuntimeException.class)
    public Result resultRuntimeExceptionHandler(ResultRuntimeException e) {
        return e.getResult();
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public Result illegalArgumentExceptionHandler(IllegalArgumentException e) {
        log.error(e.getMessage(), e.getCause());
        return Results.dataParamsError();
    }

    @ExceptionHandler(Exception.class)
    public Result exceptionHandler(Exception e) {
        log.error(e.getLocalizedMessage(), e.getCause());
        return Results.systemError();
    }
}
