package com.nazmul.controller;

import com.nazmul.model.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin()
public class RestController {

	@Autowired
	private UserDetailsImpl userDetailsImpl;

	@RequestMapping({ "/get" })
	public Integer get() {
		String payload = "name: "+userDetailsImpl.getName()+" id: "+userDetailsImpl.getId()+" validate: "+userDetailsImpl.getValidated();
		System.out.println(payload);
		return 1;
	}

	@RequestMapping({ "/get-all" })
	public ArrayList<Integer> getAll() {
		String payload = "name: "+userDetailsImpl.getName()+" id: "+userDetailsImpl.getId()+" validate: "+userDetailsImpl.getValidated();
		System.out.println(payload);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		return list;
	}

}
