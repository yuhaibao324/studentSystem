package com.dao;

import org.springframework.stereotype.Repository;

import com.entity.Student;

@Repository
public interface StudentMapper {
		
	//查询一条信息
	public Student selectById(int id);

}
