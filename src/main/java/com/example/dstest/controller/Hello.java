package com.example.dstest.controller;

import com.example.dstest.dao.ds1.Teacher;
import com.example.dstest.dao.ds2.Student;
import com.example.dstest.reposity.ds1.TeacherRepository;
import com.example.dstest.reposity.ds2.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/hello")
    @Transactional
    public void test(){
        Teacher teacher = new Teacher();
        teacher.setAge("12");
        teacher.setName("aaa");
        teacherRepository.save(teacher);
        Student student = new Student();
        student.setAge("13");
        student.setName("student");
        studentRepository.save(student);

    }
}
