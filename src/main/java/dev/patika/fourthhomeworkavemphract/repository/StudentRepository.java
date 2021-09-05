package dev.patika.fourthhomeworkavemphract.repository;

import dev.patika.fourthhomeworkavemphract.model.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

    @Query("DELETE FROM Student AS s WHERE s.name= ?1")
    @Modifying
    void deleteByName(String name);

    @Query("SELECT s FROM Student AS s WHERE s.name= ?1")
    Student findByName(String name);

    @Query("SELECT s.address,COUNT(s) FROM Student AS s GROUP BY s.address")
    List<?> groupByAddress();

    @Query("SELECT s.gender,COUNT(s) FROM Student AS s GROUP BY s.gender")
    List<?> groupByGender();

    @Query("SELECT " +
            "CASE WHEN COUNT(s)>0 THEN TRUE ELSE FALSE END " +
            "FROM Student AS s " +
            "WHERE s.id = ?1")
    boolean isIdExists(int id);

}
