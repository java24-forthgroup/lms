package com.woniuxy.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by tianwenkai on 18:02 2020-04-21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVO implements Serializable {
    private Integer status;     // 响应码
    private String message;     // 响应简要信息
    private Object data;        // 响应的主体数据

    public ResultVO(Integer status, String message) {
        this.status = status;
        this.message = message;
    }
}