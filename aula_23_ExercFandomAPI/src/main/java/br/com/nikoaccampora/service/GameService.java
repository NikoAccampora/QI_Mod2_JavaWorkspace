package br.com.nikoaccampora.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.nikoaccampora.model.Game;

@Service
public class GameService {
	    private List<Game> GameList = new ArrayList<Game>();
		
	    
	    
	    GameService(){
	    	Game mm1;
			GameList.add(
	    	      mm1 = new Game("Mega Man","11")		
	    	);
			Game mm2;
			GameList.add(
	   	          mm2 = new Game("Mega Man 2","22")			
	    	);
	    }
	    
	 public List<Game> findAll(){
		 return this.GameList;
	 }
	 
	 public Game findOne(Game game) {
		 for(Game obj_game : GameList) {
	    	   if((game.toString()).equalsIgnoreCase(game.toString())) {
	    		   return obj_game;
	    	   }
	       }
	    return null;
	 }
	 
	 public Map<String, String> insert(Character obj_game){
		 Map<String, String> result = new HashMap<String, String>();
		  boolean isSuccess = GameList.add(obj_game);
		  if(isSuccess) {
			  result.put("result", "Game added succuesfully!");
		  }else {
			  result.put("result", "ERROR!! Game couldn't be added!");
		  }
		  return result;	
	 }	 
	 
	 public Map<String,String> edit(Character obj_game){
		  Map<String,String> result = new HashMap<String, String>();
		  
		  for(Game element : GameList) {
	   	   if(element.title.equalsIgnoreCase(obj_game.title)) {
	   		   int index = GameList.indexOf(element);
	   		   GameList.set(index, obj_game);
	   		   result.put("result","Edit successful!");
	   		   return result;
	   	  }   
	   	}
		  result.put("result", "ERROR!! Could not edit!");
		  return result;

	 }
	 
	 public Map<String,String> remove(Game game){
		  Map<String,String> result = new HashMap<String, String>();
		  boolean isSuccess = GameList.removeIf((element)->element.equals(character));
		  if(isSuccess) {
			  result.put("result", "Remove Successfully!");
		  } else {
			  result.put("result", "ERROR: Could not be removed!");
		  }
		  return result;
	   }
}
