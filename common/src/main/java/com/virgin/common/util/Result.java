package com.virgin.common.util;

import lombok.Data;

@Data
public class Result<T> {
    private boolean status;
    private String code;
    private String msg;
    private T data;

    public static Result fail(String code, String msg){
        Result r = new Result();
        r.setStatus(false);
        r.setCode(code);
        r.setMsg(msg);
        return r;
    }
}
