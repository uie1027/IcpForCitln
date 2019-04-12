/**
 * Project Name: icpForCitln
 * File Name: Student
 * Package Name: icp.icpForCitln.mongoTest.eneity
 * Date: 2019-04-11 下午 4:45
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.mongoTest.eneity;

import lombok.Data;

@Data
public class Student {
    private String name;
    private Integer age;
    private String classId;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classId='" + classId + '\'' +
                '}';
    }
}
