package org.example;

import com.alibaba.fastjson2.JSONObject;
import org.example.util.CheckValidUtil;
import org.example.util.FileReaderUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : [seaflower]
 * @version : [v1.0]
 * @description : [生成文件的主类]
 * @Time : [2023/11/20 22:56]
 */
public class HandlerJaon {
    public static void main(String[] args) throws Exception {
        // 读取文件
        String filePath = "D://labour.txt";
        String fileContents = FileReaderUtil.readFile(filePath);
        String[] blocks = fileContents.split("<<");
        
        for (int i = 0; i < blocks.length; i++) {
            String[] parts = blocks[i].split(">>");
            List<String> partList = Arrays.stream(parts).map((String e) -> e.trim()).collect(Collectors.toList());
            
            // 总共两部分，第一部分可以检测出id，缺失字段等信息
            String[] part1 = partList.get(0).split("-");
            List<String> part1String = Arrays.stream(part1).map(e -> e.trim()).collect(Collectors.toList());
            String part2 = partList.get(1).trim();

            JSONObject data = CheckValidUtil.checkValid(part1, part2);
            // 为 Json data 拼接数据
            
            
        }

        System.out.println(blocks[0]);
    }
}
