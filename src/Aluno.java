import java.util.*;

public class Aluno {
	private String nome;
	private int idade;
	private String sexo;
	private int matricula;
	
	public Aluno(String nome, int idade, String sexo, int matricula) {
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setMatricula(matricula);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
}