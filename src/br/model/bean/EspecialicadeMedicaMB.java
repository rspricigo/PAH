package br.model.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.model.dao.EspecialidadeMedica;



@ManagedBean
public class EspecialicadeMedicaMB {
	
	private EspecialidadeMedica especialidade;

	
	
	

	
	@PostConstruct
	private void AlimentaEspecialidade(){
		especialidade = new EspecialidadeMedica();
		setEspecialidade("Ginecologia");
	}






	public String getEspecialidade() {
		return especialidade.getDsEspecialidade();
	}






	public void setEspecialidade(String especialidade) {
		this.especialidade.setDsEspecialidade(especialidade); 
	}
	
	
	
	

}
