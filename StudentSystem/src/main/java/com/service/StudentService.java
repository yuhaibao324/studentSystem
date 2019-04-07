package com.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentMapper;
import com.entity.Student;

@Service
public class StudentService {

	@Autowired
	private StudentMapper studentMapper;

	
	// 测试
	// 查询一条信息
	public Student select(int id) {
		return studentMapper.selectById(id);
	}

	/*
	 * public void save(Student student) { //如果id为空则进行插入，否则进行跟新 if(student.getId()
	 * == null) { mybatisDao.save("StudentMapper.insert" ,student); } else
	 * mybatisDao.save("StudentMapper.update" ,student);
	 * 
	 * }
	 */
	/*
	 * //删除信息 public void delete(Serializable id) {
	 * mybatisDao.delete("StudentMapper.delete", id); }
	 */

}
