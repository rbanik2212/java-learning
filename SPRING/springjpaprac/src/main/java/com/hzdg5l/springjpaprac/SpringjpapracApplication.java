package com.hzdg5l.springjpaprac;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.hzdg5l.springjpaprac.dao.StudentDAO;
import com.hzdg5l.springjpaprac.entity.Student;

@SpringBootApplication
public class SpringjpapracApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjpapracApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			System.out.println("Hello world");
//			createStudent(studentDAO);
//			retrieveStudent(studentDAO);
//			findAllStudents(studentDAO);
//			queryByLastName(studentDAO);
//			updateLastName(studentDAO);
//			removeStudent(studentDAO);
			removeAllStudents(studentDAO);

		};
	}

	private void removeAllStudents(StudentDAO studentDAO) {
		System.out.println("DELETING ALL STUDENTS");
		studentDAO.deleteAll();
	}

	private void removeStudent(StudentDAO studentDAO) {
		int id = 2;
		studentDAO.delete(id);

	}

	private void updateLastName(StudentDAO studentDAO) {
		int id = 2;

		Student student = studentDAO.findById(id);

		student.setLastName("Banik2");

		studentDAO.update(student);

	}

	private void queryByLastName(StudentDAO studentDAO) {
		List<Student> studentLastName =  studentDAO.findByLastName("Banik");

		for(Student s: studentLastName ){
			System.out.println(s);
		}
	}

	private void findAllStudents(StudentDAO studentDAO) {
		System.out.println("Querying students");
		List<Student> studentsList =  studentDAO.findAll();

		System.out.println(studentsList);

	}

	private void retrieveStudent(StudentDAO studentDAO) {

		System.out.println("Creating Student");
		Student student = new Student("Ishan", "banik", "ibanik2212@gmail.com");

		System.out.println("Saving student");
		studentDAO.save(student);

		System.out.println("Studnet id is: " + student.getId());

		Student ishan = studentDAO.findById(student.getId());

		System.out.println(ishan);

	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("creating student");
		Student student = new Student("Rajdeep", "Banik", "rbanik2212@gmail.com");

		System.out.println("Saving student");
		studentDAO.save(student);

		System.out.println("student current id: " + student.getId());
	}



}
