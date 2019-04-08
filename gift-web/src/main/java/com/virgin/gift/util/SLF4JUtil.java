package com.virgin.gift.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JUtil {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(SLF4JUtil.class);
        System.out.println(logger);
        logger.info("ok");

    }
}
