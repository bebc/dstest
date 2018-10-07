import com.example.dstest.DemoApplication;
import com.example.dstest.dao.ds1.Teacher;
import com.example.dstest.dao.ds2.Student;
import com.example.dstest.reposity.ds1.TeacherRepository;
import com.example.dstest.reposity.ds2.StudentRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=DemoApplication.class)

public class DemoApplicationTests {

//    @Autowired
//    @Qualifier("primaryJdbcTemplate")
//    protected JdbcTemplate jdbcTemplate1;
//
//    @Autowired
//    @Qualifier("secondaryJdbcTemplate")
//    protected JdbcTemplate jdbcTemplate2;

//    @Before
//    public void setUp() {
//        jdbcTemplate1.update("DELETE  FROM  user ");
//        jdbcTemplate2.update("DELETE  FROM  user ");
//    }
    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Test
    @Transactional
    public void test() throws Exception {

//        // 往第一个数据源中插入两条数据
//        jdbcTemplate1.update("insert into user(id,name,age) values(?, ?, ?)", 1, "aaa", 20);
//        jdbcTemplate1.update("insert into user(id,name,age) values(?, ?, ?)", 2, "bbb", 30);
//
//        // 往第二个数据源中插入一条数据，若插入的是第一个数据源，则会主键冲突报错
//        jdbcTemplate2.update("insert into user(id,name,age) values(?, ?, ?)", 1, "aaa", 20);
//
//        // 查一下第一个数据源中是否有两条数据，验证插入是否成功
//        Assert.assertEquals("2", jdbcTemplate1.queryForObject("select count(1) from user", String.class));
//
//        // 查一下第一个数据源中是否有两条数据，验证插入是否成功
//        Assert.assertEquals("1", jdbcTemplate2.queryForObject("select count(1) from user", String.class));
        Teacher teacher = new Teacher();
        teacher.setAge("12");
        teacher.setName("aaa");
        teacherRepository.save(teacher);
        Student student = new Student();
        student.setAge("13");
        student.setName("student");
        studentRepository.save(student);


    }

    @Test
    @Transactional
    @Rollback(false)
    public void test1() throws Exception {

//        // 往第一个数据源中插入两条数据
//        jdbcTemplate1.update("insert into user(id,name,age) values(?, ?, ?)", 1, "aaa", 20);
//        jdbcTemplate1.update("insert into user(id,name,age) values(?, ?, ?)", 2, "bbb", 30);
//
//        // 往第二个数据源中插入一条数据，若插入的是第一个数据源，则会主键冲突报错
//        jdbcTemplate2.update("insert into user(id,name,age) values(?, ?, ?)", 1, "aaa", 20);
//
//        // 查一下第一个数据源中是否有两条数据，验证插入是否成功
//        Assert.assertEquals("2", jdbcTemplate1.queryForObject("select count(1) from user", String.class));
//
//        // 查一下第一个数据源中是否有两条数据，验证插入是否成功
//        Assert.assertEquals("1", jdbcTemplate2.queryForObject("select count(1) from user", String.class));
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