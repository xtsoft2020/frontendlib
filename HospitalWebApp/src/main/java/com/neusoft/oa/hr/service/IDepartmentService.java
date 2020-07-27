package com.neusoft.oa.hr.service;

import java.util.List;

import com.neusoft.oa.hr.model.DepartmentModel;



public interface IDepartmentService {
	public void add(DepartmentModel dm) throws Exception;
	public void modify(DepartmentModel dm) throws Exception;
	public void delete(DepartmentModel dm) throws Exception;
	
	public List<DepartmentModel> getAllWithPage(int rows, int page) throws Exception;
	public int getCountByAll() throws Exception;
	public int getPageCount(int rows) throws Exception; 
	
	public List<DepartmentModel> getAll() throws Exception;
	public DepartmentModel getByNum(int num) throws Exception;
}
