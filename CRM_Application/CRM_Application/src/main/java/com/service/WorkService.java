package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Work;
import com.repository.WorkRepository;


@Service
public class WorkService {

    @Autowired
    private WorkRepository taskRepository;

   
    public List<Work> getAllTasks() {
        return taskRepository.findAll();
    }

    public Work createTask(Work task) {
        return taskRepository.save(task);
    }

    public Work updateTask(Long taskId, Work taskDetails) {
        // Find the task by ID; return null if not found
        Work task = taskRepository.findById(taskId).orElse(null);

        if (task != null) {
            // Update task fields with new details
            task.setTitle(taskDetails.getTitle());
            task.setDescription(taskDetails.getDescription());
            task.setDeadline(taskDetails.getDeadline());
            task.setPriority(taskDetails.getPriority());
            task.setStatus(taskDetails.getStatus());
            return taskRepository.save(task); 

        }
        return null;

    }

  
    public void deleteTask(Long taskId) {
        taskRepository.deleteById(taskId);
    }

    
    public Work getTaskById(Long taskId) {
        return taskRepository.getById(taskId);
    }
}
