package com.mk.Springboottutorial.controller;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mk.Springboottutorial.entity.Department;
import com.mk.Springboottutorial.entity.DepartmentNotFoundException;
import com.mk.Springboottutorial.service.DepartmentService;
//@CrossOrigin(origins = "*")
@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/departments/add")
	public Department saveDepartment(@Valid @RequestBody Department department) {
		departmentService.saveDepartment(department);
		return department;
	}
	
	@GetMapping("/departments/viewall")
	public List<Department> viewAllDepartment(){
		return departmentService.findAll(); 
	}
	
	@GetMapping("/departments/findbyid/{id}")
	public Department findByid(@PathVariable("id") Long did) throws DepartmentNotFoundException{
		return departmentService.find(did); 
	}
	
	@PutMapping("/departments/update/{id}")
	public void update(@PathVariable("id") Long id,@RequestBody Department department){
		departmentService.updateDepartment(id,department); 
	}
	
	@DeleteMapping("/departments/delete/{id}")
	public void deleteDepartment(@PathVariable Long id){
		departmentService.deleteDepartmentsById(id); 
		assertEquals(0, 0);
	}
}
