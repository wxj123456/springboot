package com.wang.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/swagger")
public class SwaggerController {
    @ApiOperation(value = "获取用户信息")
    @ApiImplicitParam(name = "id", value = "用戶id", required = true, dataType = "String")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Map<String, String> getInfo(@PathVariable String id) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "lison");
        map.put("age", "38");
        return map;

    }
}
