/**
 * Project Name: icpForCitln
 * File Name: StudentInfo
 * Package Name: icp.icpForCitln.mongoTest.eneity
 * Date: 2019-04-11 下午 4:46
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.mongoTest.vo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class StudentInfo {
    private String name;
    private Integer age;
    @Field("_id")
    private String id;
    @Field("grade_info_id")
    private String id2;
}
