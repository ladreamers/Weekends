package com.yourname.dao;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yourname.entity.Student;


@Repository
@Qualifier("postgresData")
public class PostgresStudentDaoImpl implements StudentDao {

	@Override
	public Collection<Student> getAllStudents() {
		return new ArrayList<Student>() {
			{
				add(new Student(1, "Mongo", "Sports"));
			}
		};
	}
	@Override
	public Student getStudentById(int id){
		return null;
	}
	
	@Override
	public void removeStudentById(int id) {}
	
	@Override
	public void updateStudent(Student student) {}
	
	@Override
	public void insertStudentToDB(Student student) {}
	
}
