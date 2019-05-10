/**
 * Project Name: icpForCitln
 * File Name: MenuInfoVO
 * Package Name: icp.icpForCitln.platform.vo
 * Date: 2019/5/10 16:53
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.vo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(value = "MENU_INFO")
public class MenuInfoVO {
    @Id
    private String id;  //三级菜单ID

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
