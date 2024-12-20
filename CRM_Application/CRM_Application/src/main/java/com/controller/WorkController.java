package com.controller;

import com.entities.Work;
import com.service.WorkService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/crm.technothinksup.in/admin/work")
public class WorkController {

	@Autowired
	private WorkService taskService; // Service layer for handling task-related business logic

	@GetMapping
	public List<Work> getAllTasks() {
		return taskService.getAllTasks();
	}

	@PostMapping
	public Work createTask(@RequestBody Work task) {
		return taskService.createTask(task);
	}

	@PutMapping("/{id}")
	public Work updateTask(@PathVariable Long id, @RequestBody Work taskDetails) {
		return taskService.updateTask(id, taskDetails);
	}

	@DeleteMapping("/{id}")
	public void deleteTask(@PathVariable Long id) {
		taskService.deleteTask(id);
	}

	

}
