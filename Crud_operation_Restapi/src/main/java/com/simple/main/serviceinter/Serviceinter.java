package com.simple.main.serviceinter;

import com.simple.main.model.Student;

public interface Serviceinter {

	void savestudentdata(Student s);
	
	void updatedata(Student s, int sid);
	
	Iterable<Student> getalldata();

	void deletebyid(int sid);



	

	

}
