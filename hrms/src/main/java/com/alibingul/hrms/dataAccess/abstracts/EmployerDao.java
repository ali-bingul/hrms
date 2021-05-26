package com.alibingul.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alibingul.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

}
