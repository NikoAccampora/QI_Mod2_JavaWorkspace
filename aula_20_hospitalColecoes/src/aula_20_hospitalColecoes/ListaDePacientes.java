package aula_20_hospitalColecoes;

import java.util.ArrayList;

public class ListaDePacientes {
	
private ArrayList<Paciente> ListPacientes = new ArrayList<Paciente>();
	

	
	public void addPacientes(Paciente obj_paciente) {
		if(obj_paciente != null) {
		ListPacientes.add(obj_paciente);
		}
	}
	
	public void removePacientes(Paciente obj_paciente) {	
		ListPacientes.removeIf((list_thing)->list_thing.getNome().equalsIgnoreCase(obj_paciente.getNome()));
	}
	
	public Paciente buscar(Paciente obj_paciente) {
		for(Paciente list_thing : ListPacientes) {
			if(list_thing.getNome().equalsIgnoreCase(obj_paciente.getNome())) {
				return list_thing;
			}
		}
		
		return null;
	}
	
	public void editar(Paciente obj_paciente) { 
		int my_index = ListPacientes.indexOf(this.buscar(obj_paciente));
		if(my_index != -1) {
		ListPacientes.set(my_index, obj_paciente);
		}
	}
	
	public String listar(){
	    StringBuilder builder = new StringBuilder();
	    for(Paciente obj_paciente : this.ListPacientes) {
	    	builder.append(obj_paciente.toString());
	    }
		return builder.toString();
	} 

}
