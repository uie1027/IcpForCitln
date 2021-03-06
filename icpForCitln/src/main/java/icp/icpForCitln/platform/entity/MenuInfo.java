/**
 * Project Name: icpForCitln
 * File Name: MenuInfo
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

@Data
@Document(value = "MENU_INFO")
@ToString(callSuper = true)
public class MenuInfo extends BaseEntity{
    @Field("MENU_NAME")
    private String menuName;   //菜单名称

    @Field("MENU_CODE")
    private String menuCode;   //菜单编码

    @Field("MENU_URL")
    private String menuUrl;   //菜单url

    @Field("MENU_LEVEL")
    private Integer menuLevel;   //菜单级别

    @Field("PARENT_MENU_INFO_ID")
    private String parentMenuInfoId;    //父级菜单ID
}
