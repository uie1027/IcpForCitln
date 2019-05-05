/**
 * Project Name: icpForCitln
 * File Name: PlantformMailDisplay
 * Package Name: icp.icpForCitln.platform.entity
 * Date: 2019/4/29 17:19
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.platform.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Data
@Document(value = "PLANTFORM_MAIL_DISPLAY")     //平台商城展示表
@ToString(callSuper = true)
public class PlantformMailDisplay extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -7898194272883238670L;

    private static final String OBJECT_KEY = "PLANTFORM_MAIL_DISPLAY";

    @Field("MAIL_DISPLAY_CODE")
    private String mailDisplayCode;    //商城展示编码

    @Field("MAIL_NAME")
    private String mailName;    //商城名称

    public String redisObjectKey() {      //Redis 存储块名
        return OBJECT_KEY;
    }

    public String redisKey() {        //获取 Redis 存储键名
        return super.getId();
    }
}
