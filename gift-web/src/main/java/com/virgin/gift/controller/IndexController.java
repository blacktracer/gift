package com.virgin.gift.controller;

import com.virgin.gift.bean.vo.PersonVo;
import com.virgin.gift.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class IndexController {
    @Autowired
    private IndexService indexService;

    @GetMapping("/")
    public PersonVo getIndexData(){
        PersonVo personVo = new PersonVo();
        personVo.setId(1);
        personVo.setName("hi");
        personVo.setBirthDay(new Date());
        int a = 10;
        int b = 0;
        int c = a/b;
        System.out.println(c);
        return personVo;
    }
}
