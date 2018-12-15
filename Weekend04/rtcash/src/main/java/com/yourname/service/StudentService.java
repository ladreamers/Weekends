package com.yourname.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.yourname.dao.StudentDao;
import com.yourname.entity.Student;


@Service
public class StudentService {

	
	@Autowired
	@Qualifier("fakeData")       //Since there are two impl classes with same method names.
	private StudentDao studentDao;
		
	
	public Collection<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}
	
	public  Student getStudentById(int id) {
		return this.studentDao.getStudentById(id);
	}
	
	public void removeStudentById(int id) {
		this.studentDao.removeStudentById(id);
	}
	
	
	public void updateStudent(Student student) {
		this.studentDao.updateStudent(student);
	}
	
	
	public void insertStudent(Student student) {
		this.studentDao.insertStudentToDB(student);
	}
	
	

//	@Autowired
//	MyTableRepository myTableRepository;
//	// And to call the method -
//	myTableRepository.inOnlyTest(inParam1);

	
}
