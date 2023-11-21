package org.example;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import org.example.entity.BlockModel;
import org.example.entity.StandardModel;
import org.example.util.GenerateModel;

/**
 * @author : [seaflower]
 * @version : [v1.0]
 * @description : [一句话描述该类的功能]
 * @Time : [2023/11/21 22:30]
 */
public class Test {
    public static void main(String[] args) {
        StandardModel standardModel = new StandardModel();
        BlockModel blockModel = new BlockModel();
        blockModel.setArea("right");
        blockModel.setExpand(1);
        standardModel.setBlockMode(blockModel);

        JSONObject json = (JSONObject) JSON.toJSON(standardModel);
        System.out.println(json);
        
        String text = JSON.toJSONString(standardModel);
        System.out.println(text);

//        System.out.println(GenerateModel.generateModel(null));
    }
}
