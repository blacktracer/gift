package com.virgin.gift.service.impl;

import com.virgin.gift.bean.vo.MemberVo;
import com.virgin.gift.mapper.MemberMapper;
import com.virgin.gift.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;

    public MemberVo getMember(){
        return memberMapper.getMember();
    }
}
