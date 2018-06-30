package cn.gov.pbc.java.test;

import java.util.Date;

public class WorkSeqenceDto {
	private String workid;
	private String workname;
	private Date date;
	private float time;
	public String getWorkid() {
		return workid;
	}
	public String getWorkname() {
		return workname;
	}
	public Date getDate() {
		return date;
	}
	public float getTime() {
		return time;
	}
	public void setWorkid(String workid) {
		this.workid = workid;
	}
	public void setWorkname(String workname) {
		this.workname = workname;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setTime(float time) {
		this.time = time;
	}
	
}
