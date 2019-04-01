package com.virgin.gift.service.impl;

import com.virgin.gift.service.IndexService;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {
    /**
     * 获取首页数据
     * @return
     */
    public String getIndexData(){
        return "indexData";
    }
}
