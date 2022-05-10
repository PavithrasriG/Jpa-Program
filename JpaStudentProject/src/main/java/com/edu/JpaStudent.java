package com.edu;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class JpaStudent {

	@Id
	private int sid;
	private String sname;
	private String scourse;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSCourse() {
		return scourse;
	}
	public void setSCourse(String scourse) {
		this.scourse = scourse;
	}
	@Override
	public String toString() {
		return "JpaStudent [sid=" + sid + ", sname=" + sname + ", scourse=" + scourse + "]";
	}
}
