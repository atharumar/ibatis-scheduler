package com.blah.blue.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.blah.blue.domain.Student;
@Mapper
public interface StudentMapper {

	@Select("SELECT * FROM student WHERE id = #{id}")
	public Student findById(long id);
	
	
}
