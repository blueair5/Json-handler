package org.example.util;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;

/**
 * @author : [seaflower]
 * @version : [v1.0]
 * @description : [合法性校验]
 * @Time : [2023/11/20 23:20]
 */
public class CheckValidUtil {
    /**
     * region 合法性校验
     *  0. 必须含有缺失字段信息
     *  1. String-Jaon 必须合法
     *  2. id 必须和 String-Json 的相对应
     * @return 如果合法返回一个 JsonObject 
     */
    public static JSONObject checkValid(String[] part1, String part2) throws Exception {
        if (part1.length != 3 || StringUtils.isEmpty(part2)) {
            throw new Exception("请检查参数");
        }

        // 2 
        if (!part2.startsWith("{") && part2.endsWith("}")) {
            throw new Exception("json 不合法");
        }

        // 解析成 Json
        JSONObject data = JSON.parseObject(part2);
        
        // 校验 3
//        if (!part1[1].equals((String)data.get("schemaId"))) {
//           throw new Exception("schemaId 不符合，请检查"); 
//        }

        return data;
    }
}
