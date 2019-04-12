/**
 * Project Name: icpForCitln
 * File Name: BasicsOperationDAOImpl
 * Package Name: icp.icpForCitln.mongoTest.dao.impl
 * Date: 2019-04-11 下午 4:51
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.mongoTest.dao.impl;

import icp.icpForCitln.mongoTest.dao.BasicsOperationDAO;
import icp.icpForCitln.mongoTest.po.Grade;
import icp.icpForCitln.mongoTest.po.Student;
import icp.icpForCitln.mongoTest.vo.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BasicsOperationDAOImpl implements BasicsOperationDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public String test() {
        return "dao4465";
    }

    @Override
    public void mongoSaveStudent(Student student) {
        mongoTemplate.save(student);
    }

    @Override
    public void mongoSaveGrade(Grade grade) {
        mongoTemplate.save(grade);
    }

    @Override
    public void mongoDeleteStudent(String studentName) {
        Query query = new Query(Criteria.where("name").is(studentName));
        mongoTemplate.remove(query, Student.class);
    }

    @Override
    public void mongoUpdateStudent(Student student) {
        Query query = new Query(Criteria.where("name").is(student.getName()).and("age").is(12));
        Update update = new Update().set("age", student.getAge()).set("classId", student.getClassId());
        mongoTemplate.updateFirst(query, update, Student.class);
    }

    @Override
    public Student mongoSingleTableSeleteStudent(String studentName) {
        Query query = new Query(Criteria.where("name").is(studentName));
        return mongoTemplate.findOne(query, Student.class);
    }

    @Override
    public List<Student> mongoPagingSeleteStudent(Integer pageIndex, Integer pageSize) {
        Query query = new Query();
        //Pageable pageable = new PageRequest(pageIndex ,pageSize);
        Pageable pageable = PageRequest.of(pageIndex, pageSize);
        query.with(pageable);
        return mongoTemplate.find(query, Student.class);
    }

    @Override
    public List<StudentInfo> mongoCompositeSelete() {
        LookupOperation lookupOperation = LookupOperation.newLookup().from("grade").localField("classId").foreignField("_id").as("grade_info");
        Aggregation aggregation = Aggregation.newAggregation(
                lookupOperation,
                Aggregation.project("name", "age", "_id").andExpression("grade_info._id").as("grade_info_id"),
                Aggregation.match(Criteria.where("age").gt(13))
        );

        return mongoTemplate.aggregate(aggregation, "student", StudentInfo.class).getMappedResults();
    }
}

