package com.neusoft.oa.hr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.oa.hr.model.DepartmentModel;


@Mapper
public interface IDepartmentMapper {

	public void insert(DepartmentModel dm) throws Exception;
	public void update(DepartmentModel dm) throws Exception;
	public void delete(DepartmentModel dm) throws Exception;
	
	public List<DepartmentModel> selectByAllWithPage(@Param("start") int start, @Param("rows") int rows) throws Exception;
	public int selectCountByAll() throws Exception;
	
	public List<DepartmentModel> selectByAll() throws Exception;
	public DepartmentModel selectByNum(int num) throws Exception;
	public DepartmentModel selectByNumWithEmployees(int num) throws Exception;
}
