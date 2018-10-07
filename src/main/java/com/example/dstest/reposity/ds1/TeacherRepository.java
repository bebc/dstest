package com.example.dstest.reposity.ds1;

import com.example.dstest.dao.ds1.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


public interface TeacherRepository extends JpaRepository<Teacher,Long> {
    Teacher findByAge(String age);
}
