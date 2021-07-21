package org.example.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("test")
public class MyPropertiesBean {
	
	private int age;
	private String name;
	private innerProp innerProp;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public innerProp getInnerProp() {
		return innerProp;
	}
	public void setInnerProp(innerProp innerProp) {
		this.innerProp = innerProp;
	}

	public static class innerProp {
		private String innerName;
		
		public String getInnerName() {
			return innerName;
		}
		public void setInnerName(String innerName) {
			this.innerName = innerName;
		}
	}
}
