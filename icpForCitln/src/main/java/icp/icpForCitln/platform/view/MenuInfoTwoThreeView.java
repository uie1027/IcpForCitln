/**
 * Project Name: icpForCitln
 * File Name: MenuInfoTwoThreeView
 * Package Name: icp.icpForCitln.platform.view
 * Date: 2019/5/10 15:59
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.platform.view;

import icp.icpForCitln.platform.vo.MenuInfoVO;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "MENU_INFO_TWO_THREE")       //二级三级菜单
public class MenuInfoTwoThreeView{
    @Id
    private String id;      //二级菜单ID

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

    @Field("MENU_INFO_THREE")
    private List<MenuInfoVO> menuInfoThreeList;    //三级菜单列表
}
