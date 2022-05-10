package com.mk.Springboottutorial.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mk.Springboottutorial.entity.Department;
@Repository
public interface DepartmentDao extends JpaRepository<Department, Long> {

}
