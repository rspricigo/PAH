package br.teste.pah;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TesteMB {
	
	private String nome = "Hello World";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = "Ola " +  nome + "!";
	}
	
	
	

}
