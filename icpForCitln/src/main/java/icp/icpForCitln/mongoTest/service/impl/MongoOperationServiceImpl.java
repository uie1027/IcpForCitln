/**
 * Project Name: icpForCitln
 * File Name: MongoOperationServiceImpl
 * Package Name: icp.icpForCitln.mongoTest.service.impl
 * Date: 2019-04-11 下午 4:50
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.mongoTest.service.impl;

import icp.icpForCitln.mongoTest.dao.BasicsOperationDAO;
import icp.icpForCitln.mongoTest.po.Grade;
import icp.icpForCitln.mongoTest.po.Student;
import icp.icpForCitln.mongoTest.vo.StudentInfo;
import icp.icpForCitln.mongoTest.service.MongoOperationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MongoOperationServiceImpl implements MongoOperationService {
    @Resource
    private BasicsOperationDAO basicsOperationDAO;

    @Override
    public String test() {
        return basicsOperationDAO.test();
    }

    @Override
    public void mongoSaveStudent(Student student) {
        basicsOperationDAO.mongoSaveStudent(student);
    }

    @Override
    public void mongoSaveGrade(Grade grade) {
        basicsOperationDAO.mongoSaveGrade(grade);
    }

    @Override
    public void mongoDeleteStudent(String studentName) {
        basicsOperationDAO.mongoDeleteStudent(studentName);
    }

    @Override
    public void mongoUpdateStudent(Student student) {
        basicsOperationDAO.mongoUpdateStudent(student);
    }

    @Override
    public Student mongoSingleTableSeleteStudent(String studentName) {
        return basicsOperationDAO.mongoSingleTableSeleteStudent(studentName);
    }

    @Override
    public List<Student> mongoPagingSeleteStudent(Integer pageIndex, Integer pageSize) {
        return basicsOperationDAO.mongoPagingSeleteStudent(pageIndex, pageSize);
    }

    @Override
    public List<StudentInfo> mongoCompositeSelete() {
        return basicsOperationDAO.mongoCompositeSelete();
    }
}