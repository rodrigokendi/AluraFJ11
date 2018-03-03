package br.com.caelum.contas.modelo;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private String cargo;
	private int matricula;
	
	
	
	public Funcionario(String nome, String cpf, String cargo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		geraMatricula();
	}
	
	public Funcionario() {
		geraMatricula();	
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getMatricula() {
		return matricula;
	}

	public void geraMatricula(){
		matricula+=1;
	}
	
	

}
