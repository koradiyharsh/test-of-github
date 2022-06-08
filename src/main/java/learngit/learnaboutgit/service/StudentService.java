package learngit.learnaboutgit.service;

import learngit.learnaboutgit.dao.StudentDao;
import learngit.learnaboutgit.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;
    public Student saveStudent(Student student)
    {
       Student savedStudent =  this.studentDao.save(student);
       return savedStudent;
    }
}
