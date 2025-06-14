package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Student;
import com.example.demo.services.StudentServices;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Java kathukalam maame");

		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		Student s=context.getBean(Student.class);
		s.setRollno(123);
		s.setName("rahul");
		s.setMarks(100);
		StudentServices service=context.getBean(StudentServices.class);
		service.addStudent(s);
		List<Student>students=service.getStudent();
	}

}
