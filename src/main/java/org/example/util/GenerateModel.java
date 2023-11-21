package org.example.util;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import org.example.entity.BlockModel;
import org.example.entity.StandardModel;
import org.example.enums.ModelEnum;

/**
 * @author : [seaflower]
 * @version : [v1.0]
 * @description : [生成模板对象]
 * @Time : [2023/11/21 22:58]
 */
public class GenerateModel {
    public static void generateModel(JSONObject data) {
        // 根据枚举生成数据, 目前只有一个模板(思考怎么多模板)
        BlockModel blockModel = new BlockModel();
        // 枚举类匹配
        blockModel.setIndex(ModelEnum.Exp_Rule.getIndex());
        blockModel.setTitle(ModelEnum.Exp_Rule.getName());
        data = (JSONObject) data.put(ModelEnum.Exp_Rule.getCode(), blockModel);
    }
}
