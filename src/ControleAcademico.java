import java.util.*;

public class ControleAcademico {
	private List<Aluno> alunos = new LinkedList<Aluno>();
	private static boolean primeiroAluno;
	
	public List<Aluno> getAlunos(){
		return alunos;
	}
	
	public void addAluno(Aluno aluno){
		if(this.alunos == null){
			this.setPrimeiroAluno(aluno);
		}
		else{
			alunos.add(aluno);
		}
	}
	
	public boolean getPrimeiroAluno(){
		return primeiroAluno;
	}
	
	public void setPrimeiroAluno(Aluno a) {
		alunos.add(a);
		primeiroAluno = true;
	}
	
	public String removerAluno(Aluno aluno){
		alunos.remove(aluno);
		return aluno.getNome();
		
	}
	
	public boolean getAlunoRemovido(Aluno a){
		if(a.equals(alunos)){
			return false;
		}
		return true;
	}
	
	public String procuraAlunoPorMatricula(int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				return a.getNome();
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public boolean procuraAlunoPormatriculaConfirmacao(int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				return true;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public String procuraAlunoPorNome(String nome){
		for(Aluno a : alunos){
			if(comparaNomeAluno(nome, a)){
				return a.getNome();
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public boolean procurarAlunoPorNomeConfirmacao(String nome){
		for(Aluno a : alunos){
			if(comparaNomeAluno(nome, a)){
				return true;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}

	private boolean comparaNomeAluno(String nome, Aluno a) {
		return comparandoNome(nome, a);
	}
	
	public String procurarAlunoPorCPF(int CPF){
		for(Aluno a : alunos){
			if(comparaCPF(CPF, a)){
				return a.getNome();
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public boolean procuraAlunoPorCPFConfirmacao(int CPF){
		for(Aluno a : alunos){
			if(comparaCPF(CPF, a)){
				return true;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}

	private boolean comparaCPF(int CPF, Aluno a) {
		return comparandoCPF(CPF, a);
	}
	
	public void setNomeAlunoPorMatricula(String nome, int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				a.setNome(nome);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");		
	}

	private boolean compararMatriculaAluno(int matricula, Aluno a) {
		return a.getMatricula() == matricula;
	}
	
	public void setIdadeAlunoPorMatricula(int idade, int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				a.setIdade(idade);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");		
	}
	
	public void setSexoAlunoPorMatricula(String sexo, int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				a.setSexo(sexo);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");		
	}
	
	public void setMatriculaAlunoPorMatricula(int novaMatricula, int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				a.setMatricula(novaMatricula);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setCPFAlunoPorMatricula(int CPF, int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				a.setCPF(CPF);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setEnderecoAlunoPorMatricula(String endereco, int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				a.setEndereco(endereco);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setNomeAlunoPorNome(String novoNome, String nome){
		for(Aluno a : alunos){
			if(comparandoNome(nome, a)){
				a.setNome(novoNome);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setIdadeAlunoPorNome(int idade, String nome){
		for(Aluno a : alunos){
			if(comparandoNome(nome, a)){
				a.setIdade(idade);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setSexoAlunoPorNome(String sexo, String nome){
		for(Aluno a : alunos){
			if(comparandoNome(nome, a)){
				a.setSexo(sexo);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setMatriculaAlunoPorNome(int matricula, String nome){
		for(Aluno a : alunos){
			if(comparandoNome(nome, a)){
				a.setMatricula(matricula);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setCPFAlunoPorNome(int CPF, String nome){
		for(Aluno a : alunos){
			if(comparandoNome(nome, a)){
				a.setCPF(CPF);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setEnderecoAlunoProNome(String endereco, String nome){
		for(Aluno a : alunos){
			if(comparandoNome(nome, a)){
				a.setEndereco(endereco);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}

	private boolean comparandoNome(String nome, Aluno a) {
		return a.getNome().equals(nome);
	}
	
	public void setNomeAlunoPorCPF(String nome, int CPF){
		for(Aluno a : alunos){
			if(comparandoCPF(CPF, a)){
				a.setNome(nome);
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setIdadeAlunoPorCPF(int idade, int CPF){
		for(Aluno a : alunos){
			if(comparandoCPF(CPF, a)){
				a.setIdade(idade);
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setSexoAlunoPorCPF(String sexo, int CPF){
		for(Aluno a : alunos){
			if(comparandoCPF(CPF, a)){
				a.setSexo(sexo);
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setMatriculaAlunoPorCPF(int matricula, int CPF){
		for(Aluno a : alunos){
			if(comparandoCPF(CPF, a)){
				a.setMatricula(matricula);
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setCPFalunoPorCPF(int novoCPF, int CPF){
		for(Aluno a : alunos){
			if(comparandoCPF(CPF, a)){
				a.setCPF(novoCPF);
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setEnderecoAlunoPorCPF(String endereco, int CPF){
		for(Aluno a : alunos){
			if(comparandoCPF(CPF, a)){
				a.setEndereco(endereco);
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	private boolean comparandoCPF(int CPF, Aluno a) {
		return a.getCPF() == CPF;
	}
	
	public String getNomeAluno(Aluno aluno){
		return aluno.getNome();
	}
	
	public int getIdadeAluno(Aluno aluno){
		return aluno.getIdade();
	}
	
	public String getSexoAluno(Aluno aluno){
		return aluno.getSexo();
	}
	
	public int getMatriculaAluno(Aluno aluno){
		return aluno.getMatricula();
	}
	
	public int getCPFAluno(Aluno aluno){
		return aluno.getCPF();
	}
	
	
}
