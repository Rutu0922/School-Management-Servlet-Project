package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {
StudentDao studentDao=new StudentDao();
	
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}
	
	
	public Student updateStudentName(int id,String name) {
		return studentDao.updateStudentNameById(id, name);
	}
	
	public Student updateStudentEmail(int id,String email) {
		return studentDao.updateStudentEmailById(id, email);
	}
	
	public Student updateStudentDobById(int id, String dob) {
	return studentDao.updateStudentDobById(id, dob);
	
	}
	
	public Student deleteStudentById(int id) {
		return studentDao.deleteStudentById(id);
	}
	
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}
	
	public List<Student> getAllStudent() {
		return studentDao.getAllStudent();
	}
}
