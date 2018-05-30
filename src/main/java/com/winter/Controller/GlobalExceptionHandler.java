package com.winter.Controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String, Object> exceptionHandle()
    {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("error","程序出现异常");
        map.put("200","Sorry!!!");
        return  map;
    }
}

