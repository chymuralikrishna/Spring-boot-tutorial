package com.mk.Springboottutorial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.Springboottutorial.dao.DepartmentDao;
import com.mk.Springboottutorial.entity.Department;
import com.mk.Springboottutorial.entity.DepartmentNotFoundException;

@Service
public class DemartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;
	public void saveDepartment(Department department) {
		departmentDao.save(department);
	}
	
	@Override
	public List<Department> findAll() {
		return departmentDao.findAll();
	}

	@Override
	public Department find(Long id) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		Optional<Department> dept= departmentDao.findById(id);
		if(!dept.isPresent()) {
			throw new DepartmentNotFoundException("department is not available");
			
		}
		return dept.get();
			
	}

	@Override
	public void updateDepartment(Department department) {
		departmentDao.save(department);
		
	}

	@Override
	public void deleteDepartments(Department department){
		departmentDao.delete(department);
		
	}

	@Override
	public void deleteDepartmentsById(Long id) {
		departmentDao.deleteById(id);
		
	}

	@Override
	public void updateDepartment(Long id, Department department) {
		Department dept=departmentDao.findById(id).get();
		dept.setName(department.getName());
		dept.setCode(department.getCode());
		dept.setAddress(department.getAddress());
		departmentDao.save(dept);
	}
}
