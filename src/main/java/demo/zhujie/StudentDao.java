package demo.zhujie;

import java.util.List;

public interface StudentDao {
    void insertStudent();

    //	void findStudentByName(String name);
    List<Student> findAll();
}
