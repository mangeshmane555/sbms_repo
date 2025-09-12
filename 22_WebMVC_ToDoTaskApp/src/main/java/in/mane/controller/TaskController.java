package in.mane.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.mane.binding.UserTask;

@Controller
public class TaskController {

	@GetMapping("/taskForm")
	public String loadTaskForm(Model model) {
		model.addAttribute("taskData", new UserTask());

		return "createTask";

	}


	@PostMapping("/saveTask")
	public String handleTaskSubmitBtn(UserTask user_task, Model model) {

		System.out.println(user_task);
		
		model.addAttribute("taskMsg", "Task Created !! ");
		
		return "index";
	}

	
	
}
