package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.WorkRepository;

import java.util.HashMap;
import java.util.Map;


@Service
public class InformService {

    @Autowired
    private WorkRepository taskRepository; 

    
    public Map<String, Object> getTaskSummary() {
        // Count the number of tasks with "Completed" status
        long completedTasks = taskRepository.countByStatus("Completed");

        // Count the number of tasks with "Pending" status
        long pendingTasks = taskRepository.countByStatus("Pending");

        // Count the total number of tasks
        long totalTasks = taskRepository.count();

        // Create a report map to store the task summary
        Map<String, Object> report = new HashMap<>();
        report.put("Total Tasks", totalTasks);        
        report.put("Completed Tasks", completedTasks); 
        report.put("Pending Tasks", pendingTasks);    

        return report; 
    }
}
