package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;


@Service
public class StudentServices {

    private StudentRepo repo;

    public StudentRepo getRepo()
    {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s)
    {
        System.out.println("Added");
        repo.save(s);
    }
    public List<Student> getStudent() {
       List<Student>students=repo.findAll();

       for(Student i:students)
       {
        System.out.println(i.getName()+" "+i.getMarks()+" "+i.getRollno());
       }
       return students;
  
    }
    
}
