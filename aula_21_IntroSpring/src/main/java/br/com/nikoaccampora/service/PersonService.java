package br.com.nikoaccampora.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.nikoaccampora.model.Person;

@Service
public class PersonService {
	    private List<Person> listOfPersons = new ArrayList<Person>();
		
	    
	    
	    PersonService(){
	    	listOfPersons.add(
	    	         new Person("nikolas","neto","21/08/1994","asdfzczcz@gmail.com")		
	    	);
	    	listOfPersons.add(
	   	         	 new Person("mike","rekierds","15/12/2006","sdsdadasfdaf@hotmail.com")			
	    	);
	    }
	    
	 public List<Person> findAll(){
		 return this.listOfPersons;
	 }
	 
	 public Person findOne(String name) {
		 for(Person person : listOfPersons) {
	    	   if(person.getName().equalsIgnoreCase(name)) {
	    		   return person;
	    	   }
	       }
	    return null;
	 }
	 
	 public Map<String, String> insert(Person person){
		 Map<String, String> result = new HashMap<String, String>();
		  boolean isSuccess = listOfPersons.add(person);
		  if(isSuccess) {
			  result.put("result", "Pessoa cadastrada com sucesso!!!");
		  }else {
			  result.put("result", "Não foi possível cadastrar a pessoa!!");
		  }
		  return result;	
	 }	 
	 
	 public Map<String,String> edit(Person person){
		  Map<String,String> result = new HashMap<String, String>();
		  
		  for(Person element : listOfPersons) {
	   	   if(element.getName().equalsIgnoreCase(person.getName())) {
	   		   int index = listOfPersons.indexOf(element);
	   		   listOfPersons.set(index, person);
	   		   result.put("result", "Pessoa editada com sucesso!!");
	   		   return result;
	   	  }   
	   	}
		  result.put("result", "Não foi possível editar!!");
		  return result;

	 }
	 
	 public Map<String,String> remove(String name){
		  Map<String,String> result = new HashMap<String, String>();
		  boolean isSuccess = listOfPersons.removeIf(
				  (person)->person.getName().equalsIgnoreCase(name)
		  );
		  if(isSuccess) {
			  result.put("result", "foi removida!");
		  } else {
			  result.put("result", "ERRO: NÃO foi removida!");
		  }
		  return result;
	   }
}
