/**
 * Project Name: icpForCitln
 * File Name: OperationHistoryInfo
 * Package Name: icp.icpForCitln.common.enetity
 * Date: 2019-04-29 下午 4:11
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.common.enetity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(collection = "OPERATION_HISTORY_INFO") //更新历史表
public class OperationHistoryInfo {
    @Field("TABLE_NAME")
    private String tableName;   //表名

    @Field("OLD_ID")
    private String oldId;   //旧ID

    @Field("NEW_ID")
    private String newId;   //新ID

    @Field("OLD_VALUE")
    private String oldValue;    //旧数据

    @Field("NEW_VALUE")
    private String newValue;    //新数据

    @Field("CODE")
    private String code;    //编码

    @Field("TYPE")
    private Integer type;   //更新类型

    @Field("CREATER")
    private String creater;     //创建人

    @Field("CREATE_TIME")
    private Date createTime;    //创建时间
}
