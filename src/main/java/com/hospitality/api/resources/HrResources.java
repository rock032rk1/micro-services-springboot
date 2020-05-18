package com.hospitality.api.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitality.api.model.Employee;
import com.hospitality.api.model.EmployeesList;

@RestController
@RequestMapping("/hr")
public class HrResources {

     List<Employee> employees=Arrays.asList(
    		 new Employee("e1", "Rakesh", "Maraskolhe", "Surgery"),
 			new Employee("e2", "Prakash", "Bisen", "MediTech"),
 			new Employee("e3", "Satish", "Barapatre", "Mr"));
     
//     @RequestMapping("/employees")
//     public List<Employee> getEmployees(){
//    	 
//    	 return employees;
//     }
     
     @RequestMapping("/employees")
     public EmployeesList getEmployees(){
    	 
    	 EmployeesList employeesList=new EmployeesList();
    	 employeesList.setEmployees(employees);
    	 
    	 return employeesList;
     }
     
     @RequestMapping("/employees/{Id}")
     public Employee getEmployeeById(@PathVariable("Id") String Id) {
    	 
    	 Employee e=employees.stream()
    			 .filter(employee->Id.equals(employee.getId()))
    			 .findAny()
    			 .orElse(null);
    	 
    	 return e;
     }
}
