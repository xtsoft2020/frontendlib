package com.neusoft.oa.hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.oa.hr.mapper.IDepartmentMapper;
import com.neusoft.oa.hr.model.DepartmentModel;
import com.neusoft.oa.hr.service.IDepartmentService;

@Service
@Transactional
public class DepartmentServiceImpl implements IDepartmentService {

	@Autowired
	IDepartmentMapper departmentMapper = null;
	
	@Override
	public void add(DepartmentModel dm) throws Exception {
		
		
		departmentMapper.insert(dm);
		
	}

	@Override
	public void modify(DepartmentModel dm) throws Exception {
	
		
		departmentMapper.update(dm);
		
	}

	@Override
	public void delete(DepartmentModel dm) throws Exception {
	
	
		departmentMapper.delete(dm);
		
	}

	@Override
	public List<DepartmentModel> getAll() throws Exception {
		
		
		List<DepartmentModel> list= departmentMapper.selectByAll();
		
		return list;
	}

	@Override
	public DepartmentModel getByNum(int num) throws Exception {
		
		
		DepartmentModel dm = departmentMapper.selectByNum(num);
		
		return dm;
	}

	@Override
	public List<DepartmentModel> getAllWithPage(int rows, int page) throws Exception {
		
		
		List<DepartmentModel> list= departmentMapper.selectByAllWithPage(rows * (page - 1), rows);
		
		return list;
	}

	@Override
	public int getCountByAll() throws Exception {
		

		int count = departmentMapper.selectCountByAll();
		
		return count;
	}

	@Override
	public int getPageCount(int rows) throws Exception {
		int count = this.getCountByAll();
		int pageCount = 0;
		if(count % rows == 0) {
			pageCount = count / rows;
		}
		else {
			pageCount = count / rows + 1;
		}
		return pageCount;
	}

}
