/**
 * Project Name: icpForCitln
 * File Name: ProductGroupInfoAddDTO
 * Package Name: icp.icpForCitln.productGroup.dto
 * Date: 2019-05-05 下午 2:28
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.productGroup.dto;

import lombok.Data;

@Data
public class ProductGroupInfoAddDTO {
    private String	productGroupName;     //产品组名称

    private String	plantformFirstDirectory;      //系统一级目录

    private String	plantformSecondDirectory;     //系统二级目录

    private String[] productGroupSystemAttributeIdList;     //产品属性 id列表

    private String	systemBrandInfoId;   //品牌ID

    //private String	productGroupPicture;  //图片

    private String[] productGroupMailDisplayIdList;     //商城展示 id列表

    private String	productGroupDetailedInformation; //详细信息
}
