package org.example.enums;

/**
 * @author : [seaflower]
 * @version : [v1.0]
 * @description : [模板对应的块名和值]
 * @Time : [2023/11/21 22:51]
 */
public enum ModelEnum {
    // 制度说明
    Exp_Rule("制度说明","expRules",8);
    

    private String name;
    private String code;
    private Integer index;
    
    ModelEnum(String name, String code, Integer index) {
        this.name = name;
        this.code = code;
        this.index = index;
    }
    
    public String getName() {
        return name;
    }
    
    public String getCode() {
        return code;
    }
    
    public Integer getIndex() {
        return index;
    }
        
}
