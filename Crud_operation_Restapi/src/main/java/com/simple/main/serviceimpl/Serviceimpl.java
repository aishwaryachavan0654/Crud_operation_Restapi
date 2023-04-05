package com.simple.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.main.dao.MyRepository;
import com.simple.main.model.Student;
import com.simple.main.serviceinter.Serviceinter;

@Service
public class Serviceimpl implements Serviceinter {

	@Autowired
	private MyRepository myrepo;
	
	@Override
	public void savestudentdata(Student s) {
		
		myrepo.save(s);
		
	}
	
	@Override
	public void updatedata(Student s, int sid) {
		
		myrepo.save(s);
		
	}
	
	@Override
	public Iterable<Student> getalldata() {
      
		return myrepo.findAll();
	}

	@Override
	public void deletebyid(int sid) {
		
		myrepo.deleteById(sid);
		
	}


	




	

}
