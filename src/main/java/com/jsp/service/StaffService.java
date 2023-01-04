package com.jsp.service;

import java.util.List;

import com.jsp.dao.StaffDao;
import com.jsp.dto.Staff;

public class StaffService {

	StaffDao staffDao = new StaffDao();

	public Staff saveStaff(Staff staff) {
		return staffDao.saveStaff(staff);
	}

	public Staff deleteStaff(int id) {
		return staffDao.deleteStaff(id);
	}

	public Staff updateStaffName(int id, String name) {
		return staffDao.updateStaffName(id, name);
	}

	public Staff updateStaffEmail(int id, String email) {
		return staffDao.updateStaffEmail(id, email);
	}

	public Staff updateStaffJob(int id, String job) {
		return staffDao.updateStaffJob(id, job);
	}

	public Staff getStaff(int id) {
		return staffDao.getStaff(id);
	}

	public List<Staff> getAllStaffs() {
		return staffDao.getAllStaffs();
	}
}
