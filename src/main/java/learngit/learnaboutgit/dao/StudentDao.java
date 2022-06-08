package learngit.learnaboutgit.dao;

import learngit.learnaboutgit.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public interface StudentDao extends JpaRepository<Student ,Long> {
}
