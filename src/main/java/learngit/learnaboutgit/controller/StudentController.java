package learngit.learnaboutgit.controller;

import learngit.learnaboutgit.entity.Student;
import learngit.learnaboutgit.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    private static  final Logger studentLogger  = LoggerFactory.getLogger(StudentController.class);

    @PostMapping("/save")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student)
    {
        studentLogger.info(student.toString());
        Student savedStudent =   this.studentService.saveStudent(student);
        return ResponseEntity.ok().body(savedStudent);
    }
}
