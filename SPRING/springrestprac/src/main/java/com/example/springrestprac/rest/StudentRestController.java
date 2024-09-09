package com.example.springrestprac.rest;

import java.util.ArrayList;
import java.util.List;
import javax.swing.plaf.LabelUI;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springrestprac.entity.Student;
import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> theStudents;


    /* will call once before construct*/
    @PostConstruct
    public void loadData() {
        this.theStudents = new ArrayList<>();
        this.theStudents.add(new Student("Rajdeep", "Banik"));
        this.theStudents.add(new Student("Ishan", "Banik"));

    }


    @GetMapping("/students")
    public List<Student> getStudents() {

        /* These object can be gotten and viewed in json format dur to the JACKSON project
         * must have getter and setter with the object in this example the Student entity
         * */

        return theStudents;
    }


    @GetMapping("/students/{studentId}")
//    @PathVariable studentId should match
    public Student getStudent(@PathVariable int studentId) {


        if(studentId >= theStudents.size() || (studentId < 0)){
            throw new StudentNotFoundException("Student id not found -" + studentId);
        }

        return this.theStudents.get(studentId);
    }



}
