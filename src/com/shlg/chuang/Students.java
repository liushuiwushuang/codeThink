package com.shlg.chuang;

public class Students {

	private String name;
	
	private Long id;
	
	public Students() {
		super();
	}

	public Students(String name, Long id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
