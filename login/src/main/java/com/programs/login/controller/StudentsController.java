package com.programs.login.controller;

import com.programs.login.entity.students;
import com.programs.login.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentsController
{
    @RequestMapping("/home")
    public String home()
    {
        return "input";
    }
    @Autowired
    StudentRepo studentRepo;
    @RequestMapping("/update")
    public String update(@RequestParam String name,
                         @RequestParam String dept,
                         @RequestParam int year,
                         @RequestParam String address)
    {
        students student=new students(name,dept,year,address);
        studentRepo.save(student);
        return "add";
    }
}
