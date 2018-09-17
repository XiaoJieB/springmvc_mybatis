package com.luobo.controller;

import com.luobo.po.ItemCustom;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonTest {

    @RequestMapping("/jsonTest")
    public String jsonTest() {

        return "/json/jsonTest";
    }

    @RequestMapping("/requestJson")
    public @ResponseBody ItemCustom test(ItemCustom itemCustom) {

        return itemCustom;
    }

    @RequestMapping("/responseJson")
    public @ResponseBody ItemCustom responseJson(ItemCustom itemCustom) {

        return itemCustom;
    }
}
