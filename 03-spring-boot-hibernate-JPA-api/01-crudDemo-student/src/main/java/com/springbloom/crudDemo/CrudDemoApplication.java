package com.springbloom.crudDemo;

import com.springbloom.crudDemo.entity.Student;
import com.springbloom.crudDemo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return runner -> createStudent(studentRepository);
	}

	private void getAllStudents(StudentRepository studentRepository) {
		List<Student> listOfStudent = studentRepository.findAll();
		System.out.println("List of all student = "+listOfStudent);
	}

	private void updateStudent(StudentRepository studentRepository) {
		Student theStudent =studentRepository.findById(1);
		theStudent.setEmail("gopalps.668@gmail.com");
		studentRepository.update(theStudent);
	}

	private void updateStudentsByLastName(StudentRepository studentRepository) {
		int numberOfStudentUpdated = studentRepository.updateByLastName("Sharma");
		System.out.println("Number of Students are updated = "+numberOfStudentUpdated);
	}
	private void findStudentsByLastName(StudentRepository studentRepository) {
		List<Student> listOfStudent = studentRepository.findByLastName("Sharma");
		System.out.println("List of all student = "+listOfStudent);
	}

	private void readStudent(StudentRepository studentRepository) {
		Student student1=new Student("Gopal","Sharma","gnsharma920@gmail.com");
		Student student2=new Student("Rohan","Shah","imrohanshah@gmail.com");

		studentRepository.save(student1);
		System.out.println("Student saved successfully StudentDetails= "+student1);
		studentRepository.save(student2);
		System.out.println("Student saved successfully StudentDetails= "+student2);

		Student theStudent =studentRepository.findById(student1.getId());
		System.out.println("StudentDetails= "+theStudent);

	}
	private void createStudent(StudentRepository studentRepository){
		Student student1=new Student("Gopal","Sharma","gnsharma920@gmail.com");
		Student student2=new Student("Rohan","Shah","imrohanshah@gmail.com");

		studentRepository.save(student1);
		System.out.println("Student saved successfully StudentDetails= "+student1);
		studentRepository.save(student2);
		System.out.println("Student saved successfully StudentDetails= "+student2);
	}

	private void deleteStudent(StudentRepository studentRepository) {
		studentRepository.remove();
	}

	private void deleteStudentById(StudentRepository studentRepository) {
		studentRepository.removeById(3);
	}
}
