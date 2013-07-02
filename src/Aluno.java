//import java.util.*;

public class Aluno {
	private String nome;
	private int idade;
	private String sexo;
	private int matricula;
	//private List<Nota> notas;
	//private List<Disciplina> disciplinas;
	
	public Aluno(String nome, int idade, String sexo, int matricula) {
		//this.notas = new ArrayList<>();
		//this.disciplinas = new ArrayList<>();
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setMatricula(matricula);
		//this.setNotas(notas);
		//this.setDisciplinas(disciplinas);
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

/*	metodos que não serão usados a principio. 
 * public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	 public String toString(){
		String s;
		s = "============================================";
		s += "\nNome: " + this.nome;
		s += "\nIdade: " + this.idade;
		s += "\nSexo: " + this.sexo;
		s += "\nMatricula: " + this.matricula;
		s += "\n=========================================";
		s += "\nNotas: " + this.notas;
		s += "\nDisciplinas: " + this.disciplinas;
		return s;
	}*/
}