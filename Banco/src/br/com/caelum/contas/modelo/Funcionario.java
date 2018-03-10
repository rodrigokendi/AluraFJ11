package br.com.caelum.contas.modelo;

public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	private int matricula;
	
	
	
	public Funcionario(String nome, String cpf, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
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
	
	public double getSalario() {
		return salario;
	}
	
	public void setSAlario(double salario) {
		this.salario = salario;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void geraMatricula(){
		matricula+=1;
	}
	
	public abstract double getBonificacao();
	
	

}
