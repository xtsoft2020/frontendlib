package com.neusoft.oa.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.oa.hr.model.DepartmentModel;
import com.neusoft.oa.hr.service.IDepartmentService;
import com.neusoft.oa.result.Result;



@RestController
@RequestMapping(value = "/department")
public class DepartmentController {
	@Autowired
	private IDepartmentService ds = null;
	
	@PostMapping(value = "/add")
	public Result<String> Add(DepartmentModel dm) throws Exception{
		ds.add(dm);
		
		Result<String> result = new Result<String>();
		result.setStatus("OK");
		result.setMessage("add success");
		return result;
	}
	
	@PostMapping(value = "/modify")
	public Result<String> Modify(DepartmentModel dm) throws Exception{
		ds.modify(dm);
		
		Result<String> result = new Result<String>();
		result.setStatus("200");
		result.setMessage("modify success");
		return result;
	}
	
	@PostMapping(value = "/delete")
	public Result<String> Delete(DepartmentModel dm) throws Exception{
		ds.delete(dm);
		
		Result<String> result = new Result<String>();
		result.setStatus("200");
		result.setMessage("delete success");
		return result;
	}
	
	@RequestMapping(value = "/getall")
	public Result<DepartmentModel> getAll(Model model) throws Exception{
		List<DepartmentModel> list = ds.getAll();
		Result<DepartmentModel> result = new Result<DepartmentModel>();
		result.setList(list);
		result.setMessage("success");
		return result;
	}
}
