package com.study;

import java.util.List;

import org.springframework.stereotype.Service;

public class DemoService {

	private DemoService2 demoService2;
	private List<Integer> demoList;
	
	public void printPropertyService() {
		System.out.println("demoService2="+demoService2);
	}

	public DemoService2 getService2() {
		return demoService2;
	}

	public void setService2(DemoService2 demoService2) {
		this.demoService2 = demoService2;
	}

	public List<Integer> getDemoList() {
		return demoList;
	}

	public void setDemoList(List<Integer> demoList) {
		this.demoList = demoList;
	}
	
	
}
