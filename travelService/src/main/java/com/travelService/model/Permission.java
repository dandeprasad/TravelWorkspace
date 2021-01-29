package com.travelService.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Permission  {

	private String name;

	@Id
	private int ID;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
