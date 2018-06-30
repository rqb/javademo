package cn.gov.pbc.java.test;

import java.util.ArrayList;
import java.util.List;

public class WorkSeqenceReportDto {
	private String workid;
	
	private String workname;
	
	List list1 = new ArrayList();
	
	List list2 = new ArrayList();

	public String getWorkid() {
		return workid;
	}

	public String getWorkname() {
		return workname;
	}

	public List getList1() {
		return list1;
	}

	public List getList2() {
		return list2;
	}

	public void setWorkid(String workid) {
		this.workid = workid;
	}

	public void setWorkname(String workname) {
		this.workname = workname;
	}

	public void setList1(List list1) {
		this.list1 = list1;
	}

	public void setList2(List list2) {
		this.list2 = list2;
	}
}
