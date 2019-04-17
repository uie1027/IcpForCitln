/**
 * Project Name: icpForCitln
 * File Name: SupplierListVO
 * Package Name: icp.icpForCitln.supplier.vo
 * Date: 19/04/17 11:09
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.supplier.vo;

import lombok.Data;
import java.util.Date;

@Data
public class SupplierListVO {
    private String companyCode;    //供应商编码
    private String companyName;    //公司名称
    private Integer frozen;    //冻结标识
    private String id;
    private String creater;
    private Date createTime;    //创建时间
    private String lastMondifier;   //最后更改人
    private Date lastModificationTime;
}
