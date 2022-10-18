package com.nazmul.model;

import java.io.Serializable;

public class JwtRequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;
	
	private String name;
	private String id;
	private String validated;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValidated() {
		return validated;
	}

	public void setValidated(String validated) {
		this.validated = validated;
	}

	//need default constructor for JSON Parsing
	public JwtRequest()
	{
		
	}

	public JwtRequest(String name, String id, String validated) {
		this.setName(name);
		this.setId(id);
		this.setValidated(validated);
	}

}