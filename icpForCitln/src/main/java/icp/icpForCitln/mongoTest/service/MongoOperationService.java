/**
 * Project Name: icpForCitln
 * File Name: MongoOperationService
 * Package Name: icp.icpForCitln.mongoTest.service
 * Date: 2019-04-11 下午 4:49
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.mongoTest.service;

import icp.icpForCitln.mongoTest.po.Grade;
import icp.icpForCitln.mongoTest.po.Student;
import icp.icpForCitln.mongoTest.vo.StudentInfo;

import java.util.List;

public interface MongoOperationService {
    String test();
    void mongoSaveStudent(Student student);
    void mongoSaveGrade(Grade grade);
    void mongoDeleteStudent(String studentName);
    void mongoUpdateStudent(Student student);
    Student mongoSingleTableSeleteStudent(String studentName);
    List<Student> mongoPagingSeleteStudent(Integer pageIndex, Integer pageSize);
    List<StudentInfo> mongoCompositeSelete();
}
