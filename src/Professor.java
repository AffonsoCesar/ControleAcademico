
public class Professor {
	private String nome;
	private String materia;
	private int CPF;
	private String endereco;
	
	public Professor(String nome, String materia, int CPF, String endereco){
		this.setNome(nome);
		this.setMateria(materia);
		this.setCPF(CPF);
		this.setEndereco(endereco);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMateria() {
		return materia;
	}
	
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public int getCPF() {
		return CPF;
	}
	
	public void setCPF(int CPF) {
		this.CPF = CPF;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
