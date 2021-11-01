package com.frank.springboot.service;

import com.frank.springboot.model.Student;
//2021-11-01 15:31:47提交测试
//2021-11-01 15:50:05提交测试2
public interface StudentService {
    /**
     * 根据学生id查询详情
     * @param id
     * @return
     */
    Student queryStudentById(Integer id);

    /**
     * 将值存入redis
     * @param id
     * @param object
     */
    void putRedis(Integer id, Object object);

    /**
     * 根据id从redis查询学生详情
     * @param id
     * @return
     */
    Student queryStudentByRedis(Integer id);


    /**
     * 查询学生总数
     * @return
     */
    Integer queryStudentCount();
}
