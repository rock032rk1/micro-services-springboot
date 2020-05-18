package com.hospitality.api.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitality.api.model.Disease;
import com.hospitality.api.model.DiseasesList;

@RestController
@RequestMapping("/pathology")
public class PathologyResources {

	List<Disease> diseases=Arrays.asList(
			new Disease("d1", "Cancer", "Kimo Therepy"),
			new Disease("d2", "Maleria", "Drink Hot water"));
	
//	@RequestMapping("/diseases")
//	List<Disease> getDiseases(){
//		
//		return diseases;
//	}
	
	@RequestMapping("/diseases")
	public DiseasesList getDiseases(){
		
		DiseasesList diseasesList=new DiseasesList();
		diseasesList.setDiseases(diseases);
		
		return diseasesList;
	}
	
	@RequestMapping("/diseases/{Id}")
	public Disease getDiseaseById(@PathVariable("Id") String Id) {
		
		Disease d=diseases.stream()
				.filter(disease->Id.equals(disease.getId()))
				.findAny()
				.orElse(null);
		return d;
	}
}
