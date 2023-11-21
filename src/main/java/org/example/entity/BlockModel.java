package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author : [seaflower]
 * @version : [v1.0]
 * @description : [block 模板]
 * @Time : [2023/11/21 22:33]
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BlockModel {
    private String area = "right";
    private Integer expand = 1;
    private Integer visibility = 1;
    private Integer index;
    private Integer disabled = 0; 
    private Integer step = 1;
    private String id;
    private String title;
    private String url = "";
    private List<String> properties;
    private Integer isShow = 2;
}
