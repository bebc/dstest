package com.example.dstest.reposity.ds2;

import com.example.dstest.dao.ds2.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends JpaRepository<Student,Long>{
    Student findByAge(String age);
}
