package com.virgin.gift.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class QiniuService {
    @Value("${accessKey}")
    private String accessKey;

    public String getAccessKey(){
        return  accessKey;
    }
}
