package com.alibingul.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alibingul.hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer>{

}
