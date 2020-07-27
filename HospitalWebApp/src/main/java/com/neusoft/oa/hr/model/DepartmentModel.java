package com.neusoft.oa.hr.model;

import java.io.Serializable;
import org.apache.ibatis.type.Alias;


@Alias("Department")
public class DepartmentModel implements Serializable {
	private int num = 0;
	private String name = null;
	private String code = null;
	
	

	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
