package com.example.demospringbootcustomexceptions.student;

import com.example.demospringbootcustomexceptions.exception.ApiRequestException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        throw new ApiRequestException("Cannot get all students, here's a custom exception");
        //return null;
    }

}
