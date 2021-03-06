package com.virgin.gift.controller;

import com.virgin.gift.bean.vo.MemberVo;
import com.virgin.gift.service.MemberService;
import com.virgin.gift.util.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private MemberService memberService;
    @Autowired
    private static  final Logger logger = LogManager.getLogger(IndexController.class);

    @GetMapping("/getMember")
    public MemberVo getMember(){
        return memberService.getMember();
    }

    @GetMapping("/addMember")
    public Result<String> addMember(){
        memberService.addMember();
        return Result.success(null);
    }
}
