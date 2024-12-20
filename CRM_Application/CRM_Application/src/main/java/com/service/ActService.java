package com.service;

import com.entities.ActivityLog;
import com.repository.ActRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActService {

	@Autowired
	private ActRepository activityLogRepository;

	public List<ActivityLog> getLogs() {
		return activityLogRepository.findAll();
	}

	public ActivityLog logAction(ActivityLog log) {
		return activityLogRepository.save(log);
	}

	public ActivityLog getActivityLogById(Long id) {
		return activityLogRepository.findById(id).orElse(null); 
		
		
	}
}
