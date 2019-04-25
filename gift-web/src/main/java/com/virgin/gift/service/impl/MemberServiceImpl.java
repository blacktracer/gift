package com.virgin.gift.service.impl;

import com.virgin.gift.bean.vo.MemberVo;
import com.virgin.gift.mapper.MemberMapper;
import com.virgin.gift.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;

    public MemberVo getMember(){
        return memberMapper.getMember();
    }

    @Transactional
    public int addMember(){
        int addCount = memberMapper.addMember();
        int c = 1/0;
        return addCount;
    }
}
