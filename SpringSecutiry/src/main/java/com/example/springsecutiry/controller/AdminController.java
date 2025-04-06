package com.example.springsecutiry.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody //Web이 아닌 특정한 문자열 Data 응답하도록 ResponseBody를 사용
public class AdminController {

    @GetMapping("/admin")
    public String adminP() {

        return "Admin Controller";
    }
}
