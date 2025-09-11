package in.mane.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.mane.binding.Student;
import in.mane.entity.StudentEntity;
import in.mane.repository.StudentRepository;

@Controller
public class StudentController {
	
	// Injecting the repository class for DB operations
	@Autowired
	private StudentRepository studentRepo;
	
	//Load form data 
	// Model for send the data from controller to Presentation Layer (UI)
	private void loadFormData(Model model) {
		
		List<String> coursesList = new ArrayList<>();
		coursesList.add("Java");
		coursesList.add("Devops");
		coursesList.add("AWS");
		coursesList.add("Python");
		
		List<String> timingsList = new ArrayList<>();
		timingsList.add("Morning");
		timingsList.add("Afternoon");
		timingsList.add("Evening");
//		List<String> timingsList = Arrays.asList("Morning", "Afternoon", "Evening"); // Working
		
		Student studentObj = new Student();
		
		model.addAttribute("courses", coursesList);
		model.addAttribute("timings", timingsList);
		model.addAttribute("student", studentObj);
	}
	
	@GetMapping("/")
	public String loadForm(Model model) {
		
		loadFormData(model);
		
		return "index";
	}
	
	//Save form data
		@PostMapping("/save")
		public String handleSubmit(Student s, Model model) {
			
			System.out.println(s);
			StudentEntity entity = new StudentEntity();
			
			entity.setTimings(Arrays.toString(s.getTimings()));
			
			// To Copy data from student object (s) to entity [s => entity] because save() expect entity
			BeanUtils.copyProperties(s, entity);
			studentRepo.save(entity);
			
			// Send Message
			model.addAttribute("msg", "Student Saved !");
			
			loadFormData(model);
			
			return "index";
		}
	
	//display form data
		
		@GetMapping("/viewStudents")
		public String getStudentsData(Model model) {
			
			List<StudentEntity> studentsList = studentRepo.findAll();
//			
			model.addAttribute("students", studentsList);
			
			return "data";
		}
		
		
		
		
	
}
