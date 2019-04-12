/**
 * Project Name: icpForCitln
 * File Name: MongoOperationTest
 * Package Name: icp.icpForCitln
 * Date: 2019-04-12 上午 10:58
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln;

import icp.icpForCitln.mongoTest.po.Grade;
import icp.icpForCitln.mongoTest.po.Student;
import icp.icpForCitln.mongoTest.service.MongoOperationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoOperationTest {
    @Autowired
    private MongoOperationService mongoOperationService;

    @Test
    public void test(){
        System.out.println("test4654546464");
    }

    @Test
    public void saveStudentTest(){
        Student student = new Student();
        student.setName("小明");
        student.setAge(18);
        student.setClassId("1");
        mongoOperationService.mongoSaveStudent(student);

        student.setName("小红");
        student.setAge(17);
        student.setClassId("2");
        mongoOperationService.mongoSaveStudent(student);

        student.setName("小花");
        student.setAge(12);
        student.setClassId("1");
        mongoOperationService.mongoSaveStudent(student);

        student.setName("操作");
        student.setAge(12);
        student.setClassId("1");
        mongoOperationService.mongoSaveStudent(student);
    }

    @Test
    public void saveGradeTest(){
        Grade grade = new Grade();
        grade.setId("1");
        grade.setName("一年级");
        mongoOperationService.mongoSaveGrade(grade);

        grade.setId("2");
        grade.setName("二年级");
        mongoOperationService.mongoSaveGrade(grade);
    }

    @Test
    public void deleteStudentTest(){
        mongoOperationService.mongoDeleteStudent("操作");
    }

    @Test
    public void updateStudentTest(){
        Student student = new Student();
        student.setName("操作");
        student.setAge(99);
        student.setClassId("88");
        mongoOperationService.mongoUpdateStudent(student);
    }

    @Test
    public void mongoSingleTableSeleteStudentTest(){
        System.out.println("\033[31;4m" + mongoOperationService.mongoSingleTableSeleteStudent("操作") + "\033[0m");
    }

    @Test
    public void mongoPagingSeleteStudentTest(){
        System.out.println("\033[31;4m" + mongoOperationService.mongoPagingSeleteStudent(1, 2) + "\033[0m");
    }

    @Test
    public void mongoCompositeSeleteTest(){
        System.out.println(mongoOperationService.mongoCompositeSelete().size());
        System.out.println(mongoOperationService.mongoCompositeSelete());
    }
}
