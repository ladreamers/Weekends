package com.yourname.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yourname.entity.Student;

@Repository
@Qualifier("fakeData")
public class FakeStudentDaoImpl implements StudentDao {
	
	private static Map<Integer, Student> students;
	
	static {
		students = new HashMap<Integer, Student>(){
			{
				put(1, new Student(1, "Said", "Math"));
				put(2, new Student(2, "Pam", "Finance"));
				put(3, new Student(3, "Alex", "Computer Science"));
			}
		};
	}
	
	public Collection<Student> getAllStudents() {
		return this.students.values();
		
	}
	
	public  Student getStudentById(int id) {
		return this.students.get(id);
	}
	
	public void removeStudentById(int id) {
		this.students.remove(id);
	}
	
	public void updateStudent(Student student) {
		Student s = students.get(student.getId());
		s.setCourse(student.getCourse());
		s.setName(student.getName());
		students.put(student.getId(), student);
	}
	
	public void insertStudentToDB(Student student) {
		this.students.put(student.getId(), student);
	}
	
}
