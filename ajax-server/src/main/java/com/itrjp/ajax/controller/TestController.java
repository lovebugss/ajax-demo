package com.itrjp.ajax.controller;/**
 * Created by renjp on 2019/1/21.
 */

import com.itrjp.ajax.bean.User;
import com.itrjp.ajax.result.Result;
import org.springframework.web.bind.annotation.*;

/**
 * @author renjp
 * @Date 2019/1/21 10:34
 * @Version 1.0
 */
@RestController
// 注意：allowCredentials默认为false，maxAge 默认为1800
@CrossOrigin(allowCredentials="true")
public class TestController {
    @GetMapping("get1")
    public Result get() {
        return new Result("hello json");
    }

    @PostMapping("post")
    public Result post(@RequestBody User user) {

        return new Result("hello " + user.getUsername());
    }

    @GetMapping("getCookie")
    public Result getCookie(@CookieValue("cookie1") String cookie1) {
        return new Result("hello " + cookie1);
    }
}
