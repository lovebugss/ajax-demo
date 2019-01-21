package com.itrjp.ajax.result;/**
 * Created by renjp on 2019/1/21.
 */

/**
 * @author renjp
 * @Date 2019/1/21 10:35
 * @Version 1.0
 */
public class Result<T> {
    private String message;

    public Result(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
