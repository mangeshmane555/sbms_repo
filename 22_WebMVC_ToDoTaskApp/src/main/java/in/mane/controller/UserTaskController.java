package in.mane.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.mane.binding.UserTask;
import in.mane.entity.UserRegistrationEntity;
import in.mane.entity.UserTaskEntity;
import in.mane.repository.UserRegistrationRepository;
import in.mane.repository.UserTaskRepository;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserTaskController {

	// Task Repository
	@Autowired
	UserTaskRepository userTaskRepo;

	@Autowired
	UserRegistrationRepository userRegistrationRepo;

	@GetMapping("/taskForm")
	public String loadTaskForm(Model model) {

		// Bind createTask form using the model attribute "taskData" & controller is
		// providing it
		model.addAttribute("taskData", new UserTask());
		return "createTask";
	}

	@PostMapping("/saveTask")
	public String handleTaskSubmitBtn(UserTask user_task, Model model, HttpSession session) {

		String userEmail = (String) session.getAttribute("userEmail");

		UserRegistrationEntity userEntity = userRegistrationRepo.findByUserEmail(userEmail);
		UserTaskEntity taskEntity = new UserTaskEntity();
		taskEntity.setUserReg(userEntity);

		System.out.println(user_task);

		taskEntity.setTaskName(user_task.getTaskName());
		taskEntity.setTaskDate(user_task.getTaskDate());
		taskEntity.setTaskTime(user_task.getTaskTime());
		//
//		String userEmail = (String)session.getAttribute("userEmail"); 
		// Find userId using userEmail

		userTaskRepo.save(taskEntity);
		System.out.println("Task Inserted");

		model.addAttribute("msg", "New Task Created !! ");
		model.addAttribute("taskData", new UserTask());
		return "createTask";
//			
	}
	@GetMapping("/viewTask")
	public String viewTask(Model model) {
	List<UserTaskEntity> taskList = userTaskRepo.findAll();
	model.addAttribute("tasks", taskList);
	return "taskDashboard";
	
}


}
