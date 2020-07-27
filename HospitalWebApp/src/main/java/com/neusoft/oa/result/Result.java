package com.neusoft.oa.result;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Result<T> {

private T result = null;
	
	private List<T> list = null;
	
	private int intResult = 0;
	
	private String stringResult = null;
	
	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getIntResult() {
		return intResult;
	}

	public void setIntResult(int intResult) {
		this.intResult = intResult;
	}

	public String getStringResult() {
		return stringResult;
	}

	public void setStringResult(String stringResult) {
		this.stringResult = stringResult;
	}

	public double getDoubleResult() {
		return doubleResult;
	}

	public void setDoubleResult(double doubleResult) {
		this.doubleResult = doubleResult;
	}

	public Date getDateResult() {
		return dateResult;
	}

	public void setDateResult(Date dateResult) {
		this.dateResult = dateResult;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private double doubleResult = 0;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateResult = null;
	
	private String status = null;
	
	private String message = null;
}
