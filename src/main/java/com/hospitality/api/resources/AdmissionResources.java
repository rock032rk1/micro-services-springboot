package com.hospitality.api.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hospitality.api.model.DiseasesList;
import com.hospitality.api.model.EmployeesList;
import com.hospitality.api.model.Patient;

@RestController
@RequestMapping("/admissions")
public class AdmissionResources {

	@Autowired
	private RestTemplate restTemplate;
	
	List<Patient> patients=Arrays.asList(
			new Patient("p1", "Atul", "Indian"),
			new Patient("p2", "Nobita", "japanese"),
			new Patient("p3", "Mark", "American"));
	
	
	@RequestMapping("/patients")
	public List<Patient> getPatient(){
		
		return patients;
	}
	
	@RequestMapping("/physcians")
	public EmployeesList getPhyscians() {
//		EmployeesList employeesList=restTemplate.getForObject("http://localhost:8082/hr/employees", EmployeesList.class);
		EmployeesList employeesList=restTemplate.getForObject("http://hr-service/hr/employees", EmployeesList.class);
		return employeesList;
	}
	
	@RequestMapping("/diseases")
	public DiseasesList getDiseases() {
		DiseasesList diseasesList=restTemplate.getForObject("http://pathology-service/pathology/diseases", DiseasesList.class);
		
		return diseasesList;
	}
	
	
	@RequestMapping("/patients/{id}")
	public Patient getPatientById(@PathVariable("id") String id) {
		
		Patient p=patients.stream()
				.filter(patient->id.equals(patient.getId()))
				.findAny()
				.orElse(null);
		
		return p;
	}
}
