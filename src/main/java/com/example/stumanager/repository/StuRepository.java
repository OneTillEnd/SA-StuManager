package com.example.stumanager.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import com.example.stumanager.model.Student;
import org.springframework.transaction.annotation.Transactional;

public interface StuRepository extends Repository<Student, Integer> {

	@Query("SELECT DISTINCT student FROM Student student WHERE student.name LIKE :name%")
	@Transactional(readOnly = true)
	Collection<Student> findByName(@Param("name") String name);

	@Query("SELECT DISTINCT student FROM Student student WHERE student.id =:id")
	@Transactional(readOnly = true)
	Student findById(@Param("id") Integer id);

	void save(Student student);

	void delete(Student student);

}
