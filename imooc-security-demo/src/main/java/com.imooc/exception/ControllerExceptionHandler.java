package com.imooc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ControllerExceptionHandler
 * @Description TODO
 * @Auther lbt
 * @Date 2019/5/3/003 14:14
 * @Version 1.0
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(LoginException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.GONE)
    public Map<String, Object> loginException(LoginException ex) {

        Map<String, Object> result = new HashMap<>();
        result.put("message", ex.getMessage());
        result.put("status", HttpStatus.GONE.value());

        return result;
    }
}
