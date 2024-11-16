package com.example.its.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/task")
public class TaskController {
	
	@GetMapping()
	public String createTask() {
		return "task/taskForm";
	}
}

