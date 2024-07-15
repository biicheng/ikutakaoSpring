package com.ikutakao.ikutakao.controller;

import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Controller;
// 載入以下兩個Library
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 
import com.ikutakao.ikutakao.classe.repbody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
// 20240621 add
// import org.junit.Test;
// import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;
// import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

// 標記為Restful API Controller
// @RestController
@Controller
@RequestMapping(path = "/")
public class HelloController {
    @GetMapping("")
    // @ResponseBody
    private String getWeb(HttpServletRequest request, HttpSession session) {
        System.out.println("./");
        String str;
        str = "大腳走高雄";
        session.setAttribute("name", "Nick");
        session.setAttribute("titleName", "大腳走高雄");
        return "index";
    }

    // 標記HTTP Get方法，並設定URL的路由
    // @RequestMapping("/hello")
    @GetMapping({ "/hello" })
    public String Hello() {
        System.out.println("Log txt: Hello work!");
        // 回傳Hello World字串
        return "hello";
        // return "Hello World";
    }

    @GetMapping("/repbody")
    public repbody repbody() {
        // private Object Obj;
        return new repbody("0000", "Success", "Hello World");
    }

    @GetMapping("/versioncode")
    public String vercode() {
        // String version = SpringVersion.getVersion();
        // String version1 = SpringBootVersion.getVersion();
        return "Spring Version:" + SpringBootVersion.getVersion();
    }

}
