package com.virgin.gift.bean.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class PersonVo implements Serializable {
    private static final long serialVersionUID = -6109887786224552457L;
    private Integer id;
    @JSONField(name = "f_name")
    private String name;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date birthDay;
}
