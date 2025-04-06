package com.example.springsecutiry.controller;

import com.example.springsecutiry.dto.JoinDto;
import com.example.springsecutiry.service.JoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequiredArgsConstructor
public class JoinController {

    private final JoinService joinService;

    @PostMapping("/join")
    public String joinProcess(JoinDto joinDto) {

        joinService.joinProcess(joinDto);

        return "ok";
    }
}
