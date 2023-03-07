package com.mk.Springboottutorial.service;

import java.util.List;

import com.mk.Springboottutorial.entity.Department;
import com.mk.Springboottutorial.entity.DepartmentNotFoundException;

public interface DepartmentService {

	Department saveDepartment(Department department);

	List<Department> findAll();

	Department find(Long id) throws DepartmentNotFoundException;
	
	void updateDepartment(Department department);
	
	void deleteDepartments(Department department);

	void deleteDepartmentsById(Long id);

	void updateDepartment(Long id, Department department);

}
