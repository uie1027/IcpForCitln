/**
 * Project Name: icpForCitln
 * File Name: SystemDictionaryInfo
 * Package Name: icp.icpForCitln.sysconf.entity
 * Date: 19/04/29 13:20
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.sysconf.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "SYSTEM_DICTIONARY_INFO") //系统字典表
@ToString(callSuper = true)
public class SystemDictionaryInfo extends BaseEntity {
    @Field("SYSTEM_DICTIONARY_CODE")
    private String systemDictionaryCode; //字典编码

    @Field("SYSTEM_DICTIONARY_CATEGORY")
    private Integer systemDictionaryCategory;  //字典种类

    @Field("SYSTEM_DICTIONARY_VALUE")
    private String systemDictionaryValue;  //字典内容


    @Field("SYSTEM_DICTIONARY_DESCRIPTION")
    private String systemDictionaryDescription;  //字典内容

    public String readField(){
        return "systemDictionaryCode";
    }
}
