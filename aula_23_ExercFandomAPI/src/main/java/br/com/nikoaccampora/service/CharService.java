package br.com.nikoaccampora.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.nikoaccampora.model.Character;

@Service
public class CharService {
	    private List<Character> CharacterList = new ArrayList<Character>();
		
	    
	    
	    CharService(){
	    	Character megaman;
			CharacterList.add(
	    	      megaman = new Character("Mega Man","Robot",MM1)		
	    	);
			Character drlight;
			CharacterList.add(
	   	         drlight = new Character("Dr. Light","Human",MM1)			
	    	);
	    }
	    
	 public List<Character> findAll(){
		 return this.CharacterList;
	 }
	 
	 public Character findOne(Character character) {
		 for(Character obj_character : CharacterList) {
	    	   if((character.toString()).equalsIgnoreCase(character.toString())) {
	    		   return obj_character;
	    	   }
	       }
	    return null;
	 }
	 
	 public Map<String, String> insert(Character obj_character){
		 Map<String, String> result = new HashMap<String, String>();
		  boolean isSuccess = CharacterList.add(obj_character);
		  if(isSuccess) {
			  result.put("result", "Character added succuesfully!");
		  }else {
			  result.put("result", "ERROR!! Character couldn't be added!");
		  }
		  return result;	
	 }	 
	 
	 public Map<String,String> edit(Character obj_character){
		  Map<String,String> result = new HashMap<String, String>();
		  
		  for(Character element : CharacterList) {
	   	   if(element.name.equalsIgnoreCase(obj_character.name)) {
	   		   int index = CharacterList.indexOf(element);
	   		   CharacterList.set(index, obj_character);
	   		   result.put("result","Edit successful!");
	   		   return result;
	   	  }   
	   	}
		  result.put("result", "ERROR!! Could not edit!");
		  return result;

	 }
	 
	 public Map<String,String> remove(Character character){
		  Map<String,String> result = new HashMap<String, String>();
		  boolean isSuccess = CharacterList.removeIf((element)->element.equals(character));
		  if(isSuccess) {
			  result.put("result", "Remove Successfully!");
		  } else {
			  result.put("result", "ERROR: Could not be removed!");
		  }
		  return result;
	   }
}
