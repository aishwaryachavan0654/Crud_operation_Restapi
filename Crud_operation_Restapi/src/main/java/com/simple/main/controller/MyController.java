package com.simple.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simple.main.model.Student;
import com.simple.main.serviceinter.Serviceinter;

@RestController
public class MyController {

	
	@Autowired
	private Serviceinter si;
	
	
	@PostMapping("/POST")
	public String postdata(@RequestBody Student s) {
		
		si.savestudentdata(s);
		
		return "Data Posted Sucessfully";
		
	}
	
	@PutMapping("/POST/{sid}")
	public String updatedata(@RequestBody Student s,@PathVariable int sid) {
		si.updatedata(s,sid);
		
		return "Data Updated Sucessfully";
	}
	
	@GetMapping("/GET")
	public List<Student> getallstudentd(){
		
		Iterable<Student> l=si.getalldata();
		return (List<Student>) l;
	}
	
	@DeleteMapping("DELETE/{sid}")
	public String deletebyid(@PathVariable int sid) {
		
		si.deletebyid(sid);
		return "Delete Data Sucessfully";
		
	}
	
}
