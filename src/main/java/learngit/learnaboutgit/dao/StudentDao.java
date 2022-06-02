package learngit.learnaboutgit.dao;

import learngit.learnaboutgit.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    Map<Long , Student> studentMap  = new HashMap<>();


    public Student save(Student student)
    {
        this.studentMap.put(student.getID() , student);
        return studentMap.get(student.getID());
    }
}
