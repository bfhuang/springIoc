package com.spring.ioc;


public class Person {
//	@Value("#{settings[name]}")
	private String name;

	Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
