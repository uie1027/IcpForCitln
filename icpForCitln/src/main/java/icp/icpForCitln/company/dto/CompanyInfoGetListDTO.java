/**
 * Project Name: icpForCitln
 * File Name: CompanyInfoGetListDTO
 * Package Name: icp.icpForCitln.company.dto
 * Date: 2019/5/9 14:33
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.company.dto;

import lombok.Data;

@Data
public class CompanyInfoGetListDTO {        //公司列表查询条件
    private Integer pageIndex;      //页码

    private Integer pageSize;       //每页条数

    private String companyName;     //公司名称

    private String companyCode;     //公司编码
}
