package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Work;

@Repository
public interface WorkRepository extends JpaRepository<Work, Long> {
	 long countByStatus(String status);
}
