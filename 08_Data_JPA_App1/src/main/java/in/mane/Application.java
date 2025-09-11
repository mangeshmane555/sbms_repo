package in.mane;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.mane.entity.Product;
import in.mane.entity.Student;
import in.mane.repository.ProductRepository;
import in.mane.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		ProductRepository productRepo = context.getBean(ProductRepository.class);
		
		
		//System.out.println(studentRepository.getClass().getName()); // jdk.proxy2.$Proxy97
		
		/*
		 * // Inserting / Updating record ==================================== 
		Student s = new Student();
		s.setId(4);
		s.setName("Sam");
		s.setGender("Male");
		s.setRank(88887l);
		
		studentRepository.save(s);
		System.out.println("Record Inserted");
		*/
		
		/*
		// Saving multiple records ==============================================
		Student s1 = new Student(101, "Sachin", 1111l, "Male");
		Student s2 = new Student(102, "Virat", 2222l, "Male");
		Student s3 = new Student(102, "Siya", 3333l, "Female");
		Student s4 = new Student(103, "Siraj", 4443l, "Male");
		Student s5 = new Student(104, "Sayna", 5555l, "Female");
		Student s6 = new Student(105, "Smriti", 5555l, "Female");
		
		List<Student> student_list = Arrays.asList(s1, s2, s3, s4,s5, s6);
		
		studentRepository.saveAll(student_list);
		*/
		
		
		// Fetching record by findById() ==============================================
		/*Optional<Student> optional = studentRepository.findById(1);
		if(optional.isPresent())
		{
			System.out.println(optional.get());
		}else {
			System.out.println("Record Not Found");
		}
		*/
		
		/*
		// Fetching record by findAll() ======================================================
		Iterable<Student> findAll= studentRepository.findAll();
		findAll.forEach(s-> System.out.println(s));
//		findAll.forEach(System.out::println);
		*/
		/*
		List<Student> male_list = studentRepository.findByGender("Female");
		male_list.forEach(s-> System.out.println(s));
		*/
		/*
		//byRankGreaterThanEqual
		List<Student> byRankGreaterThanEqual = studentRepository.findByRankGreaterThanEqual(7000l);
		byRankGreaterThanEqual.forEach(s-> System.out.println(s));
		*/
		
		/*//findByRankLessThanEqual
		//findByRankLessThanEqual
		List<Student> findByRankLessThanEqual = studentRepository.findByRankLessThanEqual(7000l);
		findByRankLessThanEqual.forEach(s->System.out.println(s));
		*/
		
		/*
		List<Student> byGenderAndRankGreaterThanEqual_list = studentRepository.findByGenderAndRankGreaterThanEqual("Male", 6000l);
		byGenderAndRankGreaterThanEqual_list.forEach(s-> System.out.println(s));
		*/
		
		/*
		long count = studentRepository.count();
		System.out.println("Total records present "+count);
		*/
		
		/*
		// Check record is present or not ==============================================
		if (studentRepository.existsById(3)) {
			studentRepository.deleteById(3);
			System.out.println("Record deleted..");
		}
		else {
			System.out.println("Record not exist..");
		}
		*/
		
		/*
		// Deleting record by deleteById() ==============================================
		studentRepository.deleteById(78);
		System.out.println("Record deleted successfully");
		*/
		 
		/*// Using Native Query
		List<Student> allStudents = studentRepository.getAllStudents();
		allStudents.forEach(s-> System.out.println(s));
		*/
		
		/*
		// Using HQL
		List<Student> students = studentRepository.getStudents();
		for (Student student : students) {
			System.out.println(student);
		}
		*/
		/*
		// Pagging  ==============================================
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter Page Number");
		
		int pageNo = s.nextInt();
		int pageSize = 3;
		// Page will start from 0
		PageRequest pageReq = PageRequest.of(pageNo-1, pageSize);
		
		Page<Student> pageAll = studentRepository.findAll(pageReq);
		
		List<Student> students= pageAll.getContent();
		students.forEach(k-> System.out.println(k));
		*/
		
		/*
		// Sorting  ==============================================
		List<Student> students = studentRepository.findAll(Sort.by("name").descending());
		students.forEach(k-> System.out.println(k));
		*/
		
		/*
		// QueryByExample ==============================================
		
		Student s = new Student();
		s.setGender("male");
		s.setRank(4443l);

		Example<Student> example = Example.of(s);		
		
		List<Student> students = studentRepository.findAll(example);
		students.forEach(k-> System.out.println(k));
		*/
		/*
		// Deleting record by custom query ==============================================
		studentRepository.deleteStudent(106);
		System.out.println("Record Deleted");
		*/
		/*
		// Updating record by custom query ==============================================
		studentRepository.updateStudent(103, 4444l);
		System.out.println("Record Updated ");
		*/
		
		/*
		// Updating record by custom query using native query and not possible by HQL==========
		studentRepository.insertStudent(106, "Rohit", "male", 6666l);
		System.out.println("Record Inserted ...");
		*/
	
		/*
		Optional<Student> studentOpt = studentRepository.findById(101);
		Student student = studentOpt.get();
		student.setActiveSW("N");
		studentRepository.save(student);
		*/
		
		//===================================================================
		
		Product p = new Product();
		
		p.setProductName("Mouse");
		p.setProductPrice(140.00);
		productRepo.save(p);
		System.out.println("Record Inserted");
		
	}

}
