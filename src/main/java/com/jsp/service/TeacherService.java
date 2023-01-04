package com.jsp.service;

import java.util.List;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

public class TeacherService {
	TeacherDao teacherDao = new TeacherDao();

	public Teacher saveTeacher(Teacher teacher) {
		return teacherDao.saveTeacher(teacher);
	}

	public Teacher deleteTeacher(int id) {
		return teacherDao.deleteTeacher(id);
	}

	public Teacher updateTeacherName(int id, String name) {
		return teacherDao.updateTeacherName(id, name);
	}

	public Teacher updateTeacherSubject(int id, String subject) {
		return teacherDao.updateTeacherSubject(id, subject);
	}

	public Teacher updateTeacherCno(int id, String cno) {
		return teacherDao.updateTeacherCno(id, cno);
	}

	public Teacher getTeacher(int id) {
		return teacherDao.getTeacher(id);
	}

	public List<Teacher> getAllTeachers() {
		return teacherDao.getAllTeachers();
	}
}
