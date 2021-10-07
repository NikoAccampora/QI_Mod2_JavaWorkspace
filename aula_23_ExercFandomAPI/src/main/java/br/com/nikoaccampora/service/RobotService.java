package br.com.nikoaccampora.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.nikoaccampora.model.RobotMaster;

@Service
public class RobotService {
	    private List<RobotMaster> RobotList = new ArrayList<RobotMaster>();
		
	    
	    
	    RobotService(){
	    	RobotList.add(
	    	         new RobotMaster("Mega Man","Mega Man","DLN. 001","Dr. Light","Mega Buster","Spikes")		
	    	);
	    	RobotList.add(
	   	         	 new RobotMaster("Roll","Mega Man","DLN. 002","Dr. Light","Broomstick","Cockroaches")		
	    	);
	    }
	    
	 public List<RobotMaster> findAll(){
		 return this.RobotList;
	 }
	 
	 public RobotMaster findOne(String name) {
		 for(RobotMaster robotMaster : RobotList) {
	    	   if(robotMaster.name.equalsIgnoreCase(name)) {
	    		   return robotMaster;
	    	   }
	       }
	    return null;
	 }
	 
	 public Map<String, String> insert(RobotMaster robotMaster){
		 Map<String, String> result = new HashMap<String, String>();
		  boolean isSuccess = RobotList.add(robotMaster);
		  if(isSuccess) {
			  result.put("result", "Robot added successfully!");
		  }else {
			  result.put("result", "ERROR!!! Could not be added!");
		  }
		  return result;	
	 }	 
	 
	 public Map<String,String> edit(RobotMaster robotMaster){
		  Map<String,String> result = new HashMap<String, String>();
		  
		  for(RobotMaster element : RobotList) {
	   	   if(element.name.equalsIgnoreCase(robotMaster.name)) {
	   		   int index = RobotList.indexOf(element);
	   		   RobotList.set(index, robotMaster);
	   		   result.put("result", "Edit successful!");
	   		   return result;
	   	  }   
	   	}
		  result.put("result", "ERROR!!! Could not edit!");
		  return result;

	 }
	 
	 public Map<String,String> remove(String name){
		  Map<String,String> result = new HashMap<String, String>();
		  boolean isSuccess = RobotList.removeIf(
				  (robotMaster)->robotMaster.name.equalsIgnoreCase(name)
		  );
		  if(isSuccess) {
			  result.put("result", "Robot Master removed.");
		  } else {
			  result.put("result", "ERROR!!! Could not remove!");
		  }
		  return result;
	   }
}
