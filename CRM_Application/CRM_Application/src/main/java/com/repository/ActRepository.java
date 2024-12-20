package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.ActivityLog;

@Repository
public interface ActRepository extends JpaRepository<ActivityLog, Long> {
}
