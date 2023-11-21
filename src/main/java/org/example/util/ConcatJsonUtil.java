package org.example.util;

import com.alibaba.fastjson2.JSONObject;

/**
 * @author : [seaflower]
 * @version : [v1.0]
 * @description : [拼接 Json]
 * @Time : [2023/11/21 0:05]
 */
public class ConcatJsonUtil {
    public static void ConcatJson(String[] part1, JSONObject data) {
        // 获取缺失的字段, 利用模板拼接这个字段的模板
        String concatParam = part1[2];
        
        // 首先遍历 JsonData，看是否有错误的数据, 这里要有错误校验
        
        // 可以返回一个，想办法插入然后拼接模板
        GenerateModel.generateModel(data);
        
        // 返回生成 sql 
        
    }
}
