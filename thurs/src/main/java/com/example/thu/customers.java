package com.example.thu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class customers {
	private int custid;
	private String custname;
	private String custcourse;
	//Technologies techdetail;
	@Autowired
	Technologies techdetail;
	public Technologies getTechdetail() {
		return techdetail;
	}
	public void setTechdetail(Technologies techdetail) {
		this.techdetail = techdetail;
	}
		public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustcourse() {
		return custcourse;
	}
	public void setCustcourse(String custcourse) {
		this.custcourse = custcourse;
	}
	public void name() {
		System.out.println("I am working now good");
		techdetail.good();
	}

}
