/**
 * Project Name: icpForCitln
 * File Name: SystemProductAttribuitAndValueView
 * Package Name: icp.icpForCitln.sysconf.view
 * Date: 2019/5/16 17:20
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.view;

import icp.icpForCitln.sysconf.vo.SystemProductAttribuitValueVO;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "SYSTEM_PRODUCT_ATTRIBUIT_AND_VALUE") //系统产品属性和属性值视图
public class SystemProductAttribuitAndValueView {
    @Id
    private String id;  // ID

    @Field("SYSTEM_PRODUCT_ATTRIBUIT_CODE")
    private String systemProductAttribuitCode; //产品属性编码

    @Field("SYSTEM_PRODUCT_ATTRIBUIT_TYPE")
    private Integer systemProductAttribuitType;  //产品属性类型   1定性 2定量

    @Field("SYSTEM_PRODUCT_ATTRIBUIT_NAME")
    private String systemProductAttribuitName;  //产品属性名称

    @Field("SYSTEM_PRODUCT_ATTRIBUIT_VALUES")
    private List<SystemProductAttribuitValueVO> systemProductAttribuitValueVOList;  //产品属性值list
}
